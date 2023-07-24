package com.enterprise;

class Car {
    //atributes
    String color;
    String fabricante;
    String  modelo;
    double peso;
    double largo;
    Integer velocity = 0;

    //constructores
    public Car(){
        this.color= "NO COLOR";
        this.fabricante = "NO Fabricante";
        this.modelo = "NO Modelo";
        this.peso = 0;
        this.largo = 0;
        this.velocity = 0;
    }
    public Car(String color, String fabricante, String modelo, double peso, double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }
    public void acelerar( Integer velocity){
        if(velocity > 0 && velocity <= 120)
            this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocity=" + velocity +
                '}';
    }

    //metodos
}
