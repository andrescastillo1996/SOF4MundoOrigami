package com.uco.mundoorigami.service.tutorialStatusUser;


import com.uco.mundoorigami.domain.TutorialStatusUser;

import java.util.List;

public interface TutorialStatusUserService {
    TutorialStatusUser save(TutorialStatusUser tutorialStatusUser);

    List<TutorialStatusUser> getAllByStatus(String status);
    void delete(int code);

    TutorialStatusUser update(TutorialStatusUser tutorialStatusUser);
}
