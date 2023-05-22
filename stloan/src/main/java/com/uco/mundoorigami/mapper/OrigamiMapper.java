package com.uco.mundoorigami.mapper;


import com.uco.mundoorigami.domain.Origami;
import com.uco.mundoorigami.model.OrigamiEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring",uses = {OrigamiTypeMapper.class})
public interface OrigamiMapper {

    @Mappings({
            @Mapping(source = "code", target ="code"),
            @Mapping(source = "origamiTypeId", target = "origamiTypeId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "imageURL", target = "imageURL")
    })
    Origami toOrigami(OrigamiEntity origami);
    List<Origami> tOrigamiList(List<OrigamiEntity> origamiEntityList);

    @InheritInverseConfiguration
    OrigamiEntity toOrigamiEntity(Origami origami);
    List<OrigamiEntity> toOrigamiEntityList(List<Origami> origamiList);
}
