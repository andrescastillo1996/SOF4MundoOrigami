package com.uco.mundoorigami.service.user.impl;


import com.uco.mundoorigami.crosscutting.exception.DuplicateDataException;
import com.uco.mundoorigami.domain.User;
import com.uco.mundoorigami.mapper.UserMapper;
import com.uco.mundoorigami.model.UserEntity;
import com.uco.mundoorigami.repository.UserRepository;
import com.uco.mundoorigami.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public User save(User user) {
        this.userAlreadyExist(user.getEmail());
        return userMapper.toUser(userRepository.save(userMapper.toUserEntity(user)));

    }

    @Override
    public List<User> getAllByStatus(String status)
    {
        return userMapper.toUserList(userRepository.findByStatus(status));
    }

    @Override
    public User findByEmail(String email) {
        return userMapper.toUser(userRepository.findByEmail(email));
    }

    @Override
    public void delete(int code) {
        UserEntity userToDelete = this.userRepository.findByCode(code,"A");
        userToDelete.setStatus("I");
        this.userRepository.save(userToDelete);

    }

    @Override
    public User update(User user) {
        UserEntity userToUpdate=this.userRepository.findByCode(user.getCode(),"A");
        userToUpdate.setName(user.getName());
        userToUpdate.setEmail(user.getName());
        userToUpdate.setPassword(user.getPassword());
        return userMapper.toUser(userRepository.save(userToUpdate)) ;
    }


    private void userAlreadyExist(String email){
        if(this.findByEmail(email) != null) {
            throw new DuplicateDataException("la persona con el correo: " + email + " ya se encuentra registrada.", "la persona con el correo: " + email + " ya se encuentra registrada.");
        }

    }
}
