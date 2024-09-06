package com.ibajp.churchweb.service;

import com.ibajp.churchweb.dto.CriarUsuarioRequest;
import com.ibajp.churchweb.dto.UsuarioResponse;
import com.ibajp.churchweb.entities.Usuario;
import com.ibajp.churchweb.enumerarions.ErrorCode;
import com.ibajp.churchweb.exeptions.BusinessException;
import com.ibajp.churchweb.repository.UsuarioRepository;
import com.ibajp.churchweb.util.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class UsuarioHandlerServiceImpl implements UsuarioHandlerService {

    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioMapper mapper;


    @Override
    public UsuarioResponse criarUsuario(CriarUsuarioRequest request) {
        return null;
    }

    @Override
    public UsuarioResponse atualizarUsuario(Long id, CriarUsuarioRequest request) {
        return null;
    }

    @Override
    public String deletarUsuario(Long id) {
        return "";
    }

    private Usuario buscarPessoa(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BusinessException(ErrorCode.USER_NOT_FOUND));

    }
}
