package com.uco.mundoorigami.repository;


import com.uco.mundoorigami.model.OrigamiTypeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrigamiTypeRepository extends CrudRepository <OrigamiTypeEntity, Integer> {

    @Query(value = " SELECT * FROM ORIGAMI_TYPE WHERE STATUS = :status ", nativeQuery = true)
    List<OrigamiTypeEntity> findByStatus(@Param("status") String status);

    @Query(value = " SELECT * FROM ORIGAMI_TYPE WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    OrigamiTypeEntity findByCode(@Param("code")int code, @Param("status") String status);
}
