package PassingObjects_Inheritence_Overloading_Static_Super;

public class PassingObjects {
    static class Relation{
        int a , b , c;
        Relation(int a,int b,int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        Relation Comparison(Relation ob){
            if(ob.a > this.a && ob.b > this.b && ob.c > this.c)
                return ob;
            else if(ob.a < this.a && ob.b < this.b && ob.c < this.c)
                return this;
            return this;
        }
    }
    public static void main(String[] args){
        Relation ref = new Relation(1,2,3);
        Relation ob = new Relation(2,3,4);
        Relation temp = ref.Comparison(ob);
        System.out.println("Object with " + "a= " + temp.a + " ," + "b= " + temp.b + " ," + "c= " + temp.c + " is highest");
    }
}