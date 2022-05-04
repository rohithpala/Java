package PassingObjects_Inheritence_Overloading_Static_Super;
class Overloading {
    static class MethodAndConstructorOverloading {
        int a;
        float b;
        double c;

        MethodAndConstructorOverloading() {
            a = 1;
            b = 1;
            c = 1;
        }

        MethodAndConstructorOverloading(int a, float b) {
            this.a = a;
            this.b = b;
            c = 0.5;
            System.out.println("a= " + a + "," + "b= " + b + "," + "c= " + c);
        }

        MethodAndConstructorOverloading(int a, float b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            System.out.println("a= " + a + "," + "b= " + b + "," + "c= " + c);
        }

        void Sum() {
            System.out.println("Sum : " + (a + b + c));
        }
    }

    public static void main(String[] args) {
        MethodAndConstructorOverloading sum1 = new MethodAndConstructorOverloading();
        MethodAndConstructorOverloading sum2 = new MethodAndConstructorOverloading(3, 5f);
        MethodAndConstructorOverloading sum3 = new MethodAndConstructorOverloading(2, 2.5f, 3.5);

        sum1.Sum();
        sum2.Sum();
        sum3.Sum();
    }
}

