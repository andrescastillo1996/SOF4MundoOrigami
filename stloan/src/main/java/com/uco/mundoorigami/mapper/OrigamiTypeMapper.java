package com.uco.mundoorigami.mapper;


import com.uco.mundoorigami.domain.OrigamiType;
import com.uco.mundoorigami.model.OrigamiTypeEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrigamiTypeMapper {

    @Mappings({
            @Mapping(source = "code", target ="code"),
            @Mapping(source ="name", target = "name"),
            @Mapping(source = "status", target = "status")
    })
    OrigamiType toOrigamiType(OrigamiTypeEntity origamiType);
    List<OrigamiType> toOrigamiTypeList(List<OrigamiTypeEntity> origamiTypeEntities);

    @InheritInverseConfiguration
    OrigamiTypeEntity toOrigamiTypeEntity(OrigamiType origamiType);
    List<OrigamiTypeEntity> toOrigamiTypeEntities(List<OrigamiType>  origamiTypes);
}
