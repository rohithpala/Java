package FinalKeyword;

final class Corona {
    //This is a final class , can't be extended or inherited
    static void print(){
        System.out.println("Wear A Mask When You Go Out");
    }
}

//Gives An Error : So Commented
//class India extends Corona{
//    void print(){
//        System.out.println("Wear A Mask When You Go Out");
//    }
//}

class HasFinalMethod{
    static final void finalMethod() {
        System.out.println("Hey There! I am a Final Method , Don't Ever Dare to Override Me :)");
    }
}

class CantExtend extends HasFinalMethod{
//    Gives An Error : So Commented
//    void finalMethod(){
//        System.out.println("Oh! Man");
//    }
}

public class Final{
    public static void main(String[] args) {
        final int i = 1;
        // i = 2; i is a final variable so the value can't be changed.
        Corona.print();
        HasFinalMethod.finalMethod();
    }
}
