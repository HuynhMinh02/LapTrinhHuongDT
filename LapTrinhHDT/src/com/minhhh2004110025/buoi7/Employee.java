package com.minhhh2004110025.buoi7;

public class Employee extends Person{
    
    private double salary;

    @Override
    public String toString() {
        return "Employee [salary=" + salary + "]" + "Name: " + this.name + "Birthday: " + this.birthday ;
    }
}
