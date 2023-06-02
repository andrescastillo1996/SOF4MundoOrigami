package com.uco.mundoorigami.controller;

import com.uco.mundoorigami.domain.LoginResponse;
import com.uco.mundoorigami.domain.User;
import com.uco.mundoorigami.mapper.UserMapper;
import com.uco.mundoorigami.model.UserEntity;
import com.uco.mundoorigami.repository.UserRepository;
import com.uco.mundoorigami.service.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginController {


    private UserRepository userRepository;

    private final UserServiceImpl userService;

    private UserMapper userMapper;
    @Autowired
    public LoginController(UserRepository userRepository, UserServiceImpl userService, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping
    public ResponseEntity<LoginResponse> login(@RequestBody User user) {
        // Buscar el usuario en la base de datos por nombre de usuario
        UserEntity existingUser = userRepository.findByEmail(user.getEmail());


        if (existingUser == null) {
            LoginResponse loginResponsen = new LoginResponse("Usuario no encontrado");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(loginResponsen);
        }

        // Verificar la contraseña
        if (!existingUser.getPassword().equals(user.getPassword())) {
            LoginResponse loginResponsen = new LoginResponse("Contraseña incorrecta");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(loginResponsen);
        }

        LoginResponse loginResponsen = new LoginResponse("Inicio de sesión exitoso");

        return ResponseEntity.ok(loginResponsen);
    }
}

