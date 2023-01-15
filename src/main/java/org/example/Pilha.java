package org.example;

import java.util.ArrayList;

public class Pilha {
    public String[] elementos;
    private int size;

    private static final int TAMANHO_MAXIMO = 10;

    public Pilha() {
        this.size = 0;
        elementos = new String[TAMANHO_MAXIMO];
    }
    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push(String elemento) {
        if(this.size == TAMANHO_MAXIMO) {
            throw new PilhaCheiaException("Pilha Cheia! A pilha já possui " + this.size + " elementos");
        }
        elementos[size] = elemento;
        this.size++;
    }

    public String peek() {
        return elementos[size - 1];
    }

    public String pop() {
        if(this.isEmpty()){
            throw new PilhaVaziaException("A pilha está vazia!");
        }
        String elementoRetirado = peek();
        elementos[size -1] = null;
        size--;
        return elementoRetirado;
    }
}
