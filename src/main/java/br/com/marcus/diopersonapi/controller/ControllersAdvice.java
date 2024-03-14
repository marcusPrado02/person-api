package br.com.marcusprado.diopersonapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.marcusprado.diopersonapi.exception.NotFoundException;

@ControllerAdvice
public class ControllersAdvice {
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public void notFound() {}
}
