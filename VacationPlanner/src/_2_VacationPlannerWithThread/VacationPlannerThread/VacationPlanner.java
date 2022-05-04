package _2_VacationPlannerWithThread.VacationPlannerThread;

import java.util.Scanner;

import _2_VacationPlannerWithThread.ExceptionPackage.*;

class InitialPackage implements Runnable {
    int numOfNights, numOfDays;
    public static long phone;
    String name, from, to, packSelected;
    Thread travellerThread;

    InitialPackage(int numOfNights, int numOfDays, String packSelected) {
        this.numOfNights = numOfNights;
        this.numOfDays = numOfDays;
        this.packSelected = packSelected;
        travellerThread = new Thread(this, "Thread Successfully Created");
        travellerThread.start();
    }

    void showDetails() {
        System.out.println("Your Pack: " + packSelected + "(" + numOfNights + "N" + "," + numOfDays + "D" + ")" + "\n" + "Name: " + name + "\n" + "Phone no.: " + phone + "\n" + "From: " + from + "\n" + "To: " + to + "\n");
    }

    void showAirfare() {
        System.out.println("Airfare is Not Included In Your Tour. You Have To Pay More For It\n");
    }

    void showFood() {
        System.out.println("Food isn't Included. You Have To Pay More For It\n");
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print(Thread.currentThread().getName() + "\nEnter Your Name: ");
        name = input.nextLine();
        System.out.print("Enter Your Phone Number: ");
        phone = input.nextLong();
        System.out.print("From :");
        this.from = input.next();
        System.out.print("To :");
        this.to = input.next();
    }
}

class PackageWithAirfare extends InitialPackage {
    PackageWithAirfare(int numOfNights, int numOfDays, String packSelected) {
        super(numOfNights, numOfDays, packSelected);
    }

    void showDetails() {
        System.out.println("Your Pack: " + packSelected + "(" + numOfNights + "N" + "," + numOfDays + "D" + ")" + "\n" + "Name: " + name + "\n" + "Phone no.: " + phone + "\n" + "From: " + from + "\n" + "To: " + to + "\n");
    }

    void showAirfare() {
        System.out.println("Airfare is Included In Your Tour");
    }
}

class Food extends InitialPackage {
    Food(int numOfNights, int numOfDays, String packSelected) {
        super(numOfNights, numOfDays, packSelected);
    }

    void showDetails() {
        System.out.println("Your Pack: " + packSelected + "(" + numOfNights + "N" + "," + numOfDays + "D" + ")" + "\n" + "Name: " + name + "\n" + "Phone no.: " + phone + "\n" + "From: " + from + "\n" + "To: " + to + "\n");
    }

    void showFood() {
        System.out.println("Bread and Breakfast are Included\n");
    }
}

public class VacationPlanner {

    public static void main(String[] args) throws InterruptedException {
        byte optionSelected;
        char airfareCmd, bNbCmd, cmd, exceptionCmd;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Travellers Stop. Fill this Form For Further Instructions\n");
        Thread.sleep(1000);
        System.out.print("How Many Are Gonna Enjoy The Ride: ");
        short numOfTourists = input.nextShort();
        InitialPackage[] pkg = new InitialPackage[numOfTourists];
        System.out.println();
        for (short iter = 0; iter < numOfTourists; iter++) {
            System.out.println("We Have the Following Packages For You.....\n");
            Thread.sleep(2000);
            System.out.println("1) Golden Package: 3 Nights And 4 Days (Only Some Tourist Spots Are Shown)");
            System.out.println("2) Platinum Package: 4 Nights And 5 Days (All Tourist Spots Are Shown)\n");
            optionSelected = input.nextByte();
            System.out.println("Please Enter The Details within 15 seconds or else the portal gets closed :)");
            switch (optionSelected) {
                case 1 -> {
                    System.out.print("Do Want to Include Airfare [Y/N]:");
                    airfareCmd = input.next().charAt(0);
                    if (airfareCmd == 'Y' || airfareCmd == 'y') {
                        pkg[iter] = new PackageWithAirfare(3, 4, "Golden");
                    } else {
                        System.out.print("Do You Want To Include Bread And Breakfast [Y/N]:");
                        bNbCmd = input.next().charAt(0);
                        if (bNbCmd == 'Y' || bNbCmd == 'y') {
                            pkg[iter] = new Food(3, 4, "Golden");
                        } else {
                            pkg[iter] = new InitialPackage(3, 4, "Golden");
                        }
                    }
                    Thread.sleep(15000);
                }
                case 2 -> {
                    System.out.print("Do Want to Include Airfare [Y/N]:");
                    airfareCmd = input.next().charAt(0);
                    if (airfareCmd == 'Y' || airfareCmd == 'y') {
                        pkg[iter] = new PackageWithAirfare(4, 5, "Platinum");
                    } else {
                        System.out.print("Do You Want To Include Bread And Breakfast [Y/N]:");
                        bNbCmd = input.next().charAt(0);
                        if (bNbCmd == 'Y' || bNbCmd == 'y') {
                            pkg[iter] = new Food(4, 5, "Platinum");
                        } else {
                            pkg[iter] = new InitialPackage(4, 5, "Platinum");
                        }
                    }
                    Thread.sleep(15000);
                }
            }
            System.out.println();
            System.out.println("Information Provided By You:");
            pkg[iter].showDetails();
            pkg[iter].showAirfare();
            pkg[iter].showFood();
            System.out.println();
            System.out.println();
        }
        System.out.println("Your Trip Will Start In A Few Seconds.........\n");
        Thread.sleep(2000);
        System.out.println("The trip Started..........Enjoy the Ride");
        System.out.println("Woah! We Reached 1000ft from Earth.......Congratulations");
        Thread.sleep(2000);
        System.out.println("Woah! We Reached 2000ft from Earth.......Congratulations");
        Thread.sleep(2000);
        System.out.println("Woah! We Reached 3000ft from Earth.......Congratulations");
        Thread.sleep(2000);
        System.out.println("Woah! We Are in the Middle of the Trip...Congratulations");
        Thread.sleep(2000);

        System.out.println("Let's go for a Passenger Check:");
        Thread.sleep(1000);

        for (int i = 0; i < numOfTourists; i++) {
            System.out.println("Dear " + pkg[i].name + ",Do you want to continue[Y/N]: ");
            cmd = input.next().charAt(0);
            if (cmd == 'N' || cmd == 'n') {
                System.out.print("Do You feel that the Whether is Bad for you[Y/N]: ");
                exceptionCmd = input.next().charAt(0);
                if (exceptionCmd == 'Y' || exceptionCmd == 'y') {
                    try {
                        throw new IamExceptionPackageClass.BadWhetherException();
                    } catch (IamExceptionPackageClass.BadWhetherException exception) {
                        System.out.println("Sorry But We Have To Wait For the Whether to come to Normal. Sorry for the inconvenience\n");
                    }
                }
                System.out.print("Is Food not Tasty[Y/N]: ");
                exceptionCmd = input.next().charAt(0);
                if (exceptionCmd == 'Y' || exceptionCmd == 'y') {
                    try {
                        throw new IamExceptionPackageClass.BadFoodException();
                    } catch (IamExceptionPackageClass.BadFoodException exception) {
                        System.out.println("Sorry for the inconvenience caused, We will Immediately change your food");
                    }
                }
                System.out.print("Do You Feel Fatigue[Y/N]: ");
                exceptionCmd = input.next().charAt(0);
                if (exceptionCmd == 'Y' || exceptionCmd == 'y') {
                    try {
                        throw new IamExceptionPackageClass.FatigueException();
                    } catch (IamExceptionPackageClass.FatigueException exception) {
                        System.out.print("Do you want to wait here for sometime[Y/N]: ");
                        exceptionCmd = input.next().charAt(0);
                        if (exceptionCmd == 'Y' || exceptionCmd == 'y')
                            System.out.println("Ok Passengers! One of our Co-Passengers is feeling stressed and nervous. Let's Wait here for 5 Min");
                        Thread.sleep(2000);
                        System.out.println("After 5 minutes\nOK ! Let's Go now");
                    }
                }
                System.out.print("Do You want to Cancel The trip[Y/N]: ");
                exceptionCmd = input.next().charAt(0);
                if (exceptionCmd == 'Y' || exceptionCmd == 'y') {
                    try {
                        throw new IamExceptionPackageClass.UserCancellationException();
                    } catch (IamExceptionPackageClass.UserCancellationException exception) {
                        System.out.print("Are You Sure: ");
                        exceptionCmd = input.next().charAt(0);
                        if (exceptionCmd == 'Y' || exceptionCmd == 'y') {
                            if(pkg[i].packSelected.equals("Platinum"))
                                System.out.println("Sorry You have selected the Platinum Package. We do not refund for this package. Thank You For Choosing Traveller's stop :)");
                            else
                                System.out.println("The refund money will be credited to your account in 1 working day. Thank You For Choosing Traveller's stop :)");
                            pkg[i] = null;
                            System.out.println("Successfully Cancelled your trip. Sorry to see you going soon");
                        }
                    }
                }
            }
        }
    }
}
