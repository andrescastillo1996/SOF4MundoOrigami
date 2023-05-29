package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.service.tutorialStep.impl.TutorialStepServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/tutorial-step")
public class TutorialStepController {

    private  final TutorialStepServiceImpl tutorialStepService;

    @Autowired
    public TutorialStepController(TutorialStepServiceImpl tutorialStepService) {
        this.tutorialStepService = tutorialStepService;
    }


    @PostMapping
    public ResponseEntity<TutorialStep2>save(@RequestBody TutorialStep2 tutorialStep2)
    {
        return  new ResponseEntity<>(tutorialStepService.save(tutorialStep2),HttpStatus.CREATED);

    }




    @GetMapping("/all-by-status-tutorial-step/{status}")
    public ResponseEntity<List<TutorialStep2>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(tutorialStepService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<TutorialStep2> update(@RequestBody TutorialStep2 tutorialStep2){
        return  new ResponseEntity<>(tutorialStepService.update(tutorialStep2), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        tutorialStepService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
