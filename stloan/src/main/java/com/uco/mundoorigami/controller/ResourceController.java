package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.Resource;
import com.uco.mundoorigami.service.Resource.impl.ResourceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/resource")
public class ResourceController {


    private final ResourceServiceImpl resourceService;

    @Autowired
    public ResourceController(ResourceServiceImpl resourceService)
    {
        this.resourceService = resourceService;
    }

    @PostMapping()
    public ResponseEntity<Void> save(@RequestBody Resource resource){
        resourceService.save(resource);
        return  ResponseEntity.ok().build();
    }

    @GetMapping("/all-by-status-resource/{status}")
    public ResponseEntity<List<Resource>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(resourceService.getAllByStatusResouce(status), HttpStatus.OK);

    }
    @PutMapping("update-resource")
    public ResponseEntity<Resource> update(@RequestBody Resource resource){
        return  new ResponseEntity<>(resourceService.update(resource), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        resourceService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
