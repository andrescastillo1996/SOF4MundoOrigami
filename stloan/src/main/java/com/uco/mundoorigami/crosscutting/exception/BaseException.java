package com.uco.mundoorigami.crosscutting.exception;

import lombok.Getter;

@Getter
public abstract class BaseException extends  RuntimeException {




    private final String techMessage;
    private final String userMessage;


    protected BaseException (String techMessage, String userMessage){

        super(techMessage);
        this.techMessage= techMessage;
        this.userMessage = userMessage;

    }



}
