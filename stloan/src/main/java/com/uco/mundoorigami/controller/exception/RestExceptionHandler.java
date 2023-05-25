package com.uco.mundoorigami.controller.exception;

import com.uco.mundoorigami.crosscutting.exception.BaseException;
import com.uco.mundoorigami.crosscutting.exception.DuplicateDataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.concurrent.ConcurrentHashMap;

@RestControllerAdvice
public class RestExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);
    private static final ConcurrentHashMap<String, HttpStatus> STATES = new ConcurrentHashMap<>();

    public static final String DEFAULT_MESSAGE = "Ocurrió un error procesando la solicitud. Por favor contacta al administrador del sistema.";


    public RestExceptionHandler() {
        STATES.put(DuplicateDataException.class.getSimpleName(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<Error> exceptionResolver(BaseException e) {
        HttpStatus status = STATES.get(e.getClass().getSimpleName());
        Error err = new Error(e.getClass().getSimpleName(), e.getTechMessage(), e.getUserMessage());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> exceptionResolver(Exception e) {
        Error err = new Error(e.getClass().getSimpleName(), e.getMessage(), DEFAULT_MESSAGE);
        LOGGER.error(e.getClass().getSimpleName(), e);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err);
    }

}
