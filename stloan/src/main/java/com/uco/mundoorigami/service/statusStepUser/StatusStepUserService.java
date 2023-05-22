package com.uco.mundoorigami.service.statusStepUser;



import com.uco.mundoorigami.domain.StatusStepUser;

import java.util.List;


public interface StatusStepUserService {
    StatusStepUser save (StatusStepUser statusStepUser);

    List<StatusStepUser> getAllByStatus(String status);
    void delete(int code);

    StatusStepUser update(StatusStepUser statusStepUser);
}
