package com.gobmap.gobmap.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponse {
    private final String message;
    private final String code;
}
