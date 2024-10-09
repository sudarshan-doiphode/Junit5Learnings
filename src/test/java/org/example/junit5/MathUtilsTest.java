package org.example.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAddAssertEqualsNotEquals(){
        //Arrange
        int expected = 6;
        int unexpected = 9;

        //Act
        int actual = mathUtils.add(3,3);

        //Assert
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }

    @Test
    void testSubtractAssertEqualsNotEquals(){
        //Arrange
        int expected = 3;
        int unexpected = 9;

        //Act
        int actual = mathUtils.subtract(6,3);

        //Assert
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }

    @Test
    void testMultiplyAssertEqualsNotEquals(){
        //Arrange
        int expected = 6;
        int unexpected = 9;

        //Act
        int actual = mathUtils.multiply(3,2);

        //Assert
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }

    @Test
    void testDivideAssertEqualsNotEquals(){
        //Arrange
        int expected = 1;
        int unexpected = 9;

        //Act
        int actual = mathUtils.divide(3,3);

        //Assert
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }


}