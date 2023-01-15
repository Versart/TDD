package org.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTeste {
    private Pilha pilha;

    @BeforeEach
    public void initialize() {
        pilha = new Pilha();
    }
    @Test
    public void pilhaDeveSerVazia() {
        assertTrue(pilha.isEmpty());
        assertEquals(0,pilha.getSize());
    }

    @Test
    public void deveEmpilharUmElementoNaPilha() {
        pilha.push("Maria");
        assertFalse(pilha.isEmpty());
        assertEquals(1,pilha.getSize());
        assertEquals("Maria",pilha.peek());
    }

    @Test
    public void deveEmpilharDoisElementoEDesempilharUmElemento() {
        pilha.push("Maria");
        pilha.push("João");
        assertFalse(pilha.isEmpty());
        assertEquals(2,pilha.getSize());
        assertEquals("João",pilha.peek());
        String elementoRetirado = pilha.pop();
        assertEquals(1,pilha.getSize());
        assertEquals("Maria",pilha.peek());
        assertEquals("João", elementoRetirado);
    }

    @Test
    public void deveLancarExceptionAoTentarRemoverDaPilhaVazia() {
        assertThrows(PilhaVaziaException.class, () ->
            pilha.pop()
        );
    }

    @Test
    public void deveLancarExceptionAoTentarAdicionarElementoNaPilhaCheia() {
        assertThrows(PilhaCheiaException.class, () -> {
            for(int i=0; i < 11; i++){
                pilha.push("Maria");
            }
        });
    }
}
