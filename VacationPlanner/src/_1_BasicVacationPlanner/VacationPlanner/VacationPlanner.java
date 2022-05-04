package _1_BasicVacationPlanner.VacationPlanner;

import java.util.Scanner;

class InitialPackage{
    int numOfNights,numOfDays;
    long phone;
    String name, from, to, packSelected;
    boolean medicalReport = false;
    InitialPackage(){
        name = "Rohith";
        phone = 1234567890L;
        this.medicalReport = false;
        from = "Warangal";
        to = "Paris";
        numOfNights = 3;
        numOfDays = 4;
        packSelected = "Silver";
    }
    InitialPackage(String name,long phone,String from,String to,int numOfNights,int numOfDays,String packSelected){
        this.name = name;
        this.phone = phone;
        this.from = from;
        this.to = to;
        this.numOfNights = numOfNights;
        this.numOfDays = numOfDays;
        this.packSelected = packSelected;
    }
    void showDetails(){
        System.out.println("Your Pack: " + packSelected + "(" + numOfNights + "N" + "," +numOfDays + "D" + ")" + "\n" + "Name: " + name + "\n" +"Phone no.: " + phone + "\n" +"From: " + from + "\n" +"To: " + to + "\n");
    }
    void showAirfare(){
        System.out.println("Airfare is Not Included In Your Tour. You Have To Pay More For It\n");
    }
    void showFood(){
        System.out.println("Food isn't Included. You Have To Pay More For It\n");
    }
}

class PackageWithAirfare extends InitialPackage{
    PackageWithAirfare(String name,long phone,String from,String to,int numOfNights,int numOfDays,String packSelected){
        this.name = name;
        this.phone = phone;
        this.from = from;
        this.to = to;
        this.numOfNights = numOfNights;
        this.numOfDays = numOfDays;
        this.packSelected = packSelected;
    }
    void showDetails(){
        System.out.println("Your Pack: " + packSelected + "(" + numOfNights + "N" + "," +numOfDays + "D" + ")" + "\n" + "Name: " + name + "\n" +"Phone no.: " + phone + "\n" +"From: " + from + "\n" +"To: " + to + "\n");
    }
    void showAirfare(){
        System.out.println("Airfare is Included In Your Tour");
    }
}

class Food extends InitialPackage{
    Food(String name,long phone,String from,String to,int numOfNights,int numOfDays,String packSelected){
        this.name = name;
        this.phone = phone;
        this.from = from;
        this.to = to;
        this.numOfNights = numOfNights;
        this.numOfDays = numOfDays;
        this.packSelected = packSelected;
    }
    void showDetails(){
        System.out.println("Your Pack: " + packSelected + "(" + numOfNights + "N" + "," +numOfDays + "D" + ")" + "\n" + "Name: " + name + "\n" +"Phone no.: " + phone + "\n" +"From: " + from + "\n" +"To: " + to + "\n");
    }
    void showFood(){
        System.out.println("Bread and Breakfast are Included\n");
    }
}

public class VacationPlanner{
    public static short numOfTourists;
    public static void main(String[] args) {
        byte optionSelected;
        long phone;
        char airfareCmd,bNbCmd;
        String name , from , to;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Travellers Stop. Fill this Form For Further Instructions\n");
        System.out.println("How Many Are Gonna Enjoy The Ride: ");
        numOfTourists = input.nextShort();
        InitialPackage[] pkg = new InitialPackage[numOfTourists];
        System.out.print("\n");
        for(short iter=0;iter<numOfTourists;iter++){
            System.out.print("Enter " + "Tourist " + (iter+1) +" Details:\n");
            System.out.print("Enter Your Name: ");
            name=input.next();
            System.out.print("May I Know Your Phone Number Please:");
            phone = input.nextLong();
            System.out.print("You Are From: ");
            from = input.next();
            System.out.print("Where Are You Willing To Go: ");
            to = input.next();
            System.out.println();
            System.out.println();
            System.out.println("We Have the Following Packages For You.....\n");
            System.out.println("1) Golden Package: 3 Nights And 4 Days (Only Some Tourist Spots Are Shown)\n");
            System.out.println("2) Platinum Package: 4 Nights And 5 Days (All Tourist Spots Are Shown)\n");
            optionSelected = input. nextByte();
            switch (optionSelected) {
                case 1 -> {
                    System.out.println("Do Want to Include Airfare [Y/N]:");
                    airfareCmd = input.next().charAt(0);
                    if (airfareCmd == 'Y' || airfareCmd == 'y') {
                        pkg[iter] = new PackageWithAirfare(name, phone, from, to, 3, 4, "Golden");
                    } else {
                        System.out.println("Do You Want To Include Bread And Breakfast [Y/N]:");
                        bNbCmd = input.next().charAt(0);
                        if (bNbCmd == 'Y' || bNbCmd == 'y') {
                            pkg[iter] = new Food(name, phone, from, to, 3, 4, "Golden");
                        } else {
                            pkg[iter] = new InitialPackage(name, phone, from, to, 3, 4, "Golden");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Do Want to Include Airfare [Y/N]:");
                    airfareCmd = input.next().charAt(0);
                    if (airfareCmd == 'Y' || airfareCmd == 'y') {
                        pkg[iter] = new PackageWithAirfare(name, phone, from, to, 4, 5, "Platinum");
                    } else {
                        System.out.println("Do You Want To Include Bread And Breakfast [Y/N]:");
                        bNbCmd = input.next().charAt(0);
                        if (bNbCmd == 'Y' || bNbCmd == 'y') {
                            pkg[iter] = new Food(name, phone, from, to, 4, 5, "Platinum");
                        } else {
                            pkg[iter] = new InitialPackage(name, phone, from, to, 4, 5, "Platinum");
                        }
                    }
                }
            }

            pkg[iter].showDetails();
            pkg[iter].showAirfare();
            pkg[iter].showFood();
            System.out.println();
            System.out.println();
        }
        System.out.println("Your Trip Will Start In A Few Seconds.........\n");
        System.out.println("Woah! We Reached 1000ft from Earth.......Congratulations");
        System.out.println("Woah! We Reached 2000ft from Earth.......Congratulations");
        System.out.println("Woah! We Reached 3000ft from Earth.......Congratulations");
        System.out.println("Congratulations! We Reached The Mountain Top");
        System.out.println();
        System.out.println("It's Selfie Time\n");
        System.out.println("Please Feel Free To Share Your Experience With Us.......Thank You For Coming.......Visit Again\n");
        System.out.println("-----------------------Bye Bye !-----------------------");
    }
}