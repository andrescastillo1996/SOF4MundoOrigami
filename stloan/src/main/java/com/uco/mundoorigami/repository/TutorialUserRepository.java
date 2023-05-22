package com.uco.mundoorigami.repository;



import com.uco.mundoorigami.model.TutorialUserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialUserRepository extends CrudRepository<TutorialUserEntity,Integer> {
    @Query(value = " SELECT * FROM TUTORIAL_USER_ENTITY WHERE STATUS = :status ", nativeQuery = true)
    List<TutorialUserEntity> findByStatus(@Param("status") String status);

    @Query(value = " SELECT * FROM TUTORIAL_USER_ENTITY WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    TutorialUserEntity findByCode(@Param("code")int code, @Param("status") String status);

}
