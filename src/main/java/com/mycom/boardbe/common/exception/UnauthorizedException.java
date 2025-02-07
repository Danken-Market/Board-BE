package com.mycom.boardbe.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Http status code 401
// 클라이언트가 인증되지 않았거나 인증 자격 증명이 유효하지 않을 때 발생하는 예외입니다.
// (이는 주로 인증이 필요한 리소스에 접근하려고 할 때 사용)
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}
