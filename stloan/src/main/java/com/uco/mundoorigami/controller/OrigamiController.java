package com.uco.mundoorigami.controller;

import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.service.origami.impl.OrigamiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/origami")
public class OrigamiController {

    private final OrigamiServiceImpl origamiService;
    @Autowired
    public OrigamiController(OrigamiServiceImpl origamiService) {
        this.origamiService = origamiService;
    }
    @PostMapping
    public ResponseEntity<TutorialStep> save(@RequestBody TutorialStep tutorialStep){
        return  new ResponseEntity<>(origamiService.save(tutorialStep), HttpStatus.CREATED);
    }

    @GetMapping("/all-by-status/{status}")
    public ResponseEntity<List<TutorialStep>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(origamiService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<TutorialStep> update(@RequestBody TutorialStep tutorialStep){
        return  new ResponseEntity<>(origamiService.update(tutorialStep), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        origamiService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
