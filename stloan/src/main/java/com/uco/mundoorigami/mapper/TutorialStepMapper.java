package com.uco.mundoorigami.mapper;


import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.model.TutorialStepEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ResourceMapper.class})
public interface TutorialStepMapper {

    @Mappings({
            @Mapping(source = "code", target ="code"),
            @Mapping(source = "step", target = "step"),
            @Mapping(source = "codeResource", target = "codeResource"),
            @Mapping(source = "status",target = "status")
    })
    TutorialStep toTutorialStep(TutorialStepEntity tutorialStepEntity);
    List<TutorialStep> toTutorialStepsList(List<TutorialStepEntity> tutorialStepEntityList);

    @InheritInverseConfiguration
    TutorialStepEntity toTutorialStepEntity(TutorialStep tutorialStep);
    List<TutorialStepEntity> toOrigamiEntityList(List<TutorialStep> tutorialStepList);
}
