package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the Ford's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "this Ford is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "this Ford is braking";
    }
}
