package com.ibajp.churchweb.controller;

import com.ibajp.churchweb.dto.UsuarioResponse;
import com.ibajp.churchweb.service.UsuarioGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class UsuarioGetController {

    @Autowired
    UsuarioGetService usuarioGetService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UsuarioResponse> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(usuarioGetService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> findAll() {
        return ResponseEntity.ok().body(usuarioGetService.findAll());
    }
}
