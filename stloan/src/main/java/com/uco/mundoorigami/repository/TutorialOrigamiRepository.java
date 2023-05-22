package com.uco.mundoorigami.repository;



import com.uco.mundoorigami.model.TutorialOrigamiEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialOrigamiRepository extends CrudRepository<TutorialOrigamiEntity,Integer> {
    @Query(value = " SELECT * FROM TUTORIAL_ORIGAMI WHERE STATUS = :status ", nativeQuery = true)
    List<TutorialOrigamiEntity> findByStatus(@Param("status") String status);

    @Query(value = " SELECT * FROM TUTORIAL_ORIGAMI WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    TutorialOrigamiEntity findByCode(@Param("code")int code, @Param("status") String status);

}
