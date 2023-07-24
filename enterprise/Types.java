package com.enterprise;

public class Types {
    public static void main(String[] args) {
        byte numero1 = 99;
        short numero2 = 9999;
        int numero3 = 999999999;
        long numero4 = 999999999;


        System.out.println("byte =  " + numero1);
        System.out.println("short =  " + numero2);
        System.out.println("int =  " + numero3);
        System.out.println("long =  " + numero4);

        char j = 'j';
        System.out.println("char =  " + j);

        float decimal1 = 0.000000000009f;
        double decimal2 = 0.52891851d;
        System.out.println("float =  " + decimal1);
        System.out.println("double =  " + decimal2);

        String jero =" VAMONOS DE VIAJE";
        System.out.println("String = " + jero);

        boolean verdadero = true;
        boolean falso = false;

        System.out.println("Verdadero = "+ verdadero);
        System.out.println("falso = "+ falso);

        if(numero3 < numero4){
            System.out.println("si todo bien");
        }else{
            System.out.println("no todo mal");
        }
    }
}
