package com.uco.mundoorigami.service.tutorialStep.impl;


import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.mapper.TutorialStepMapper;
import com.uco.mundoorigami.model.TutorialStepEntity;
import com.uco.mundoorigami.repository.TutorialStepRepository;
import com.uco.mundoorigami.service.tutorialStep.TutorialStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialStepServiceImpl implements TutorialStepService {

    private final TutorialStepRepository tutorialStepRepository;
    private final TutorialStepMapper tutorialStepMapper;

    @Autowired
    public TutorialStepServiceImpl(TutorialStepRepository tutorialStepRepository, TutorialStepMapper tutorialStepMapper) {
        this.tutorialStepRepository = tutorialStepRepository;
        this.tutorialStepMapper = tutorialStepMapper;
    }

    @Override
    public TutorialStep save(TutorialStep tutorialStep) {
        tutorialStep.setStatus("A");
        return tutorialStepMapper.toTutorialStep(tutorialStepRepository.save(tutorialStepMapper.toTutorialStepEntity(tutorialStep)));
    }

    @Override
    public List<TutorialStep> getAllByStatus(String status) {
        return  tutorialStepMapper.toTutorialStepsList(tutorialStepRepository.findByStatus(status));
    }

    @Override
    public List<TutorialStep> getAllByTutorialId(int tutorialId, String status) {
        return tutorialStepMapper.tOrigamiList(tutorialStepRepository.findAllByTutorialIdAndStatus(tutorialId,status));
    }


    @Override
    public void delete(int code) {
        TutorialStepEntity origamiToDelete = this.tutorialStepRepository.findByCode(code, "A");
        origamiToDelete.setStatus("I");
        this.tutorialStepRepository.save(origamiToDelete);

    }

    @Override
    public TutorialStep update(TutorialStep tutorialStep) {
        TutorialStepEntity origamiToUpdate = this.tutorialStepRepository.findByCode(tutorialStep.getCode(), "A");
        origamiToUpdate.setName(tutorialStep.getName());
        origamiToUpdate.setImageURL(tutorialStep.getImageURL());
        return tutorialStepMapper.toTutorialStep(tutorialStepRepository.save(origamiToUpdate));
    }

}
