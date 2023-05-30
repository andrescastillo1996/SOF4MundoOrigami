package com.uco.mundoorigami.service.origamitype.impl;


import com.uco.mundoorigami.domain.OrigamiType;
import com.uco.mundoorigami.mapper.OrigamiTypeMapper;
import com.uco.mundoorigami.model.OrigamiTypeEntity;
import com.uco.mundoorigami.repository.OrigamiTypeRepository;
import com.uco.mundoorigami.service.origamitype.OrigamiTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrigamiTypeServiceImpl implements OrigamiTypeService {

    private final OrigamiTypeRepository origamiTypeRepository;
    private final OrigamiTypeMapper origamiTypeMapper;
    @Autowired
    public OrigamiTypeServiceImpl(OrigamiTypeRepository origamiTypeRepository, OrigamiTypeMapper origamiTypeMapper) {
        this.origamiTypeRepository = origamiTypeRepository;
        this.origamiTypeMapper = origamiTypeMapper;
    }

    @Override
    public void save(OrigamiType origamiType) {
        origamiTypeRepository.save(origamiTypeMapper.toOrigamiTypeEntity(origamiType));

    }

    @Override
    public List<OrigamiType> getAllByStatusOrigamiType(String status) {

        return  origamiTypeMapper.toOrigamiTypeList(origamiTypeRepository.findByStatus(status));
    }

    @Override
    public void delete(int code) {
        OrigamiTypeEntity origamiTypeToDelete = this.origamiTypeRepository.findByCode(code, "A");
        origamiTypeToDelete.setStatus("I");
        this.origamiTypeRepository.save(origamiTypeToDelete);

    }

    @Override
    public OrigamiType updateOrigamiType(OrigamiType origamiType) {
        OrigamiTypeEntity origamiTypeToUpdate = this.origamiTypeRepository.findByCode(origamiType.getCode(), "A");
        origamiTypeToUpdate.setName(origamiType.getName());
        return origamiTypeMapper.toOrigamiType(origamiTypeRepository.save(origamiTypeToUpdate));

    }
}
