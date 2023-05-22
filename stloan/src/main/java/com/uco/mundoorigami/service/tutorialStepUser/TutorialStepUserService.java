package com.uco.mundoorigami.service.tutorialStepUser;



import com.uco.mundoorigami.domain.TutorialStepUser;

import java.util.List;

public interface TutorialStepUserService {

        TutorialStepUser save (TutorialStepUser tutorialStepUser);

        List<TutorialStepUser> getAllByStatus(String status);

        void delete(int code);

    TutorialStepUser update(TutorialStepUser user);
}
