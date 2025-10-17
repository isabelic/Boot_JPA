package com.weg.iniciandojpa.repositorio;


import com.weg.iniciandojpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {
    boolean existsByNome (String nome);


}
