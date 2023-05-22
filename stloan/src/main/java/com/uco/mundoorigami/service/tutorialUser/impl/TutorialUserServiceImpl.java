package com.uco.mundoorigami.service.tutorialUser.impl;


import com.uco.mundoorigami.domain.TutorialUser;
import com.uco.mundoorigami.mapper.TutorialUserMapper;
import com.uco.mundoorigami.model.TutorialUserEntity;
import com.uco.mundoorigami.repository.TutorialUserRepository;
import com.uco.mundoorigami.service.tutorialUser.TutorialUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialUserServiceImpl implements TutorialUserService {

   private final TutorialUserRepository tutorialUserRepository;
   private final TutorialUserMapper tutorialUserMapper;
    @Autowired
    public TutorialUserServiceImpl(TutorialUserRepository tutorialUserRepository, TutorialUserMapper tutorialUserMapper) {
        this.tutorialUserRepository = tutorialUserRepository;
        this.tutorialUserMapper = tutorialUserMapper;
    }

    @Override
    public TutorialUser save(TutorialUser tutorialUser) {
        return tutorialUserMapper.toTutorialUser(tutorialUserRepository.save(tutorialUserMapper.toTutorialUserEntity(tutorialUser)) );
    }



    @Override
    public List<TutorialUser> getAllByStatus(String status) {
        return tutorialUserMapper.toTutorialUserList(tutorialUserRepository.findByStatus(status));
    }

    @Override
    public void delete(int code) {
        TutorialUserEntity userToDelete = this.tutorialUserRepository.findByCode(code,"A");
        userToDelete.setStatus("I");
        this.tutorialUserRepository.save(userToDelete);
    }

    @Override
    public TutorialUser update(TutorialUser tutorialUser) {

        TutorialUserEntity tutorialUserToUpdate = this.tutorialUserRepository.findByCode(tutorialUser.getCode(), "A");
        tutorialUserToUpdate.setCodeUser(tutorialUser.getCodeUser());
        tutorialUserToUpdate.setCodeTutorialOrigami(tutorialUser.getCodeTutorialOrigami());
        tutorialUserToUpdate.setCodeTutorialStepUser(tutorialUser.getCodeTutorialStepUser());
        tutorialUserToUpdate.setCodeStatusTutorialUser(tutorialUser.getCodeStatusTutorialUser());

        return tutorialUserMapper.toTutorialUser(tutorialUserRepository.save(tutorialUserToUpdate));

    }
}
