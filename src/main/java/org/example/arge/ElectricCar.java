package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(description, name);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;

    }

    @Override
    public void startEngine() {
        System.out.println("Elektrikli motor aktif");
    }
    @Override
    public void runEngine(){
        System.out.println("Elektrikli motor wrrrr... Batarya" + batterySize);
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
}


