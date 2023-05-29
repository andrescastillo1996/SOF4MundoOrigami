package com.uco.mundoorigami.service.origami.impl;


import com.uco.mundoorigami.domain.TutorialStep;
import com.uco.mundoorigami.mapper.OrigamiMapper;
import com.uco.mundoorigami.model.OrigamiEntity;
import com.uco.mundoorigami.repository.OrigamiRepository;
import com.uco.mundoorigami.service.origami.OrigamiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrigamiServiceImpl implements OrigamiService {

    private final OrigamiRepository origamiRepository;
    private final OrigamiMapper origamiMapper;

    @Autowired
    public OrigamiServiceImpl(OrigamiRepository origamiRepository, OrigamiMapper origamiMapper) {
        this.origamiRepository = origamiRepository;
        this.origamiMapper = origamiMapper;
    }

    @Override
    public TutorialStep save(TutorialStep tutorialStep) {
        tutorialStep.setStatus("A");
        return origamiMapper.toOrigami(origamiRepository.save(origamiMapper.toOrigamiEntity(tutorialStep)));
    }

    @Override
    public List<TutorialStep> getAllByStatus(String status) {
        return  origamiMapper.tOrigamiList(origamiRepository.findByStatus(status));
    }

    @Override
    public List<TutorialStep> getAllByTutorialId(int tutorialId, String status) {
        return origamiMapper.tOrigamiList(origamiRepository.findAllByTutorialIdAndStatus(tutorialId,status));
    }


    @Override
    public void delete(int code) {
        OrigamiEntity origamiToDelete = this.origamiRepository.findByCode(code, "A");
        origamiToDelete.setStatus("I");
        this.origamiRepository.save(origamiToDelete);

    }

    @Override
    public TutorialStep update(TutorialStep tutorialStep) {
        OrigamiEntity origamiToUpdate = this.origamiRepository.findByCode(tutorialStep.getCode(), "A");
        origamiToUpdate.setName(tutorialStep.getName());
        origamiToUpdate.setImageURL(tutorialStep.getImageURL());
        return origamiMapper.toOrigami(origamiRepository.save(origamiToUpdate));
    }

}
