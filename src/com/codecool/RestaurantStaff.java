package com.codecool;

import java.util.Date;
import java.util.Random;

public abstract class RestaurantStaff {
    private String name;
    private Date birthDate;
    private int salary;
    private final float taxPercent=0.99f;
    private Random random;


    public RestaurantStaff(String name, Date birthDate, int salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public float createTaxReport() {
        float tax = this.salary * taxPercent;
        return tax;
    }

    public String getName() {
        return name;
    }

    public Random getRandom() {
        return random;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
