package _1_BasicVacationPlanner.TravellerDetails;
import _1_BasicVacationPlanner.VacationPlanner.*;

import java.util.Scanner;

public class TravellersInfo extends Thread{
    public void run() {
        
    }

    public static void enterDetails(){
        short numOfTourists;
        Scanner input = new Scanner(System.in);
        numOfTourists = input.nextShort();
        for (int i = 0; i < numOfTourists; i++) {
            VacationPlanner info = new VacationPlanner();
            Thread travellerThread = new Thread();
            travellerThread.start();
        }
    }
}