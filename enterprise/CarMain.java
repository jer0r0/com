package com.enterprise;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.acelerar(26);
        Car ca2r = new Car("Azul", "honda", "civic",1430.54,5.4);
        ca2r.acelerar(23);

        System.out.println(car);
        System.out.println(ca2r);
    }
}
