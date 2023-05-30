package com.uco.mundoorigami.mapper;

import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.model.TutorialStepEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TutorialStepMapper {

    @Mappings({
            @Mapping(source = "code", target ="code"),
            @Mapping(source = "tutorialId", target = "tutorialId"),
            @Mapping(source = "origamiTypeId", target = "origamiTypeId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "imageURL", target = "imageURL"),
            @Mapping(source = "description", target ="description"),
            @Mapping(source = "order", target = "order")
    })
    TutorialStep toTutorialStep(TutorialStepEntity origami);
    List<TutorialStep> toTutorialStepsList(List<TutorialStepEntity> tutorialStepEntityList);

    @InheritInverseConfiguration
    TutorialStepEntity toTutorialStepEntity(TutorialStep tutorialStep);
    List<TutorialStepEntity> toTutorialStepsEntityList(List<TutorialStep> tutorialStepList);

    List<TutorialStep> tOrigamiList(List<TutorialStepEntity> allByTutorialIdAndStatus);
}
