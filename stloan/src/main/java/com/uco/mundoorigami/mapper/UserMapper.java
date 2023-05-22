package com.uco.mundoorigami.mapper;



import com.uco.mundoorigami.domain.User;
import com.uco.mundoorigami.model.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings(
            {
                    @Mapping(source = "code",target = "code"),
                    @Mapping(source = "name",target = "name"),
                    @Mapping(source = "email",target = "email"),
                    @Mapping(source = "password",target = "password"),
                    @Mapping(source = "status",target = "status")
            }
    )
    User toUser(UserEntity UserEntity);
    List<User> toUserList(List<UserEntity> UserEntityList);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);
    List<UserEntity> toOrigamiTypeEntities(List<User>  users);


}
