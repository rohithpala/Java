package MainPackage;
import InterfacePackage.*;
import AbstractPackage.*;

class MainInterface implements Interface{
    public void DisplayAll() {
        System.out.println(interfaceDef + " , " + interfacePub);
    }
    public void Age(short age) {
        System.out.println("Age: " + age);
    }
}

class MainAbstract extends Abstract{
    public void DisplayAll() {
      /*System.out.println("Private Variable: " + abPri);
        System.out.println("Default Variable: " + adDef);*/
        System.out.println("Protected Variable: " + abPro);
        System.out.println("Public Variable: " + abPub);
    }
}

public class HasMain {
    public static void main(String[] args) {
        MainInterface interfaceVar = new MainInterface();
        interfaceVar.DisplayAll();
        interfaceVar.Age((short) 18);
        System.out.println();

        MainAbstract abstractVar = new MainAbstract();
        abstractVar.DisplayAll();
    }
}