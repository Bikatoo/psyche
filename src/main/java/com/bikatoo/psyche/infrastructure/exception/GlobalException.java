package com.bikatoo.psyche.infrastructure.exception;

import lombok.Getter;

import java.util.UUID;

@Getter
public class GlobalException extends RuntimeException {

    protected UUID exceptionId;
    protected ExceptionCode code;
    protected String message;
    protected String userHint;

    public GlobalException(ExceptionCode code, String message, String userHint) {

        this.exceptionId = UUID.randomUUID();
        this.code = code;
        this.message = message;
        this.userHint = userHint;
    }

    public GlobalException(ExceptionCode code, String message) {

        this.exceptionId = UUID.randomUUID();
        this.code = code;
        this.message = message;
    }
}
