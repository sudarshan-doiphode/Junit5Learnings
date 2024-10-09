package org.example.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = DisplayNameGenerator.Simple.class)
class DisplayNameDemoTest {

    DisplayNameDemo demo;

    @BeforeEach
    void setUp() {
        demo = new DisplayNameDemo();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test case executed 😀");
    }

    // Method level Display name have high precedence over class level annotation
    @Test
    @DisplayName(value = "Adding only positive values")
    void testAddOnlyPositive(){
        //Arrange
        int expected = 5;
        int unexpected = 10;

        //Act
        int actual = demo.addingPositiveValues(-2, -3);

        //Assert
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }
}