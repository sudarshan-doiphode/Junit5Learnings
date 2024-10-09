package org.example.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisableTestCaseDemoTest {

    DisableTestCaseDemo demo;

    @BeforeEach
    void setUp() {
        demo = new DisableTestCaseDemo();
    }

    @Test
    @Disabled(value = "Demo method is currently in maintenance, it will be ignored ⚒️")
    void testDemo(){
        String expected = "Hello World";

        assertEquals(expected, demo.demo());
    }
}