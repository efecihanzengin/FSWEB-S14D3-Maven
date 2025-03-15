package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String name, String description, int cylinders, int batterySize, double avgKmPerLitre) {
        super(description, name);
        this.cylinders = cylinders;
        this.batterySize = batterySize;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.println("Hibrit motor çalışıyor! Elektrik ve benzin sistemleri hazır.");
    }

    @Override
    protected void runEngine() {
        System.out.println("Hibrit motor aktif: Batarya kapasitesi: " + batterySize + " kWh, Silindir: " + cylinders);
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
