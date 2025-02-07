package com.mycom.boardbe.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// HTTP status codes 404
// 리소스를 찾을 수 없을 때 발생하는 예외입니다.
// (데이터베이스에서 특정 엔티티를 찾을 수 없을 때 발생)
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
