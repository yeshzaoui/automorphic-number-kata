package com.codecrafters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutomorphicNumberTest {

    private final AutomorphicNumber automorphicNumber = new AutomorphicNumber();

    @Test
    public void should_return_automorphic_when_input_is_1() {
        // When
        String result = automorphicNumber.process(1);

        // Then
        assertEquals("Automorphic", result);
    }

    @Test
    void should_return_Not_when_input_is_2() {
        // When
        String result = automorphicNumber.process(2);

        // Then
        assertEquals("Not!!", result);
    }

    @Test
    void should_return_Not_when_input_is_3() {
        // When
        String result = automorphicNumber.process(3);

        // Then
        assertEquals("Not!!", result);
    }

    @Test
    void should_return_Automorphic_when_input_is_5() {
        // When
        String result = automorphicNumber.process(5);

        // Then
        assertEquals("Automorphic", result);
    }

    @Test
    void should_return_Automorphic_when_input_is_25() {
        // When
        String result = automorphicNumber.process(25);

        // Then
        assertEquals("Automorphic", result);

    }
}