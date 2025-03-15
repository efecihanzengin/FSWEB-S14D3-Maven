package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(description, name);
        this.avgKmPerLitre =avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Vroooom! Benzinli motor çalıştı!");
    }

    @Override
    protected void runEngine() {
        System.out.println("Benzinli motor çalışıyor. Silindir sayısı: " + cylinders);
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders(){
        return cylinders;
    }
}
