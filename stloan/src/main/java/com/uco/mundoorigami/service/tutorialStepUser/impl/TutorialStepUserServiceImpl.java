package com.uco.mundoorigami.service.tutorialStepUser.impl;


import com.uco.mundoorigami.domain.TutorialStepUser;
import com.uco.mundoorigami.mapper.TutorialStepUserMapper;
import com.uco.mundoorigami.model.TutorialStepUserEntity;
import com.uco.mundoorigami.repository.TutorialStepUserRepository;
import com.uco.mundoorigami.service.tutorialStepUser.TutorialStepUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialStepUserServiceImpl implements TutorialStepUserService {

    private final TutorialStepUserRepository tutorialStepUserRepository;
    private final TutorialStepUserMapper tutorialStepUserMapper;

    @Autowired
    public TutorialStepUserServiceImpl(TutorialStepUserRepository tutorialStepUserRepository, TutorialStepUserMapper tutorialStepUserMapper) {
        this.tutorialStepUserRepository = tutorialStepUserRepository;
        this.tutorialStepUserMapper = tutorialStepUserMapper;
    }

    @Override
    public TutorialStepUser save(TutorialStepUser tutorialStepUser) {
        return tutorialStepUserMapper.toTutorialStepUser(tutorialStepUserRepository.save(tutorialStepUserMapper.toTutorialStepUserEntity(tutorialStepUser)));
    }

    @Override
    public List<TutorialStepUser> getAllByStatus(String status) {
        return tutorialStepUserMapper.toTutorialStepsUsersList(tutorialStepUserRepository.findByStatus(status));
    }

    @Override
    public void delete(int code) {
        TutorialStepUserEntity tutorialStepUserEntityToDelete = this.tutorialStepUserRepository.findByCode(code,"A");
        tutorialStepUserEntityToDelete.setStatus("I");
        this.tutorialStepUserRepository.save(tutorialStepUserEntityToDelete);


    }

    @Override
    public TutorialStepUser update(TutorialStepUser tutorialStepUser) {
        TutorialStepUserEntity tutorialStepUserEntityToUpdate=this.tutorialStepUserRepository.findByCode(tutorialStepUser.getCode(),"A");
        tutorialStepUserEntityToUpdate.setStepTutorial(tutorialStepUser.getStepTutorial());
        return tutorialStepUserMapper.toTutorialStepUser(tutorialStepUserRepository.save(tutorialStepUserEntityToUpdate));
    }




}
