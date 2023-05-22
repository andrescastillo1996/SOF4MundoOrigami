package com.uco.mundoorigami.mapper;


import com.uco.mundoorigami.domain.TutorialStatusUser;
import com.uco.mundoorigami.model.TutorialStatusUserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TutorialStatusUserMapper {
    @Mappings({
            @Mapping(source = "code", target ="code"),
            @Mapping(source = "condition",target = "condition"),
            @Mapping(source = "status", target = "status")
    })
    TutorialStatusUser toTutorialStatusUser(TutorialStatusUserEntity tutorialStatusUser);
    List<TutorialStatusUser> toTutorialStatusUsersList(List<TutorialStatusUserEntity> tutorialStatusUserEntityList);

    @InheritInverseConfiguration
    TutorialStatusUserEntity toTutorialStatusUserEntity(TutorialStatusUser tutorialStatusUser);
    List<TutorialStatusUserEntity> toTutorialStatusUserEntities(List<TutorialStatusUser>  tutorialStatusUsers);
}
