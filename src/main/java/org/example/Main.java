package org.example;

public class Main {
    public static void main(String[] args) {



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
