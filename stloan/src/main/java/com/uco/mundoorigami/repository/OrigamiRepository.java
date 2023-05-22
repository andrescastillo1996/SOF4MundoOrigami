package com.uco.mundoorigami.repository;


import com.uco.mundoorigami.model.OrigamiEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrigamiRepository extends CrudRepository<OrigamiEntity, Integer> {

    @Query(value = " SELECT * FROM ORIGAMI WHERE STATUS = :status ", nativeQuery = true)
    List<OrigamiEntity> findByStatus(@Param("status") String status);

    @Query(value = " SELECT * FROM ORIGAMI WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    OrigamiEntity findByCode(@Param("code")int code, @Param("status") String status);
}
