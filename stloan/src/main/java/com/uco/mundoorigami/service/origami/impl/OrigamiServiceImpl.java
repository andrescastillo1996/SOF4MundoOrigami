package com.uco.mundoorigami.service.origami.impl;


import com.uco.mundoorigami.domain.Origami;
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
    public Origami save(Origami origami) {
        return origamiMapper.toOrigami(origamiRepository.save(origamiMapper.toOrigamiEntity(origami)));
    }

    @Override
    public List<Origami> getAllByStatus(String status) {
        return  origamiMapper.tOrigamiList(origamiRepository.findByStatus(status));
    }

    @Override
    public void delete(int code) {
        OrigamiEntity origamiToDelete = this.origamiRepository.findByCode(code, "A");
        origamiToDelete.setStatus("I");
        this.origamiRepository.save(origamiToDelete);

    }

    @Override
    public Origami update(Origami origami) {
        OrigamiEntity origamiToUpdate = this.origamiRepository.findByCode(origami.getCode(), "A");
        origamiToUpdate.setName(origami.getName());
        origamiToUpdate.setImageURL(origami.getImageURL());
        return origamiMapper.toOrigami(origamiRepository.save(origamiToUpdate));
    }

}
