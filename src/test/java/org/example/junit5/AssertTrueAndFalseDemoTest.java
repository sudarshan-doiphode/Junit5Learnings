package org.example.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertTrueAndFalseDemoTest {

    AssertTrueAndFalseDemo demo;

    @BeforeEach
    void setUp() {
        demo = new AssertTrueAndFalseDemo();
    }

    @Test
    void isGreaterTestTrue(){
        //Arrange
        boolean expected = true;
        boolean unexpected = false;

        //act
        boolean actual = demo.isGreater(5, 4);

        //assert
        assertTrue(actual, "Given value is greater");
    }

    @Test
    void isGreaterTestFalse(){
        //Arrange
        boolean expected = true;
        boolean unexpected = false;

        //act
        boolean actual = demo.isGreater(3, 4);

        //assert
        assertFalse(actual, "Given value is greater");
    }
}
