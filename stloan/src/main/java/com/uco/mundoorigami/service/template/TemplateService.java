package com.uco.mundoorigami.service.template;

import com.uco.mundoorigami.domain.TutorialTemplate;

import java.util.List;

public interface TemplateService {

    void saveTemplate(TutorialTemplate template);


    List<TutorialTemplate> get(String status);
}
