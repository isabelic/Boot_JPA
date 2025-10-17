package com.weg.iniciandojpa.exceptions;

public class UsuarioJaExisteExceptions extends RuntimeException {

    public UsuarioJaExisteExceptions(){
            super("O usuário já está cadastrado no sistema!");
        }
}
