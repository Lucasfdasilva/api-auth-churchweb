package com.ibajp.churchweb.enumerarions;

public enum TipoUsuarioEnum {

    USUARIO_ADM((short) 1, "ADM"),
    USUARIO_MODERADOR((short) 2, "MODERADOR"),
    USUARIO_COMUM((short) 3, "COMUM");


    private final short codigo;
    private final String tipoUsuario;

    TipoUsuarioEnum(short code, String tipoUsuario) {
        this.codigo = code;
        this.tipoUsuario = tipoUsuario;
    }

    public static String getTipoByCodigo(short codigo) {
        for (TipoUsuarioEnum tipoUsuarioEnum : TipoUsuarioEnum.values()) {
            if (tipoUsuarioEnum.getCode() == codigo) {
                return tipoUsuarioEnum.getMessage();
            }
        }
        return "Tipo de usuario inválido";
    }

    public short getCode() {
        return codigo;
    }

    public String getMessage() {
        return tipoUsuario;
    }
}
