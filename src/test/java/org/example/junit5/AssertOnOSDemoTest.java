package org.example.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class AssertOnOSDemoTest {

    AssertOnOSDemo demo;

    @BeforeEach
    void setUp() {
        demo = new AssertOnOSDemo();
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @DisplayName(value = "Execute this method on windows")
    void testWindows(){
        assertEquals("Windows 11", demo.windows());
    }

    @Test
    @EnabledOnOs(OS.MAC)
    @DisplayName(value = "Execute this method on mac")
    void testMac(){
        assertNotEquals("Hello", demo.mac());
    }
}
