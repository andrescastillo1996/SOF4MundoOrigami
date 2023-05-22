package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.User;
import com.uco.mundoorigami.service.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        return  new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @GetMapping("/all-by-status/{status}")
    public ResponseEntity<List<User>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(userService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<User> update(@RequestBody User user){
        return  new ResponseEntity<>(userService.update(user), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        userService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
