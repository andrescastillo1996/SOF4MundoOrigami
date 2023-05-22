package com.uco.mundoorigami.controller;

import com.uco.mundoorigami.domain.StatusStepUser;
import com.uco.mundoorigami.service.statusStepUser.impl.StatusStepUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Status-step-user")
@CrossOrigin(origins = "http://localhost:4200")
public class StatusStepUserController {
    private final StatusStepUserServiceImpl statusStepUserService;
    @Autowired
    public StatusStepUserController(StatusStepUserServiceImpl statusStepUserService) {
        this.statusStepUserService = statusStepUserService;
    }




    @PostMapping()
    public ResponseEntity<Void> save(@RequestBody StatusStepUser statusStepUser){
        statusStepUserService.save(statusStepUser);
        return  ResponseEntity.ok().build();
    }

    @GetMapping("/all-by-status-resource/{status}")
    public ResponseEntity<List<StatusStepUser>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(statusStepUserService.getAllByStatus(status), HttpStatus.OK);

    }
    @PutMapping("update-resource")
    public ResponseEntity<StatusStepUser> update(@RequestBody StatusStepUser statusStepUser){
        return  new ResponseEntity<>(statusStepUserService.update(statusStepUser), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        statusStepUserService.delete(code);
        return  ResponseEntity.ok().build();
    }

}
