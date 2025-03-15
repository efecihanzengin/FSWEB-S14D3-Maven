package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the Holden's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "this Holden is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "this Holden is braking";
    }
}
