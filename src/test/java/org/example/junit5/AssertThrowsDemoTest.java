package org.example.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertThrowsDemoTest {

    AssertThrowsDemo demo;

    @BeforeEach
    void setUp() {
        demo = new AssertThrowsDemo();
    }

    @Test
    @DisplayName(value = "Method throws exception for negative value")
    void testAssertThrows(){
        //Act and Assert
        assertDoesNotThrow(() -> demo.getNumber(1), "Number should be positive");
        assertThrows(RuntimeException.class, () -> {
            demo.getNumber(-1);
        }, "Number should be positive in order to avoid exception");
    }
}