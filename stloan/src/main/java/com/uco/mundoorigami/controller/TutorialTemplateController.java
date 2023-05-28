package com.uco.mundoorigami.controller;


import com.uco.mundoorigami.domain.TutorialTemplate;
import com.uco.mundoorigami.service.template.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/template-origami")
public class TutorialTemplateController {

    private final TemplateService templateService;

    @Autowired
    public TutorialTemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }


    @PostMapping()
    public ResponseEntity<Void> save(@RequestBody TutorialTemplate template) {
        templateService.saveTemplate(template);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all-by-status/{status}")
    public ResponseEntity<List<TutorialTemplate>> getAllByStatus(@PathVariable String status) {
        return new ResponseEntity<>(templateService.get(status), HttpStatus.OK);

    }

}
