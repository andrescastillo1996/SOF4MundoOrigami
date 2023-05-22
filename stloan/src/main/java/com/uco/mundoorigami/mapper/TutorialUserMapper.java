package com.uco.mundoorigami.mapper;



import com.uco.mundoorigami.domain.TutorialUser;
import com.uco.mundoorigami.model.TutorialUserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TutorialUserMapper {

    @Mappings(
            {
                    @Mapping(source = "code",target = "code"),
                    @Mapping(source = "codeUser",target = "codeUser"),
                    @Mapping(source = "codeTutorialOrigami",target = "codeTutorialOrigami"),
                    @Mapping(source = "codeTutorialStepUser",target = "codeTutorialStepUser"),
                    @Mapping(source = "codeStatusTutorialUser",target = "codeStatusTutorialUser"),
                    @Mapping(source = "status",target = "status")
            }
    )
    TutorialUser toTutorialUser(TutorialUserEntity tutorialUserEntity);
    List<TutorialUser> toTutorialUserList(List<TutorialUserEntity> tutorialUserEntities);

    @InheritInverseConfiguration
    TutorialUserEntity toTutorialUserEntity(TutorialUser tutorialUser
    );
    List<TutorialUserEntity> toTutorialOrigamiEntities(List<TutorialUser>  users);


}
