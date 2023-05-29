package com.uco.mundoorigami.service.tutorialStep;



import java.util.List;

public interface TutorialStepService {

    TutorialStep2 save (TutorialStep2 tutorialStep2);


    List<TutorialStep2> getAllByStatus(String status);
    void delete(int code);

    TutorialStep2 update(TutorialStep2 tutorialStep2);
}
