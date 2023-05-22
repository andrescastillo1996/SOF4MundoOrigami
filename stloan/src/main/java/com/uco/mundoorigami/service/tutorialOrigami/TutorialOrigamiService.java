package com.uco.mundoorigami.service.tutorialOrigami;



import com.uco.mundoorigami.domain.TutorialOrigami;

import java.util.List;

public interface TutorialOrigamiService {
    TutorialOrigami save(TutorialOrigami tutorialOrigami);

    List<TutorialOrigami> getAllByStatus(String status);
    void delete(int code);

    TutorialOrigami update(TutorialOrigami tutorialOrigami);
}
