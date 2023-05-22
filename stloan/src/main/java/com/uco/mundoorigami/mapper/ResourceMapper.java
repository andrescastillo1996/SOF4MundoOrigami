package com.uco.mundoorigami.mapper;

import com.uco.mundoorigami.domain.Resource;
import com.uco.mundoorigami.model.ResourceEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ResourceMapper
{



    @Mappings({

            @Mapping(source = "code", target ="code"),
            @Mapping(source ="material", target = "material"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "status",target = "status")
    })
    Resource toResource(ResourceEntity resourceEntity);
    List<Resource> toResourceList(List<ResourceEntity> resourceEntities);

    @InheritInverseConfiguration
    ResourceEntity toResourceEntity(Resource resource);
    List<ResourceEntity> toResourceEntities(List<Resource>  resources);


}

