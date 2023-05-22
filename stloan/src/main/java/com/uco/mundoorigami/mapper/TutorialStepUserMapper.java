package com.uco.mundoorigami.mapper;


import com.uco.mundoorigami.domain.StatusStepUser;
import com.uco.mundoorigami.domain.TutorialStepUser;
import com.uco.mundoorigami.model.TutorialStepUserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = StatusStepUser.class)
public interface TutorialStepUserMapper {

    @Mappings({
            @Mapping(source = "code", target ="code"),
            @Mapping(source = "codeStepUser", target = "codeStepUser"),
            @Mapping(source = "stepTutorial", target = "stepTutorial"),
            @Mapping(source = "status",target = "status")
    })
    TutorialStepUser toTutorialStepUser(TutorialStepUserEntity tutorialStepUserEntity);
    List<TutorialStepUser> toTutorialStepsUsersList(List<TutorialStepUserEntity> tutorialStepUserEntityList);

    @InheritInverseConfiguration
    TutorialStepUserEntity toTutorialStepUserEntity(TutorialStepUser tutorialStepUser);
    List<TutorialStepUserEntity> toTutorialStepUserEntities(List<TutorialStepUser> tutorialStepUsersList);
}
