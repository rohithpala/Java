package PassingObjects_Inheritence_Overloading_Static_Super;

import java.util.Scanner;

class Car {
        String fuelType;
        float cost,mileage;
        short CC,gearBox,seatingCapacity,automaticOrManual;

        Car(){
            fuelType = "Petrol";
            cost = 500000f;
            mileage = 10f;
            CC = 1000;
            gearBox = 5;
            seatingCapacity = 5;
            automaticOrManual = 1;
        }

        public Car sortByCost(Car car) {
            if(car.cost < this.cost)
                return this;
            else
                return car;
        }

        public Car sortByMileage(Car car) {
            if(car.mileage < this.mileage)
                return car;
            else
                return this;
        }
}
public class CarsAndInheritance {

    public static void main(String[] args) {
        int option = 0;
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int num = input.nextShort();
        Car car[] = new Car[num];

        //Taking input Details of the car
        for (short incr = 0; incr < num; incr++) {
            car[incr] = new Car();
            System.out.print("\nEnter Car " + (incr + 1) + " details :\n");
            System.out.print("Enter Cost of car: ");
            car[incr].cost = input.nextFloat();
            System.out.print("Enter Mileage of car: ");
            car[incr].mileage = input.nextFloat();
            System.out.print("Enter Seating Capacity of the car: ");
            car[incr].seatingCapacity = input.nextShort();
            System.out.print("Enter CC of the car: ");
            car[incr].CC = input.nextShort();
            System.out.print("Gear Box: ");
            car[incr].gearBox = input.nextShort();
            System.out.print("Automatic [0] or Manual [1]: ");
            car[incr].automaticOrManual = input.nextShort();
            System.out.print("\n");
        }
        do {
            System.out.print("\nEnter Your Choice Cost[0] / Mileage[1] :");
            choice = input.nextInt();

            //Sorting based on Cost (Low To High)
            if (choice == 0) {
                System.out.println("\nCars Sorted by Cost from Low To High:\n");
                for (short incr = 0; incr < num-1; incr++) {
                    Car temp = car[incr].sortByCost(car[incr + 1]);
                    if(temp == car[incr]){
                        Car tempCar;
                        tempCar = car[incr];
                        car[incr] = car[incr + 1];
                        car[incr + 1] = tempCar;
                    }
                }
                for (short incr = 0; incr < num; incr++) {
                    System.out.println("Cost : " + car[incr].cost + "Mileage : " + car[incr].mileage + "Fuel Type : " + car[incr].fuelType +
                            "Gear Box : " + car[incr].gearBox + "CC : " + car[incr].CC + "Automatic : " + car[incr].automaticOrManual +
                            "Seating Capacity : " + car[incr].seatingCapacity);
                }
            } else {
                //Sorting based on Mileage (High To Low)
                System.out.println("\nCars Sorted by Mileage from High To Low:");
                for (short incr = 0; incr < num-1; incr++) {
                    Car temp = car[incr].sortByMileage(car[incr + 1]);
                    if(temp == car[incr]){
                        Car tempCar;
                        tempCar = car[incr + 1];
                        car[incr + 1] = car[incr];
                        car[incr] = tempCar;
                    }
                }
                for (short incr = 0; incr < num; incr++) {
                    System.out.println("Mileage : " + car[incr].mileage + "Cost : " + car[incr].cost + "Fuel Type : " + car[incr].fuelType +
                            "Gear Box : " + car[incr].gearBox + "CC : " + car[incr].CC + "Automatic : " + car[incr].automaticOrManual +
                            "Seating Capacity : " + car[incr].seatingCapacity);
                }
            }
            System.out.print("Do You want to sort the Cars again [1/0]: ");
            option = input.nextInt();
        }while (option == 1);
    }
}