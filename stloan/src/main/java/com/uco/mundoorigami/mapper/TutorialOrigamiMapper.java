package com.uco.mundoorigami.mapper;



import com.uco.mundoorigami.domain.TutorialOrigami;
import com.uco.mundoorigami.model.TutorialOrigamiEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TutorialOrigamiMapper {

    @Mappings(
            {
                    @Mapping(source = "code",target = "code"),
                    @Mapping(source = "name", target = "name"),
                    @Mapping(source ="description",target = "description"),
                    @Mapping(source = "status",target = "status"),
                    @Mapping(source = "level",target = "level"),
                    @Mapping(source = "category",target = "category")
            }
    )
    TutorialOrigami toTutorialOrigami(TutorialOrigamiEntity resourceEntity);
    List<TutorialOrigami> toTutorialOrigamiList(List<TutorialOrigamiEntity> resourceEntities);

    @InheritInverseConfiguration
    TutorialOrigamiEntity toTutorialOrigamiEntity(TutorialOrigami tutorialOrigami);
    List<TutorialOrigamiEntity> toTutorialOrigamiEntities(List<TutorialOrigami>  resources);

}
