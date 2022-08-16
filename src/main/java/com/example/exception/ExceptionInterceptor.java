package com.example.exception;

import com.example.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionInterceptor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public final ResponseEntity<Object> handleAllExceptions(CustomException ex) {
        CustomExceptionSchema customExceptionSchema = new CustomExceptionSchema(
                ex.getMessage(), ex.getHint());

        return new ResponseEntity(customExceptionSchema, HttpStatus.BAD_REQUEST);
    }
}
