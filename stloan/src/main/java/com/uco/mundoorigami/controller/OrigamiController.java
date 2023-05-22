package com.uco.mundoorigami.controller;

import com.uco.mundoorigami.domain.Origami;
import com.uco.mundoorigami.service.origami.impl.OrigamiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/origami")
@CrossOrigin(origins = "http://localhost:4200")
public class OrigamiController {

    private final OrigamiServiceImpl origamiService;
    @Autowired
    public OrigamiController(OrigamiServiceImpl origamiService) {
        this.origamiService = origamiService;
    }
    @PostMapping
    public ResponseEntity<Origami> save(@RequestBody Origami origami){
        return  new ResponseEntity<>(origamiService.save(origami), HttpStatus.CREATED);
    }

    @GetMapping("/all-by-status/{status}")
    public ResponseEntity<List<Origami>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(origamiService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<Origami> update(@RequestBody Origami origami){
        return  new ResponseEntity<>(origamiService.update(origami), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        origamiService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
