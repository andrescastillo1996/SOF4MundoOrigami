package com.uco.mundoorigami.controller;

import com.uco.mundoorigami.domain.OrigamiType;
import com.uco.mundoorigami.service.origamitype.impl.OrigamiTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/origami-type")
public class OrigamiTypeController {

    private  final OrigamiTypeServiceImpl origamiTypeService;

    @Autowired
    public OrigamiTypeController(OrigamiTypeServiceImpl origamiTypeService) {
        this.origamiTypeService = origamiTypeService;
    }

    @PostMapping()
    public ResponseEntity<Void> save(@RequestBody OrigamiType origamiType){
        origamiTypeService.save(origamiType);
        return  ResponseEntity.ok().build();
    }
    @GetMapping("/all-by-status/{status}")
    public ResponseEntity<List<OrigamiType>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(origamiTypeService.getAllByStatusOrigamiType(status), HttpStatus.OK);

    }

    @PutMapping("update-origamiType")
    public ResponseEntity<OrigamiType> update(@RequestBody OrigamiType origamiType){
        return  new ResponseEntity<>(origamiTypeService.updateOrigamiType(origamiType), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        origamiTypeService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
