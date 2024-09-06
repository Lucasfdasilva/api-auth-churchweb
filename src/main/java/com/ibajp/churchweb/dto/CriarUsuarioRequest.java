package com.ibajp.churchweb.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CriarUsuarioRequest {


    private String nome;
    private String email;
    private String senha;

}
