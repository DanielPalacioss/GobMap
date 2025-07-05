package com.gobmap.access_control.controlador;

import com.gobmap.access_control.dto.ErrorResponseDTO;
import com.gobmap.access_control.exception.RequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public Mono<ResponseEntity<?>> handleException(RuntimeException ex) {
        return Mono.error(ex);

    }
    @ExceptionHandler(RequestException.class)
    public Mono<ResponseEntity<ErrorResponseDTO>> handleRequestException(RequestException e) {
        ErrorResponseDTO errorResposne = ErrorResponseDTO.builder()
                .message(e.getMessage())
                .code(e.getCode())
                .build();
        return Mono.just(ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResposne));
    }

}
