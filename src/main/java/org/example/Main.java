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

    public static double areaRectangulo(double base, double altura){

        double area = base*altura;

        return area;

    }

    public static double perimetroRectangulo(double base, double altura){

        double perimetro = base*2+altura*2;

        return perimetro;

    }

    public static double perimetroCuadrado(double lado){

        double perimetro = lado*4;

        return perimetro;

    }

    public static double areaCuadrado(double lado){

        double area = lado*2;

        return area;

    }

    public static double areaCirculo(double radio){

        double area = Math.PI * radio *radio;

        return area;

    }

    public static double perimetroCirculo(double radio){

        double perimetro = 2* Math.PI * radio;

        return perimetro;

    }

    public static double volumenEsfera(double radio){

        double volumen = 4/3 * Math.PI * radio * radio * radio;

        return volumen;

    }

    public static double volumenCono(double radio, double altura){

        double volumen = 1/3 * areaCirculo(radio) * altura;

        return volumen;

    }

    public static double volumenCubo(double lado){

        double volumen = areaCuadrado(lado) * lado;

        return volumen;

    }
}