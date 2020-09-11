package com.slava_bull.cft_shift.rest;

import com.slava_bull.cft_shift.exception.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;
import java.util.stream.Collectors;

public abstract class ErrorController {

    @ExceptionHandler(value = BadRequestException.class)
    ResponseEntity<?> badRequest(BadRequestException e) {
        Map<String, String> errors = e.getBindingResult().getFieldErrors().stream().collect(Collectors.toMap(
                fieldError -> fieldError.getField() + " Error",
                fieldError -> {
                    if (fieldError.getDefaultMessage() == null) return "Unknown error";
                    else return fieldError.getDefaultMessage();
                }
        ));
        return ResponseEntity.badRequest().body(errors);
    }
}
