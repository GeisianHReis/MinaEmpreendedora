package br.org.generation.minaempreendedora.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUsuarioService {

    @Test
    public void testUsuario(){
        UsuarioService usuario = new UsuarioService();

        int retorno = usuario.retorno(5, 3);
        assertEquals(8, retorno);
    }
}
