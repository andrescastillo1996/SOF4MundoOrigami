package com.uco.mundoorigami.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Error {

    private String exceptionName;
    private String techMessage;
    private String userMessage;
}
