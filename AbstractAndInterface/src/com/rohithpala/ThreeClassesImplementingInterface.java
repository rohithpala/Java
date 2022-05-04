package com.rohithpala;

import java.util.Scanner;

interface Details{
    public void printName(String name);
    public void showAge(short age);
}

class GrandFather implements Details{
    public void printName(String name) {
        System.out.println("GrandFather's Name: " + name);
    }
    public void showAge(short age) {
        System.out.println("GrandFather's Age: " + age);
    }
}

class Father implements Details{
    public void printName(String name) {
        System.out.println("Father's Name: " + name);
    }
    public void showAge(short age) {
        System.out.println("Father's Age: " + age);
    }
}

class Son implements Details{
    public void printName(String name) {
        System.out.println("Son's Name: " + name);
    }
    public void showAge(short age) {
        System.out.println("Son's Age: " + age);
    }
}

public class ThreeClassesImplementingInterface {
    public static void main(String[] args) {
        String name;
        short age;
        Scanner input = new Scanner(System.in);
        GrandFather grandFather = new GrandFather();
        Father father = new Father();
        Son son = new Son();
        System.out.print("Enter Your GrandFather Name And Age: ");
        name = input.next();
        age = input.nextShort();
        grandFather.printName(name);
        grandFather.showAge(age);
        System.out.print("Enter Your Father Name And Age: ");
        name = input.next();
        age = input.nextShort();
        father.printName(name);
        father.showAge(age);
        System.out.print("Enter Your Son Name And Age: ");
        name = input.next();
        age = input.nextShort();
        son.printName(name);
        son.showAge(age);
    }
}
