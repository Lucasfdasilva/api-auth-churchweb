package com.ibajp.churchweb.service;

import com.ibajp.churchweb.dto.CriarUsuarioRequest;
import com.ibajp.churchweb.dto.UsuarioResponse;

import java.util.List;

public interface UsuarioHandlerService {

    UsuarioResponse criarUsuario(CriarUsuarioRequest request);

    UsuarioResponse atualizarUsuario(Long id, CriarUsuarioRequest request);

    String deletarUsuario(Long id);
}
