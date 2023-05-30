package com.uco.mundoorigami.repository;


import com.uco.mundoorigami.model.TutorialStepEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialStepRepository extends CrudRepository<TutorialStepEntity, Integer> {

    @Query(value = " SELECT * FROM ORIGAMI WHERE STATUS = :status ", nativeQuery = true)
    List<TutorialStepEntity> findByStatus(@Param("status") String status);




    List<TutorialStepEntity> findAllByTutorialIdAndStatus(int tutorialId, String status);

    @Query(value = " SELECT * FROM ORIGAMI WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    TutorialStepEntity findByCode(@Param("code")int code, @Param("status") String status);
}
