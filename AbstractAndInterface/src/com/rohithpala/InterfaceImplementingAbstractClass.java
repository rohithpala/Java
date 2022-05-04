package com.rohithpala;

import java.util.Scanner;

interface ImplementingAbstract {
    public void setCalories(int calories);
    public void getFat();
}

class Family implements ImplementingAbstract {
    int calories;
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void getFat() {
        if(calories > 10000)
            System.out.println("You have Fat\n");
        else
            System.out.println("You don't have Fat\n");
    }
}

public class InterfaceImplementingAbstractClass{
    public static void main(String[] args) {
        int givenCalories;
        Family person = new Family();
        System.out.print("Enter Calories: ");
        givenCalories = (new Scanner(System.in)).nextInt();
        person.setCalories(givenCalories);
        person.getFat();
    }
}
