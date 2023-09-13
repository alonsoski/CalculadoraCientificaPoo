package org.example;

public class Main {
    public static void main(String[] args) {



    }

    public static double mayorDosNumeros(double n1, double n2){
        if (n1>n2){
            return n1;
        }else if(n2>n1){
            return n2;
        }else {
            System.out.println("son iguales");
            return n1;
        }

    }
    public static double potencia(double n1,double n2){
        return (Math.pow(n1,n2));
    }
    public static double porcentaje(double n1, double n2){
return 3;
    }
    public static double menorDosNumeros(double n1,double n2){
        if (n1>n2){
            return n2;
        }else if(n2>n1){
            return n1;
        }else {
            System.out.println("son iguales");
            return n1;
        }
    }
    public static double suma (double n1, double n2){
        return n1+n2;
    }public static double resta (double n1, double n2){
        return n1-n2;
    }public static double multiplicacion (double n1, double n2){
        return n1*n2;
    }public static double division (double n1, double n2){
        return n1/n2;
    }
}