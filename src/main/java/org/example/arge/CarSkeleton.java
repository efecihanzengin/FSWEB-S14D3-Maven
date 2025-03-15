package org.example.arge;



public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){
        this.name = "Unknown";
        this.description = "No description";
    }

    public CarSkeleton(String description, String name) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Motor calisti");
    }
    protected void runEngine() {
        System.out.println("Motor calisiyor");
    }

    public void drive() {
        runEngine();
        System.out.println("Arac hareket ediyor");
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
