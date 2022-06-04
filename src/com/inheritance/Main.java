package com.inheritance;

public class Main {

    public static void main(String[] args) {

        Employee salariedEmployee= new SalariedEmployee("yass","auun",
                "111-444-566",500.0);
        
        System.out.printf("%s",salariedEmployee.toString());
    }
}
