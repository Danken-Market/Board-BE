package com.mycom.boardbe.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Http status code 400
// 클라이언트가 잘못된 입력을 제공했을 때 발생하는 예외입니다.
// (이는 주로 입력 데이터의 유효성 검사가 실패했을 때 사용)
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
