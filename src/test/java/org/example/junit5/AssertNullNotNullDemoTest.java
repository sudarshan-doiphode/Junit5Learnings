package org.example.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertNullNotNullDemoTest {

    AssertNullNotNullDemo demo;

    @BeforeEach
    void setUp() {
        demo = new AssertNullNotNullDemo();
    }

    @Test
    @DisplayName(value = "Check name is null or not null")
    void testNullNotNull(){
        //Arrange
        String expected = "sachin";
        String age = null;

        //Act and Assert
        assertNotNull(expected, () -> demo.getName());
        assertNull(age, ()-> demo.getAge());
    }
}