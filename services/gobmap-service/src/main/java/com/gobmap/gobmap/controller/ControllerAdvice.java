package com.gobmap.gobmap.controller;

import com.gobmap.gobmap.Exception.RequestException;
import com.gobmap.gobmap.dto.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice
public class ControllerAdvice {

@ExceptionHandler(RuntimeException.class)
Mono<ResponseEntity<ErrorResponse>> handleException(RuntimeException ex){
    ErrorResponse error = ErrorResponse.builder().message(ex.getMessage()).code("500-Internal Server Error").build();
    return Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error));
}

@ExceptionHandler(RequestException.class)
Mono<ResponseEntity<ErrorResponse>> handleException(RequestException ex){
    ErrorResponse error = ErrorResponse.builder().message(ex.getMessage()).code(ex.getMessage()).build();
    return Mono.just(ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error));
}
}
