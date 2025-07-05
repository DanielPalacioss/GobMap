package com.gobmap.access_control.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponseDTO {
    private String message;
    private String code;
}
