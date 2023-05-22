package com.uco.mundoorigami.service.Resource;




import com.uco.mundoorigami.domain.Resource;

import java.util.List;

public interface ResourceService {
    Resource save (Resource resource);
    List<Resource> getAllByStatusResouce(String status);
    void delete(int code);

    Resource update(Resource resource);

}
