package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTeste {

    @Test
    public void pilhaDeveSerVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.isEmpty());
        assertEquals(0,pilha.getSize());
    }

    @Test
    public void deveEmpilharUmElementoNaPilha() {
        Pilha pilha = new Pilha();
        pilha.push("Maria");
        assertFalse(pilha.isEmpty());
        assertEquals(1,pilha.getSize());
        assertEquals("Maria",pilha.peek());
    }

    @Test
    public void deveEmpilharDoisElementoEDesempilharUmElemento() {
        Pilha pilha = new Pilha();
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
}
