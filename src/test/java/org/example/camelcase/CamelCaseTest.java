package org.example.camelcase;

import org.example.exercises.camelcase.TransformCamelCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CamelCaseTest {



    @Test
    public void deveTransformarUmaPalavraEmCamelCaseEmUmaString() {
        Assertions.assertEquals("nome",TransformCamelCase.transform("nome"));
    }
}
