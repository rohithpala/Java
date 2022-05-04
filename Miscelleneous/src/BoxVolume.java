import java.util.Scanner;

class Box {
    float length, width, height;

    Box() {
        length = width = height = 1;
    }

    Box(float x, float y, float z) {
        length = x;
        width = y;
        height = z;
    }

    float Volume() {
        return length * width * height;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        float length, width, height;
        //Default Constructor
        Box defaultVolume = new Box();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextFloat();
        System.out.print("Enter width: ");
        width = input.nextFloat();
        System.out.print("Enter height: ");
        height = input.nextFloat();
        //Overloaded Constructor
        Box newVolume = new Box(length, width, height);
        System.out.println("Default Volume is: " + defaultVolume.Volume() + "\n");
        System.out.println("New Volume is: " + newVolume.Volume());
    }
}