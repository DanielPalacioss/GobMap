package com.gobmap.gobmap.dto.response;

import lombok.Builder;

@Builder
public class ErrorResponse {
    private final String message;
    private final String code;
}
