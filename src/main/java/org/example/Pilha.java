package org.example;

import java.util.ArrayList;

public class Pilha {
    public String[] elementos;
    private int size;

    public Pilha() {
        this.size = 0;
        elementos = new String[10];
    }
    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push(String elemento) {
        elementos[size] = elemento;
        this.size++;
    }

    public String peek() {
        return elementos[size - 1];
    }

    public String pop() {
        String elementoRetirado = elementos[size - 1];
        elementos[size -1] = null;
        size--;
        return elementoRetirado;
    }
}
