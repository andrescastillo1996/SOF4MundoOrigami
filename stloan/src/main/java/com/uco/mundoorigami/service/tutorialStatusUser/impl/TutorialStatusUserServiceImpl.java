package com.uco.mundoorigami.service.tutorialStatusUser.impl;


import com.uco.mundoorigami.domain.TutorialStatusUser;
import com.uco.mundoorigami.mapper.TutorialStatusUserMapper;
import com.uco.mundoorigami.model.TutorialStatusUserEntity;
import com.uco.mundoorigami.repository.TutorialStatusUserRepository;
import com.uco.mundoorigami.service.tutorialStatusUser.TutorialStatusUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialStatusUserServiceImpl implements TutorialStatusUserService {

    private final TutorialStatusUserRepository tutorialStatusUserRepository;
    private final TutorialStatusUserMapper tutorialStatusUserMapper;

    @Autowired
    public TutorialStatusUserServiceImpl(TutorialStatusUserRepository tutorialStatusUserRepository, TutorialStatusUserMapper tutorialStatusUserMapper) {
        this.tutorialStatusUserRepository = tutorialStatusUserRepository;
        this.tutorialStatusUserMapper = tutorialStatusUserMapper;
    }



    @Override
    public TutorialStatusUser save(TutorialStatusUser tutorialStatusUser) {
        return tutorialStatusUserMapper.toTutorialStatusUser(tutorialStatusUserRepository.save(tutorialStatusUserMapper.toTutorialStatusUserEntity(tutorialStatusUser)));
    }

    @Override
    public List<TutorialStatusUser> getAllByStatus(String status) {
        return tutorialStatusUserMapper.toTutorialStatusUsersList(tutorialStatusUserRepository.findByStatus(status));
    }

    @Override
    public void delete(int code) {
        TutorialStatusUserEntity tutorialStatusUserToDelete = this.tutorialStatusUserRepository.findByCode(code,"A");
        tutorialStatusUserToDelete.setStatus("I");
        this.tutorialStatusUserRepository.save(tutorialStatusUserToDelete);

    }

    @Override
    public TutorialStatusUser update(TutorialStatusUser tutorialStatusUser) {

        TutorialStatusUserEntity tutorialStatusToUpdate=this.tutorialStatusUserRepository.findByCode(tutorialStatusUser.getCode(),"A");
        tutorialStatusToUpdate.setCondition(tutorialStatusUser.getCondition());
        return tutorialStatusUserMapper.toTutorialStatusUser(tutorialStatusUserRepository.save(tutorialStatusToUpdate));
    }
}
