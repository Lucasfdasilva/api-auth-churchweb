package com.ibajp.churchweb.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioResponse {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String tipoUsuario;
    private String statusUsuario;
}
