package _3_VacationPlannerWithDatabase.VacationPlannerDatabaseWithReceiptGeneration;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

import _3_VacationPlannerWithDatabase.ExceptionPackage.IamExceptionPackageClass;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

class InitialPackage implements Runnable {
    int numOfNights, numOfDays;
    long phone;
    String name, from, to, packSelected;
    Thread travellerThread;

    InitialPackage(){}

    InitialPackage(int numOfNights, int numOfDays, String packSelected) {
        this.numOfNights = numOfNights;
        this.numOfDays = numOfDays;
        this.packSelected = packSelected;
    }

    void showAirfare() {
        System.out.println("Airfare is Not Included In Your Tour. You Have To Pay More For It\n");
    }

    void showFood() {
        System.out.println("Food isn't Included. You Have To Pay More For It\n");
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.print("Enter Your Phone Number: ");
        phone = input.nextLong();
        System.out.print("From: ");
        from = input.next();
        System.out.print("To: ");
        to = input.next();
        try {
            saveInformation(name, from, to, packSelected);
        } catch (IOException exception) {
            System.out.println("IOException Caught: " + exception);
        }
    }

    void saveInformation(String from, String to, String name, String packSelected) throws IOException {
        File f = new File("R:\\JavaFolders\\UserInfo_Vacation Planner\\UserDataBase.txt");
        FileWriter fout = new FileWriter(f, true);
        BufferedWriter buffIn = new BufferedWriter(fout);
        buffIn.write("Name: " + name + "," + "From: " + from + "," + "To: " + to + "," + "Pack: " + packSelected + "\n");
        buffIn.flush();
        fout.close();
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
        String userInput, username, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Travellers Stop. Fill this Form For Further Instructions\n");
        Thread.sleep(1000);
        System.out.println("SignUp or Login ?");
        userInput = input.next();
        String str;
        String[] details;
        boolean flag = false;

        if (userInput.equalsIgnoreCase("login")) {
            System.out.print("Username: ");
            username = input.next();
            System.out.print("Password: ");
            password = input.next();
            try {
                File db = new File("R:\\JavaFolders\\UserInfo_Vacation Planner\\LoginSignupDatabase.txt");
                BufferedReader reader = new BufferedReader(new FileReader(db));
                while ((str = reader.readLine()) != null) {
                    details = str.split(",");
                    if (username.equals(details[0]) && password.equals(details[1])) {
                        flag = true;
                        System.out.println("Login Successful");
                        break;
                    }
                }
                reader.close();
                if (!flag) {
                    System.out.println("No User With Given Credentials");
                    System.exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Error in reading file");
            }
        } else {
            System.out.print("Username: ");
            username = input.nextLine();
            try {
                File db = new File("R:\\JavaFolders\\UserInfo_Vacation Planner\\LoginSignupDatabase.txt");
                BufferedReader reader = new BufferedReader(new FileReader(db));
                while ((str = reader.readLine()) != null) {
                    details = str.split(",");
                    if (username.equals(details[0])) {
                        System.out.println("Username Already Taken");
                        System.exit(0);
                    }
                }
                System.out.print("Set a Password: ");
                password = input.nextLine();
                BufferedWriter writer = new BufferedWriter(new FileWriter(db, true));
                writer.write(username + "," + password + "\n");
                writer.flush();
                writer.close();
                System.out.println("Signed Up Successful");
            } catch (Exception ex) {
                System.out.println("Error in reading file");
            }
        }

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
                    pkg[iter].travellerThread = new Thread(new InitialPackage());
                    pkg[iter].travellerThread.start();
                    pkg[iter].travellerThread.join();
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
            System.out.println("Your Pack: " + pkg[iter].packSelected + "(" + pkg[iter].numOfNights + "N" + "," + pkg[iter].numOfDays + "D" + ")" +
                    "\n" + "Name: " + pkg[iter].name + "\n" + "Phone no.: " + pkg[iter].phone + "\n" + "From: " + pkg[iter].from + "\n" + "To: " +
                    pkg[iter].to + "\n");
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
                            if (pkg[i].packSelected.equals("Platinum"))
                                System.out.println("Sorry You have selected the Platinum Package. We do not refund for this package. Thank You For Choosing Traveller's stop :)");
                            else
                                System.out.println("The refund money will be credited to your account in 1 working day. Thank You For Choosing Traveller's stop :)");
                            pkg[i] = null;
                            System.out.println("Successfully Cancelled your trip. Sorry to see you going soon");
                        }
                    }
                }

                System.out.print("Do You Want to Generate a Receipt [Y/N]: ");
                exceptionCmd = input.next().charAt(0);
                if(exceptionCmd == 'Y' || exceptionCmd == 'y'){
                    new VacationPlanner().generateReceiptAsPDF(pkg[i]);
                }
            }
        }
    }

    void generateReceiptAsPDF(InitialPackage pkg){
        try {
            Document document = new Document();
            document.setPageSize(new com.itextpdf.text.Rectangle(1000, 300));
            PdfWriter.getInstance(document, new FileOutputStream("R:\\JavaFolders\\UserInfo_Vacation Planner\\Receipts\\" + pkg.name + ".pdf"));

            //open the document
            document.open();

            //creating receipt
            float[] columnWidths = {5f, 5f, 5f, 5f, 5f, 5f, 5f};
            PdfPTable receipt = new PdfPTable(columnWidths);
            receipt.addCell(new PdfPCell(new Paragraph("Passenger Name")));
            receipt.addCell(new PdfPCell(new Paragraph("Phone No.")));
            receipt.addCell(new PdfPCell(new Paragraph("From")));
            receipt.addCell(new PdfPCell(new Paragraph("To")));
            receipt.addCell(new PdfPCell(new Paragraph("Pack Selected")));
            receipt.addCell(new PdfPCell(new Paragraph("Days")));
            receipt.addCell(new PdfPCell(new Paragraph("Nights")));

            receipt.addCell(new PdfPCell(new Paragraph(pkg.name)));
            receipt.addCell(new PdfPCell(new Paragraph(pkg.phone)));
            receipt.addCell(new PdfPCell(new Paragraph(pkg.from)));
            receipt.addCell(new PdfPCell(new Paragraph(pkg.to)));
            receipt.addCell(new PdfPCell(new Paragraph(pkg.packSelected)));
            receipt.addCell(new PdfPCell(new Paragraph(pkg.numOfDays)));
            receipt.addCell(new PdfPCell(new Paragraph(pkg.numOfNights)));

            document.add(receipt);
            document.close();

            Desktop.getDesktop().open(new File("R:\\JavaFolders\\UserInfo_Vacation Planner\\Receipts\\" + pkg.name + ".pdf"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
