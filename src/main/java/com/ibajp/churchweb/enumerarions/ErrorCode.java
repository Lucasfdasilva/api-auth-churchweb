package com.ibajp.churchweb.enumerarions;

public enum ErrorCode {

    USER_NOT_FOUND("ERR001", "Usuario não encontrado"),
    INVALID_EMAIL("ERR002", "Email é invalido");


    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}