package com.weg.iniciandojpa.exceptions;

public class UsuarioNaoExisteException extends RuntimeException  {
    public UsuarioNaoExisteException(){
        super("O usuário não existe no sistema!");
    }

}
