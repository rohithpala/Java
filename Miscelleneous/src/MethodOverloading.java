class MethodOverloaded{
    String firstName ,lastName;
    MethodOverloaded(){
        String firstName = "PALA";
        String lastName = "ROHITH";
    }
    MethodOverloaded(String firstName ,String lastName){
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
class MethodOverloading{
    public static void main(String[] args){
        MethodOverloaded name = new MethodOverloaded("Pala","Rohith");
        name.showName();
    }
}
