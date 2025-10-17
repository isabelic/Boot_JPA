package com.weg.iniciandojpa.controller;


import com.weg.iniciandojpa.model.Usuario;
import com.weg.iniciandojpa.service.UsuarioService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    public ResponseEntity<Usuario> postUsuario(
            @RequestBody Usuario usuario
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.criarUsuario(usuario));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> obterUsuario(){
        return ResponseEntity.status(HttpStatus.OK).body(service.obterUsuario());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioPorId(
            @PathVariable Long id
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.obterUsuarioPorId(id));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Usuario> putUsuario(
            @PathVariable Long id,
            @RequestBody Usuario usuario
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.atualizarUsuario(id, usuario));
    }



    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deleteUsuario(
            @PathVariable Long id

    ){
        service.deletarUsuario(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .build();
    }
}
