package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the Mitsubishi's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "this Mitsubishi is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "this Mitsubishi is braking";
    }
}
