package com.mycom.boardbe.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// HTTP status codes 403
// 클라이언트가 인증되었지만 해당 리소스에 접근할 권한이 없을 때 발생하는 예외입니다.
@ResponseStatus(HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message);
    }
}
