package com.uco.mundoorigami.repository;


import com.uco.mundoorigami.model.TutorialStatusUserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialStatusUserRepository extends CrudRepository<TutorialStatusUserEntity,Integer> {
    @Query(value = " SELECT * FROM TUTORIAL_STATUS_USER WHERE STATUS = :status ", nativeQuery = true)
    List<TutorialStatusUserEntity> findByStatus(@Param("status") String status);

    @Query(value = " SELECT * FROM TUTORIAL_STATUS_USER WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    TutorialStatusUserEntity findByCode(@Param("code")int code, @Param("status") String status);
}
