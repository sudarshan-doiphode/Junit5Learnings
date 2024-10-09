package org.example.junit5;

public class AssertThrowsDemo {

    public int getNumber(int number){
        if(number<0){
            throw new RuntimeException("Number is negative");
        }
        return number;
    }
}
