package com.uco.mundoorigami.service.statusStepUser.impl;

import com.uco.mundoorigami.domain.StatusStepUser;
import com.uco.mundoorigami.mapper.StatusStepUserEntityMapper;
import com.uco.mundoorigami.model.StatusStepUserEntity;
import com.uco.mundoorigami.repository.StatusStepUserRepository;
import com.uco.mundoorigami.service.statusStepUser.StatusStepUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusStepUserServiceImpl implements StatusStepUserService {

    private final StatusStepUserRepository statusStepUserRepository;
    private final StatusStepUserEntityMapper statusStepUserEntityMapper;
    @Autowired
    public StatusStepUserServiceImpl(StatusStepUserRepository statusStepUserRepository, StatusStepUserEntityMapper statusStepUserEntityMapper) {
        this.statusStepUserRepository = statusStepUserRepository;
        this.statusStepUserEntityMapper = statusStepUserEntityMapper;
    }



    @Override
    public StatusStepUser save(StatusStepUser statusStepUser) {
        return statusStepUserEntityMapper.toStatusStepUser(statusStepUserRepository.save(statusStepUserEntityMapper.toStatusStepUserEntity(statusStepUser)));
    }

    @Override
    public List<StatusStepUser> getAllByStatus(String status) {
        return statusStepUserEntityMapper.toStatusStepUsersList(statusStepUserRepository.findByStatus(status));
    }

    @Override
    public void delete(int code) {
        StatusStepUserEntity statusStepUserEntityToDelete = this.statusStepUserRepository.findByCode(code,"A");
        statusStepUserEntityToDelete.setStatus("I");
        this.statusStepUserRepository.save(statusStepUserEntityToDelete);


    }

    @Override
    public StatusStepUser update(StatusStepUser statusStepUser) {
        StatusStepUserEntity statusStepUserEntityTopUdate=this.statusStepUserRepository.findByCode(statusStepUser.getCode(),"A");
        statusStepUserEntityTopUdate.setCondiction(statusStepUser.getCondiction());
        return statusStepUserEntityMapper.toStatusStepUser(statusStepUserRepository.save(statusStepUserEntityTopUdate));
    }
}
