package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTeste {

    @Test
    public void pilhaDeveSerVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.isEmpty());
        assertEquals(0,pilha.size());
    }
}
