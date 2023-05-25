package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.TutorialStatusUser;
import com.uco.mundoorigami.service.tutorialStatusUser.impl.TutorialStatusUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController("api/tutorial-status-user")
public class TutorialStatusUserController {
    private  final TutorialStatusUserServiceImpl tutorialStatusUserService;
    @Autowired
    public TutorialStatusUserController(TutorialStatusUserServiceImpl tutorialStatusUserService) {
        this.tutorialStatusUserService = tutorialStatusUserService;
    }

    @PostMapping
    public ResponseEntity<TutorialStatusUser> save(@RequestBody TutorialStatusUser tutorialStatusUser)
    {
        return  new ResponseEntity<>(tutorialStatusUserService.save(tutorialStatusUser), HttpStatus.CREATED);

    }




    @GetMapping("/all-by-status-tutorial-step/{status}")
    public ResponseEntity<List<TutorialStatusUser>> getAllByStatus(@PathVariable String status){
        return  new ResponseEntity<>(tutorialStatusUserService.getAllByStatus(status),HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<TutorialStatusUser> update(@RequestBody TutorialStatusUser tutorialStatusUser){
        return  new ResponseEntity<>(tutorialStatusUserService.update(tutorialStatusUser), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{code}")
    public ResponseEntity<Void> delete(@PathVariable int code){
        tutorialStatusUserService.delete(code);
        return  ResponseEntity.ok().build();
    }


}
