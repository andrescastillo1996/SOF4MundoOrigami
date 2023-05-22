package com.uco.mundoorigami.service.tutorialStep.impl;


import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.mapper.TutorialStepMapper;
import com.uco.mundoorigami.repository.TutorialStepRepository;
import com.uco.mundoorigami.service.tutorialStep.TutorialStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TutorialStepServiceImpl implements TutorialStepService {

    private final TutorialStepMapper tutorialStepMapper;
    private final TutorialStepRepository tutorialStepRepository;



    @Autowired
    public TutorialStepServiceImpl(TutorialStepMapper tutorialStepMapper, TutorialStepRepository tutorialStepRepository) {
        this.tutorialStepMapper = tutorialStepMapper;
        this.tutorialStepRepository = tutorialStepRepository;
    }

    @Override
    public TutorialStep save(TutorialStep tutorialStep) {
        return tutorialStepMapper.toTutorialStep(tutorialStepRepository.save(tutorialStepMapper.toTutorialStepEntity(tutorialStep)));
    }

    @Override
    public List<TutorialStep> getAllByStatus(String status) {
        return  tutorialStepMapper.toTutorialStepsList(tutorialStepRepository.findByStatus(status));

    }

    @Override
    public void delete(int code) {


        tutorialStepRepository.deleteById(code);

    }

    @Override
    public TutorialStep update(TutorialStep tutorialStep) {
        return null;
    }




}
