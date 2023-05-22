package com.uco.mundoorigami.service.origamitype;



import com.uco.mundoorigami.domain.OrigamiType;

import java.util.List;

public interface OrigamiTypeService {
    void save (OrigamiType origamiType);
    List<OrigamiType> getAllByStatusOrigamiType(String status);
    void delete(int code);

    OrigamiType updateOrigamiType(OrigamiType origamiType);
}
