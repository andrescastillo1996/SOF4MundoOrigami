package com.uco.mundoorigami.service.Resource.impl;



import com.uco.mundoorigami.domain.Resource;
import com.uco.mundoorigami.mapper.ResourceMapper;

import com.uco.mundoorigami.model.ResourceEntity;
import com.uco.mundoorigami.repository.ResourceRepository;
import com.uco.mundoorigami.service.Resource.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Autowired
    public ResourceServiceImpl(ResourceRepository resourceRepository, ResourceMapper resourceMapper) {
        this.resourceRepository = resourceRepository;
        this.resourceMapper = resourceMapper;
    }




    @Override
    public Resource save(Resource resource) {

       return resourceMapper.toResource(resourceRepository.save(resourceMapper.toResourceEntity(resource)));
    }

    @Override
    public List<Resource> getAllByStatusResouce(String status) {
        return   resourceMapper.toResourceList(resourceRepository.findByStatus(status));
    }



    @Override
    public void delete(int code) {
        ResourceEntity resourceToDelete = this.resourceRepository.findByCode(code, "A");
        resourceToDelete.setStatus("I");
        this.resourceRepository.save(resourceToDelete);
    }

    @Override
    public Resource update(Resource resource) {
        ResourceEntity resourceEntityToUpdate=this.resourceRepository.findByCode(resource.getCode(),"A");
        resourceEntityToUpdate.setDescription(resource.getDescription());
        resourceEntityToUpdate.setMaterial(resource.getMaterial());

        return resourceMapper.toResource(resourceRepository.save(resourceEntityToUpdate));
    }
}
