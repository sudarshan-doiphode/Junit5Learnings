package org.example.junit5;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = DisplayNameGenerator.Simple.class)
class ArrayAndListDemoTestsTest {
    ArrayAndListDemoTests demo;

    @BeforeEach
    void setUp() {
        demo = new ArrayAndListDemoTests();
    }

    @Test
    void testArraysAreEqualsOrNot(){
        //Arrange
        String[] arr = {"A", "B", "C"};

        //Act-Assert
        assertArrayEquals(arr, demo.getArr(), "Both arrays should be equal");
    }

    @Test
    void testListsAreEqualOrNot(){
        List<String> list = new ArrayList<>(List.of("A", "C", "B"));

        assertIterableEquals(list, demo.getList(), "Both list should be equal");
    }
}