package org.example.junit5;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndListDemoTests {
    private String[] arr = {"A", "B", "C"};
    private List<String> list = new ArrayList<>(List.of("A", "C", "B"));

    public List<String> getList() {
        return list;
    }

    public String[] getArr() {
        return arr;
    }
}
