package com.weg.iniciandojpa.service;

import com.weg.iniciandojpa.exceptions.UsuarioJaExisteExceptions;
import com.weg.iniciandojpa.exceptions.UsuarioNaoExisteException;
import com.weg.iniciandojpa.model.Usuario;
import com.weg.iniciandojpa.repositorio.UsuarioRepositorio;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepositorio repositorio;

    public Usuario criarUsuario(Usuario usuario){

       if(repositorio.existsByNome(usuario.getNome())){
           throw new UsuarioJaExisteExceptions();

        }

       return repositorio.save(usuario);
    }

    public List<Usuario> obterUsuario(){
        return repositorio.findAll();
    }

         public Usuario atualizarUsuario(Long id, Usuario usuario){
         if(!repositorio.existsById(id)){
             throw new UsuarioNaoExisteException();
         }
         usuario.setId(id);
         return repositorio.save(usuario);
         }
    public Usuario obterUsuarioPorId(Long id) {
             return repositorio.findById(id)
                     .orElseThrow(() -> {
                         throw new UsuarioNaoExisteException();

                      } );
    }

    public void deletarUsuario(Long id) {
        if(!repositorio.existsById(id)){
            throw  new UsuarioNaoExisteException();
        }
        repositorio.deleteById(id);

    }
}
