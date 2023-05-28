package com.uco.mundoorigami.service.tutorialOrigami.impl;


import com.uco.mundoorigami.domain.TutorialOrigami;
import com.uco.mundoorigami.mapper.TutorialOrigamiMapper;
import com.uco.mundoorigami.model.TutorialOrigamiEntity;
import com.uco.mundoorigami.repository.TutorialOrigamiRepository;
import com.uco.mundoorigami.service.tutorialOrigami.TutorialOrigamiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialOrigamiServiceImpl implements TutorialOrigamiService {


    private final TutorialOrigamiRepository tutorialOrigamiRepository;
    private final TutorialOrigamiMapper tutorialOrigamiMapper;



    @Autowired
    public TutorialOrigamiServiceImpl(TutorialOrigamiRepository tutorialOrigamiRepository, TutorialOrigamiMapper tutorialOrigamiMapper) {
        this.tutorialOrigamiRepository = tutorialOrigamiRepository;
        this.tutorialOrigamiMapper = tutorialOrigamiMapper;

    }




    @Override
    public TutorialOrigami save(TutorialOrigami tutorialOrigami) {
        tutorialOrigami.setStatus("A");
        return tutorialOrigamiMapper.toTutorialOrigami(tutorialOrigamiRepository.save(tutorialOrigamiMapper.toTutorialOrigamiEntity(tutorialOrigami)));
    }

    @Override
    public List<TutorialOrigami> getAllByStatus(String status) {
        return tutorialOrigamiMapper.toTutorialOrigamiList(tutorialOrigamiRepository.findByStatus(status));

    }

    @Override
    public List<TutorialOrigami> getAllByLevel(String level) {
        return tutorialOrigamiMapper.toTutorialOrigamiList(tutorialOrigamiRepository.findAllByLevel(level));
    }

    @Override
    public List<TutorialOrigami> getallByCategory(String category) {
        return tutorialOrigamiMapper.toTutorialOrigamiList(tutorialOrigamiRepository.findAllByCategory(category));
    }


    @Override
    public void delete(int code) {
        TutorialOrigamiEntity tutorialOrigamiToDelete = this.tutorialOrigamiRepository.findByCode(code, "A");
        tutorialOrigamiToDelete.setStatus("I");
        this.tutorialOrigamiRepository.save(tutorialOrigamiToDelete);
    }

    @Override
    public TutorialOrigami update(TutorialOrigami tutorialOrigami) {
        TutorialOrigamiEntity tutorialOrigamiToUpdate = this.tutorialOrigamiRepository.findByCode(tutorialOrigami.getCode(), "A");
        tutorialOrigamiToUpdate.setDescription(tutorialOrigami.getDescription());
        return tutorialOrigamiMapper.toTutorialOrigami(tutorialOrigamiRepository.save(tutorialOrigamiToUpdate));

    }
}
