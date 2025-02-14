package com.works.configs;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class GlobalException {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object methodArgumentNotValid( MethodArgumentNotValidException ex ) {
        return parseError(ex.getFieldErrors());
    }

    private Set parseError(List<FieldError> fieldErrors) {
        Set<Map<String, Object>> ls = new LinkedHashSet();
        for (FieldError fieldError : fieldErrors) {
            Map<String, Object> map = new HashMap();
            String field = fieldError.getField();
            String message = fieldError.getDefaultMessage();
            Object rejectedValue = fieldError.getRejectedValue();
            map.put("field", field);
            map.put("message", message);
            map.put("rejectedValue", rejectedValue);
            ls.add(map);
        }
        return ls;
    }


}
