package com.uco.mundoorigami.service.origami;



import com.uco.mundoorigami.domain.TutorialStep;

import java.util.List;

public interface OrigamiService {

    TutorialStep save(TutorialStep tutorialStep);

    List<TutorialStep> getAllByStatus(String status);

    List<TutorialStep> getAllByTutorialId(int tutorialId, String status);
    void delete(int code);

    TutorialStep update(TutorialStep tutorialStep);





}
