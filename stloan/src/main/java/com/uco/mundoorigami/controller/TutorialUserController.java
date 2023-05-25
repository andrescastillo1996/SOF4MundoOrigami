package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.TutorialUser;
import com.uco.mundoorigami.service.tutorialUser.impl.TutorialUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tutorial-user")
public class TutorialUserController {

    private final TutorialUserServiceImpl tutorialUserService;
    @Autowired
    public TutorialUserController(TutorialUserServiceImpl tutorialUserService) {
        this.tutorialUserService = tutorialUserService;
    }
    @PostMapping
    public ResponseEntity<TutorialUser> save(@RequestBody TutorialUser tutorialUser){
        return  new ResponseEntity<>(tutorialUserService.save(tutorialUser), HttpStatus.CREATED);
    }

    @GetMapping("/all-by-status/{status}")
    public ResponseEntity<List<TutorialUser>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(tutorialUserService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<TutorialUser> update(@RequestBody TutorialUser tutorialUser){
        return  new ResponseEntity<>(tutorialUserService.update(tutorialUser), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        tutorialUserService.delete(code);
        return  ResponseEntity.ok().build();
    }
}
