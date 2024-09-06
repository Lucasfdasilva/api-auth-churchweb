package com.ibajp.churchweb.controller;

import com.ibajp.churchweb.dto.CriarUsuarioRequest;
import com.ibajp.churchweb.dto.UsuarioResponse;
import com.ibajp.churchweb.service.UsuarioHandlerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/usuario")
@RequiredArgsConstructor
public class UsuarioHandlerController {

    @Autowired
    private UsuarioHandlerService usuarioHandlerService;

    @PostMapping
    public ResponseEntity<UsuarioResponse> criarUsuario(@RequestBody CriarUsuarioRequest request, UriComponentsBuilder uriBuilder) {

        UsuarioResponse response = usuarioHandlerService.criarUsuario(request);

        URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(response.getId()).toUri();

        return ResponseEntity.created(uri).body(response);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UsuarioResponse> atualizarUsuario(@RequestBody CriarUsuarioRequest request, @PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(usuarioHandlerService.atualizarUsuario(id,request));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deletarUsuario(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(usuarioHandlerService.deletarUsuario(id));
    }

}
