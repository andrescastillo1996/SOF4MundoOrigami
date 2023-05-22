package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.service.tutorialStep.impl.TutorialStepServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/tutorial-step")
@CrossOrigin(origins = "http://localhost:4200")
public class TutorialStepController {

    private  final TutorialStepServiceImpl tutorialStepService;

    @Autowired
    public TutorialStepController(TutorialStepServiceImpl tutorialStepService) {
        this.tutorialStepService = tutorialStepService;
    }


    @PostMapping
    public ResponseEntity<TutorialStep>save(@RequestBody TutorialStep tutorialStep)
    {
        return  new ResponseEntity<>(tutorialStepService.save(tutorialStep),HttpStatus.CREATED);

    }




    @GetMapping("/all-by-status-tutorial-step/{status}")
    public ResponseEntity<List<TutorialStep>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(tutorialStepService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<TutorialStep> update(@RequestBody TutorialStep tutorialStep){
        return  new ResponseEntity<>(tutorialStepService.update(tutorialStep), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        tutorialStepService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
