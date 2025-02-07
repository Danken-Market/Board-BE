package com.mycom.boardbe.common.dto.response;

import org.springframework.http.HttpStatus;

public record ErrorResponse(int status, String message) {
    public ErrorResponse(HttpStatus status, String message) {
        this(status.value(), message);
    }
}
