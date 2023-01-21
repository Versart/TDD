package org.example.exercises.camelcase;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CamelCaseTest {



    @Test
    public void deveTransformarUmaPalavraEmUmaListString() {
        assertSame(ArrayList.class,TransformCamelCase.transform("nome").getClass());
    }



}
