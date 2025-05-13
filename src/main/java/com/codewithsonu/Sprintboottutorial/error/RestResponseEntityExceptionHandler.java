package com.codewithsonu.Sprintboottutorial.error;

import com.codewithsonu.Sprintboottutorial.Entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    // there write the code for creating actual exception in DepartmentNotFoundException which
    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMessage> DepartmentNotFoundException(DepartmentNotFoundException exception ,
                                                                   WebRequest request){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());

        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);

    }
}
