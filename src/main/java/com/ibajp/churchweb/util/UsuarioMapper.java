package com.ibajp.churchweb.util;

import com.ibajp.churchweb.dto.UsuarioResponse;
import com.ibajp.churchweb.entities.Usuario;
import com.ibajp.churchweb.enumerarions.StatusUsuarioEnum;
import com.ibajp.churchweb.enumerarions.TipoUsuarioEnum;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public UsuarioResponse mapearUsuarioResponse(Usuario usuario) {

        return UsuarioResponse.builder()
                .id(usuario.getId())
                .email(usuario.getEmail())
                .nome(usuario.getNome())
                .statusUsuario(StatusUsuarioEnum.getStatusByCodigo(usuario.getStatusUsuario()))
                .tipoUsuario(TipoUsuarioEnum.getTipoByCodigo(usuario.getTipoUsuario()))
                .senha(usuario.getSenha())
                .build();
    }
}
