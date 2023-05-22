package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.TutorialOrigami;
import com.uco.mundoorigami.service.tutorialOrigami.impl.TutorialOrigamiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutorial-origami")
@CrossOrigin(origins = "http://localhost:4200")
public class TutorialOrigamiController {
    private final TutorialOrigamiServiceImpl tutorialOrigamiService;
    @Autowired
    public TutorialOrigamiController(TutorialOrigamiServiceImpl tutorialOrigamiService) {
        this.tutorialOrigamiService = tutorialOrigamiService;
    }


    @PostMapping
    public ResponseEntity<TutorialOrigami> save(@RequestBody TutorialOrigami origami){
        return  new ResponseEntity<>(tutorialOrigamiService.save(origami), HttpStatus.CREATED);
    }

    @GetMapping("/all-by-status/{status}")
    public ResponseEntity<List<TutorialOrigami>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(tutorialOrigamiService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<TutorialOrigami> update(@RequestBody TutorialOrigami origami){
        return  new ResponseEntity<>(tutorialOrigamiService.update(origami), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        tutorialOrigamiService.delete(code);
        return  ResponseEntity.ok().build();
    }
}
