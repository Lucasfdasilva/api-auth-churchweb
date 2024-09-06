package com.ibajp.churchweb.service;

import com.ibajp.churchweb.dto.UsuarioResponse;

import java.util.List;

public interface UsuarioGetService {

    UsuarioResponse findById(Long id);

    List<UsuarioResponse> findAll();
}
