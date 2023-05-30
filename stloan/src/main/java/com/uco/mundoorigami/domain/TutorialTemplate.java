package com.uco.mundoorigami.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TutorialTemplate {
    private TutorialOrigami tutorial;
    private List<TutorialStep> steps;
}

