package com.uco.mundoorigami.service.origami;



import com.uco.mundoorigami.domain.Origami;

import java.util.List;

public interface OrigamiService {

    Origami save(Origami origami);

    List<Origami> getAllByStatus(String status);
    void delete(int code);

    Origami update(Origami origami);





}
