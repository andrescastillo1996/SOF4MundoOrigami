package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.TutorialStepUser;
import com.uco.mundoorigami.service.tutorialStepUser.impl.TutorialStepUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tutorial-step-user")
public class TutorialStepUserController {

    private final TutorialStepUserServiceImpl tutorialStepUserService;
    @Autowired
    public TutorialStepUserController(TutorialStepUserServiceImpl tutorialStepUserService) {
        this.tutorialStepUserService = tutorialStepUserService;
    }




    @PostMapping
    public ResponseEntity<TutorialStepUser> save(@RequestBody TutorialStepUser tutorialStepUser)
    {
        return  new ResponseEntity<>(tutorialStepUserService.save(tutorialStepUser), HttpStatus.CREATED);

    }

    @GetMapping("/all-by-status-tutorial-step/{status}")
    public ResponseEntity<List<TutorialStepUser>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(tutorialStepUserService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<TutorialStepUser> update(@RequestBody TutorialStepUser tutorialStepUser){
        return  new ResponseEntity<>(tutorialStepUserService.update(tutorialStepUser), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        tutorialStepUserService.delete(code);
        return  ResponseEntity.ok().build();
    }
}
