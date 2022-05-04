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
    boolean carIgnition(){
        return true;
    }
    float carMileage(){
        return mileage;
    }
    int carMaintainance (){
        return 1500;
    }
}
