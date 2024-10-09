package org.example.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertSameORNotSameDemoTest {

    AssertSameORNotSameDemo demo;

    @BeforeEach
    void setUp() {
        demo = new AssertSameORNotSameDemo();
    }

    @Test
    @DisplayName(value = "Check if two string objects are same or not")
    void testObjectsAreSameOrNot(){
        //Arrange
        String s1 = "demo";

        //Act and Assert
        assertSame(demo.getS1(), demo.getS2(), "Both string objects are equal 😀");
        assertNotSame(s1, demo.getS1(), "Given string is not same as "+ demo.getS1() + " 👎");
    }
}
