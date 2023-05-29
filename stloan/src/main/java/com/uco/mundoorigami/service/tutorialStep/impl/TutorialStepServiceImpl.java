package com.uco.mundoorigami.service.tutorialStep.impl;


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
    public TutorialStep2 save(TutorialStep2 tutorialStep2) {
        return tutorialStepMapper.toTutorialStep(tutorialStepRepository.save(tutorialStepMapper.toTutorialStepEntity(tutorialStep2)));
    }

    @Override
    public List<TutorialStep2> getAllByStatus(String status) {
        return  tutorialStepMapper.toTutorialStepsList(tutorialStepRepository.findByStatus(status));

    }

    @Override
    public void delete(int code) {


        tutorialStepRepository.deleteById(code);

    }

    @Override
    public TutorialStep2 update(TutorialStep2 tutorialStep2) {
        return null;
    }




}
