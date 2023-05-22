package com.uco.mundoorigami.service.tutorialStep;



import com.uco.mundoorigami.domain.TutorialStep;

import java.util.List;

public interface TutorialStepService {

    TutorialStep save (TutorialStep tutorialStep);


    List<TutorialStep> getAllByStatus(String status);
    void delete(int code);

    TutorialStep update(TutorialStep tutorialStep);
}
