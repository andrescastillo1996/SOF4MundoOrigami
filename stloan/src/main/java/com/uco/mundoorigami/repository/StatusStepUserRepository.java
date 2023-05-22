package com.uco.mundoorigami.repository;


import com.uco.mundoorigami.model.StatusStepUserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusStepUserRepository extends CrudRepository<StatusStepUserEntity,Integer> {
    @Query(value = " SELECT * FROM STATUS_STEP_USER WHERE STATUS = :status ", nativeQuery = true)
    List<StatusStepUserEntity> findByStatus(@Param("status") String status);

    @Query(value = " SELECT * FROM STATUS_STEP_USER WHERE CODE = :code and STATUS = :status ", nativeQuery = true)
    StatusStepUserEntity findByCode(@Param("code")int code, @Param("status") String status);

}
