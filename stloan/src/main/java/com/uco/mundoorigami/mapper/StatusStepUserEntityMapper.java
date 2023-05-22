package com.uco.mundoorigami.mapper;


import com.uco.mundoorigami.domain.StatusStepUser;
import com.uco.mundoorigami.model.StatusStepUserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StatusStepUserEntityMapper {

    @Mappings({

            @Mapping(source = "code", target ="code"),
            @Mapping(source ="condiction", target = "condiction"),
            @Mapping(source = "status",target = "status")
    })
    StatusStepUser toStatusStepUser(StatusStepUserEntity statusStepUserEntity);
    List<StatusStepUser> toStatusStepUsersList(List<StatusStepUserEntity> statusStepUserEntities);

    @InheritInverseConfiguration
    StatusStepUserEntity toStatusStepUserEntity(StatusStepUser statusStepUser);
    List<StatusStepUserEntity> toStatusStepUserEntities(List<StatusStepUser>  statusStepUsers);

}
