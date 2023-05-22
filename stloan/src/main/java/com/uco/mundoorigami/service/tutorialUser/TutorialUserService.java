package com.uco.mundoorigami.service.tutorialUser;



import com.uco.mundoorigami.domain.TutorialUser;

import java.util.List;

public interface TutorialUserService {
    TutorialUser save (TutorialUser tutorialUser);

    List<TutorialUser> getAllByStatus(String status);

    void delete(int code);

    TutorialUser update(TutorialUser tutorialUser);
}
