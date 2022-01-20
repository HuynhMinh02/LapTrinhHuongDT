package com.minhhh2004110025.buoi3;

public class MyIntegerTestDrive {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(20);
        myInteger.increment().greaterThan(myInteger);

        MyInteger myInteger2 = new MyInteger(20);
        myInteger2.increment().lessThan(myInteger2);
    }
    
}
