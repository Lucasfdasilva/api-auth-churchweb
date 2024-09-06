package com.ibajp.churchweb.enumerarions;

public enum StatusUsuarioEnum {

    STATUS_ATIVO((short) 1, "ATIVO"),
    STATUS_BLOQUEADO((short) 2, "BLOQUEADO");


    private final short codigo;
    private final String status;

    StatusUsuarioEnum(short code, String status) {
        this.codigo = code;
        this.status = status;
    }

    public static String getStatusByCodigo(short codigo) {
        for (StatusUsuarioEnum statusEnum : StatusUsuarioEnum.values()) {
            if (statusEnum.getCode() == codigo) {
                return statusEnum.getMessage();
            }
        }
        return "Status inválido";
    }
    public short getCode() {
        return codigo;
    }

    public String getMessage() {
        return status;
    }
}
