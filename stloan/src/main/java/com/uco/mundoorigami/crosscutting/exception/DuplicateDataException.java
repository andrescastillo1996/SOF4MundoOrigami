package com.uco.mundoorigami.crosscutting.exception;

public class DuplicateDataException extends BaseException{
    public DuplicateDataException(String techMessage, String userMessage) {
        super(techMessage, userMessage);
    }
}
