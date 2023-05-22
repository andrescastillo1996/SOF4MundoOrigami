package com.uco.mundoorigami.repository;



import com.uco.mundoorigami.model.ResourceEntity;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends CrudRepository<ResourceEntity, Integer> {

    @Query(value = " SELECT * FROM RESOURCE WHERE STATUS = :status ", nativeQuery = true)
    List<ResourceEntity> findByStatus(@Param("status") String status);

    @Query(value = " SELECT * FROM RESOURCE WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    ResourceEntity findByCode(@Param("code")int code, @Param("status") String status);



}
