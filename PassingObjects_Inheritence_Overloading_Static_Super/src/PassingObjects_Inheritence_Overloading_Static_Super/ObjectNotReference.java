package PassingObjects_Inheritence_Overloading_Static_Super;

//In this program "new Student()" is an object "student1" is a reference to "new Student()" object
public class ObjectNotReference {
    static class Student{
        String name;
        short age = 17;
        Student(){
            name = "Default";
        }
        void sayHello() {
            System.out.println("Hello " + name);
        }
    }
    public static void main(String[] args){
        Student student1 = new Student();
        student1.sayHello();
    }
}
