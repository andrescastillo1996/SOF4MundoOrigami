package com.uco.mundoorigami.service.template.impl;

import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.domain.TutorialTemplate;
import com.uco.mundoorigami.domain.TutorialOrigami;
import com.uco.mundoorigami.service.origami.OrigamiService;
import com.uco.mundoorigami.service.template.TemplateService;
import com.uco.mundoorigami.service.tutorialOrigami.TutorialOrigamiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TemplateServiceImpl implements TemplateService {

    private final TutorialOrigamiService tutorialOrigamiService;
    private final OrigamiService origamiService;

    @Autowired
    public TemplateServiceImpl(TutorialOrigamiService tutorialOrigamiService, OrigamiService origamiService) {
        this.tutorialOrigamiService = tutorialOrigamiService;
        this.origamiService = origamiService;
    }

    @Override
    public void saveTemplate(TutorialTemplate template) {
        TutorialOrigami tutorial = this.tutorialOrigamiService.save(template.getTutorial());
        template.getTutorialStepList().forEach(origami -> {
            origami.setTutorialId(tutorial.getCode());
            this.origamiService.save(origami);
        });

    }

    @Override
    public List<TutorialTemplate> get(String status) {
        List<TutorialTemplate> tutorialTemplateList= new ArrayList<>();
        List<TutorialOrigami> tutorialOrigamiList = tutorialOrigamiService.getAllByStatus(status);
        tutorialOrigamiList.forEach(tutorialOrigami -> {
            List<TutorialStep> tutorialStepList = this.origamiService.getAllByTutorialId(tutorialOrigami.getCode(),status);
            tutorialTemplateList.add(this.buildTemplate(tutorialOrigami, tutorialStepList));
        });

        return tutorialTemplateList;
    }


    private TutorialTemplate buildTemplate(TutorialOrigami tutorialOrigami, List<TutorialStep> tutorialStepList){
        return  new TutorialTemplate(tutorialOrigami, tutorialStepList);
    }
}
