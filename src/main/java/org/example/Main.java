package org.example;
import java.util.Scanner;

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

    /*
    Este es un scanner que cree con en unico propocito de leer medidas, ya que en la entrada de los metodos
    de geometricos necesito que los valores sean positivos
     */
    public static double scMedida(){

        Scanner sc = new Scanner(System.in);

        double medida = 0;

        while(medida<=0){
            medida= sc.nextDouble();

            if(medida<=0){
                System.out.println("Dato Invalido");
            }
        }

        return medida;

    }

    //Este otro scanner es para la cuadratica, los valores de a,b y c deben ser distintos a 0
    public static double scNumero(){

        Scanner sc = new Scanner(System.in);

        double num = 0;

        while(num==0){
            num= sc.nextDouble();

            if(num==0){
                System.out.println("Dato Invalido");
            }
        }

        return num;

    }

    public static void ecuacionCuadratica(){

        System.out.println("Ingrese valor de a");
        double a = scNumero();
        System.out.println("Ingrese valor de b");
        double b = scNumero();
        System.out.println("Ingrese valor de c");
        double c = scNumero();

        if (discriminanteCuadratica(a, b, c) == true){

            System.out.println("x1=" + valorX1(a, b, c) + " , " + "x2=" + valorX2(a, b, c));
        }else {

            System.out.println("No tiene solucion en los reales");
        }



    }

    public static boolean discriminanteCuadratica(double a, double b , double c){

        boolean solucion = true;
        double discriminante = Math.pow(b,2)-4*a*c;

        if(discriminante<0){
            solucion=false;
        }

        return solucion;
    }

    public static double valorX1(double a, double b , double c){

        double x = (-b - Math.sqrt(Math.pow(b,2)-4*a*c)/ 2*a);

        return x;
    }

    public static double valorX2(double a, double b , double c){

        double x = (-b + Math.sqrt(Math.pow(b,2)-4*a*c)/ 2*a);

        return x;
    }
}
