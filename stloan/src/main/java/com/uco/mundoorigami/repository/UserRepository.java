package com.uco.mundoorigami.repository;


import com.uco.mundoorigami.domain.User;
import com.uco.mundoorigami.model.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer>
{
    @Query(value = " SELECT * FROM USER WHERE STATUS = :status ", nativeQuery = true)
    List<UserEntity> findByStatus(@Param("status") String status);
    @Query(value = "SELECT * FROM USER WHERE email= :email ", nativeQuery = true)
    UserEntity findByEmail(@Param("email")String email);

    @Query(value = " SELECT * FROM USER WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    UserEntity findByCode(@Param("code")int code, @Param("status") String status);
}
