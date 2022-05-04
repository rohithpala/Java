package PassingObjects_Inheritence_Overloading_Static_Super;

class MethodOverloading{
    String firstName ,lastName;
    MethodOverloading(){
        String firstName = "PALA";
        String lastName = "ROHITH";
    }
    MethodOverloading(String firstName ,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void showName(){
        show(firstName,lastName);
        System.out.println(". Good To See You Back");
    }
    void show(String firstName ,String lastName){
        System.out.print("Hi " + firstName + " " + lastName);
    }
}
class Main{
    public static void main(String[] args){
        MethodOverloading name = new MethodOverloading("Pala","Rohith");
        name.showName();
    }
}
