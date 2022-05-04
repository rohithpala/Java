package Week6_StringHandling_Synchronized_IPC_Deadlock.StringHandling;

public class equalsMethod {
    public static void main(String[] args) {
        String name = "Rohith";
        String name1 = "Rohith";
        String nameObject = new String("Rohith");
        String nameObject1 = new String("Rohith");
        if (name == nameObject){
            System.out.println("I am in String, String Object block");
        }
        if (name == name1){
            System.out.println("I am in String to String \"==\" block");
        }
        if(name.equals(nameObject)){
            System.out.println("I am in String to String Object equals() block");
        }
        if(nameObject.equals(name)){
            System.out.println("I am in String Object to String equals() block");
        }else{
            System.out.println("Not Equal");
        }
    }
}