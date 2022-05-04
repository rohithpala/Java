package com.rohithpala;

class OuterClass{
    class InnerClass{
        void innerDisplay(String name){
            System.out.println("Hey " + name + " ,I am in the Inner Class\n");
        }
    }
}

class MethodLocalInnerClass{
    void outerMethodDisplay(String name){
        System.out.println("Hey " + name + " ,I am in the Method Local Inner Class\n");
    }
    class InnerClass {
        void innerDisplay(String name) {
            System.out.println("Hey " + name + " ,I am in the Inner Class having a local Method\n");
        }
    }
}

abstract class AnonymousClass{
    abstract void AnonymousClassDisplay(String name);
}

class StaticInnerClass{
    static class InnerClass {
        void innerDisplay(String name) {
            System.out.println("Hey " + name + " ,I am in the Static Inner Class\n");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass ref = new OuterClass().new InnerClass();
        ref.innerDisplay("ROHITH");
        MethodLocalInnerClass ref1 = new MethodLocalInnerClass();
        ref1.outerMethodDisplay("ROHITH");
        new MethodLocalInnerClass().new InnerClass().innerDisplay("ROHITH");
        AnonymousClass ref2 = new AnonymousClass(){
            void AnonymousClassDisplay(String name) {
                System.out.println("Hey " + name + " ,I am in the Anonymous Class\n");
            }
        };
        StaticInnerClass.InnerClass ref3 = new StaticInnerClass.InnerClass();
        ref3.innerDisplay("ROHITH");
    }
}