package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int eleccion =0;
        while (eleccion<1 || eleccion>10){
            System.out.println("que quieres hacer??");
            System.out.println("1.-Cuatro operaciones aritmeticas basicas");
            System.out.println("2.-Mayor de dos numeros");
            System.out.println("3.-Menor de dos numeros");
            System.out.println("4.-Potencia de un numero");
            System.out.println("5.-Porcentaje de un numero");
            System.out.println("6.- Calcular las soluciones x1 y x2 de una ecuación cuadrática de la forma: Ax2 + Bx + C = 0");
            System.out.println("7.-Perímetros, áreas y volúmenes");
            System.out.println("8.-Calcular la solución (x,y) de un sistema de 2 ecuaciones y 2 incógnitas, de la forma: Ax + By = C|Dx + Ey = F ");
            System.out.println("9.-Calcular la ecuación de una recta de la forma: Y = mX + b, dados 2 puntos de la recta (x1,y1) (x2,y2) ");
            System.out.println("10.-Salir");
            eleccion=elegir(10);
        }
        switcHMenu(eleccion);
    }
    private static void switcHMenu(int eleccion) {
        switch (eleccion){
            case 1:
                operacionesBasicas();
                break;
            case 2:
                //mayor de
                System.out.println(mayorDe(validacionCaracter("primer numero"),validacionCaracter("segundo numero")));
                menu();
                break;
            case 3:
                //menor de
                System.out.println(menorDe(validacionCaracter("primer numero"),validacionCaracter("segundo numero")));
                menu();
                break;
            case 4:
                //potencia
                System.out.println(elevar(validacionCaracter("Base"),validacionCaracter("Potencia")));
                menu();
                break;
            case 5:
                //porcentaje
                System.out.println(porcentaje(validacionCaracter("numero"),validacionCaracter("porcentaje")));
                menu();
                break;
            case 6:

                break;
            case 7:
                PerArVol();
                break;
            case 8:
                break;
            case 9:

                break;
            case 10:
                System.out.println("ok, Adios");
                break;
        }
    }
    private static void PerArVol() {
        int eleccion =0;
        while (eleccion<1 || eleccion>4){
            System.out.println("que quieres hacer??");
            System.out.println("1.-Perimetro");
            System.out.println("2.-Area");
            System.out.println("3.-Volumen");
            System.out.println("4.-Volver");
            eleccion=elegir(4);
        }
        switcHPerArVol(eleccion);
    }
    private static void switcHPerArVol(int eleccion) {
        switch (eleccion){
            case 1:
                perimetros();
                PerArVol();
                break;
            case 2:
                areas();
                PerArVol();
                break;
            case 3:
                volumenes();
                PerArVol();
                break;
            case 4:
                menu();
                break;
        }
    }
    private static void areas() {
        int eleccion =0;
        while (eleccion<1 || eleccion>4){
            System.out.println("Area de que??");
            System.out.println("1.-Cuadrado");
            System.out.println("2.-Rectangulo");
            System.out.println("3.-Circulo");
            System.out.println("4.-Volver");
            eleccion=elegir(4);
        }
        switcHAreas(eleccion);
    }

    private static void switcHAreas(int eleccion) {
        switch (eleccion){
            case 1:
                //arCuadrado();
                System.out.println(areaCuadrado(scMedida()));
                areas();
                break;
            case 2:
                //arRectangulo();
                System.out.println(areaRectangulo(scMedida(),scMedida()));
                areas();
                break;
            case 3:
                //arCirculo();
                System.out.println(areaCirculo(scMedida()));
                areas();
                break;
            case 4:
                break;
        }
    }
    private static void volumenes() {
        int eleccion =0;
        while (eleccion<1 || eleccion>4){

            System.out.println("1.-Cubo");
            System.out.println("2.-Cono");
            System.out.println("3.-Esfera");
            System.out.println("4.-Volver");
            eleccion=elegir(4);
        }
        switcHVolumenes(eleccion);
    }
    private static void switcHVolumenes(int eleccion) {
        switch (eleccion){
            case 1:
                System.out.println("el volumen del cubo es: "+volumenCubo(scMedida()));
                volumenes();
                break;
            case 2:
                System.out.println("el volumen del cono es: "+volumenCono(scMedida(),scMedida()));
                volumenes();
                break;
            case 3:
                System.out.println("El volumen de la esfera es: "+volumenEsfera(scMedida()));
                volumenes();
                break;
            case 4:
                break;
        }

    }
    private static void perimetros() {
        int eleccion =0;
        while (eleccion<1 || eleccion>4){
            System.out.println("perimetro de que??");
            System.out.println("1.-Cuadrado");
            System.out.println("2.-Rectangulo");
            System.out.println("3.-Circulo");
            System.out.println("4.-Volver");
            eleccion=elegir(4);
        }
        switcHPerimetros(eleccion);
    }
    private static void switcHPerimetros(int eleccion) {
        switch (eleccion){
            case 1:
                //perCuadrado();
                System.out.println(perimetroCuadrado(scMedida()));
                perimetros();
                break;
            case 2:
                //perRectangulo();
                System.out.println(perimetroRectangulo(scMedida(),scMedida()));
                perimetros();
                break;
            case 3:
                //perCirculo();
                System.out.println(perimetroCirculo(scMedida()));
                perimetros();
                break;
            case 4:
                break;
        }

    }
    private static void operacionesBasicas() {
        int eleccion =0;
        while (eleccion<1 || eleccion>5){
            System.out.println("que quieres hacer??");
            System.out.println("1.-Sumar dos numeros");
            System.out.println("2.-Restar dos numeros");
            System.out.println("3.-Multiplicar dos numeros");
            System.out.println("4.-Dividir dos numeros");
            System.out.println("5.-Volver");
            eleccion=elegir(5);
        }
        switcHOperacionesBasicas(eleccion);
    }

    private static void switcHOperacionesBasicas(int eleccion) {
        switch (eleccion){
            case 1:
                //sumar
                System.out.println("la suma es:"+suma(validacionCaracter("primer numero"),validacionCaracter("segundo numero")));
                operacionesBasicas();
                break;
            case 2:
                //restar
                System.out.println("la resta es:"+resta(validacionCaracter("primer numero"),validacionCaracter("segundo numero")));
                operacionesBasicas();
                break;
            case 3:
                //multiplicar
                System.out.println("la multiplicacion es:"+multiplicacion(validacionCaracter("primer numero"),validacionCaracter("segundo numero")));
                operacionesBasicas();
                break;
            case 4:
                //dividir
                System.out.println("la division es:"+division(validacionCaracter("primer numero"),validacionCaracter("segundo numero")));
                operacionesBasicas();
                break;
            case 5:
                menu();
                break;
        }
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

        double area = lado*lado;

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
        double volumen = (double) 4 /3 * Math.PI * radio * radio * radio;

        return volumen;

    }
    public static double volumenCono(double radio, double altura){
        double volumen = (double) 1/3 * areaCirculo(radio) * altura;
        return volumen;

    }
    public static double volumenCubo(double lado){
        double volumen = areaCuadrado(lado) * lado;

        return volumen;

    }

    /*
    Este es un scanner que cree con en unico proposito de leer medidas, ya que en la entrada de los metodos
    de geometricos necesito que los valores sean positivos
     */
    public static double scMedida(){
        Scanner sc = new Scanner(System.in);
        double medida = 0;
        while(medida<=0){
            try {
                System.out.println("Ingrese un numero positivo distinto de cero");
                medida= sc.nextDouble();
                if(medida<=0){
                    System.out.println("Dato Invalido");
                }
            }catch (Exception e){
                System.out.println("solo numeros");
                sc.nextLine();
            }
        }
        return medida;
    }

    //Este otro scanner es para la cuadratica, los valores de a,b y c deben ser distintos a 0
    public static double scNumero(){
        Scanner sc = new Scanner(System.in);
        double num = 0;
        while(num==0){
            try{
                System.out.println("ingrese un numero distinto de cero");
                num= sc.nextDouble();
                if(num==0){
                    System.out.println("Dato Invalido");
                }
            }catch (Exception e){
                System.out.println("Solo numeros");
                sc.nextLine();
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


    public static double porcentaje(double primer, double segundo) {
            return (primer*(segundo/100));
    }

    public static String elevar(double i, double i1) {
        if (i==0 && i1==0){
            return "puede se 1 o indefinido dependiendo del contexto";
        }else {
            return ""+Math.pow(i,i1);
        }
    }
    public static String menorDe(double primer, double segundo) {
        if (primer<segundo){
            return "el menor es el "+primer;
        }else if (primer>segundo){
            return "el menor es el "+segundo;
        }else {
            return "son iguales";
        }
    }
    public static String mayorDe(double primer, double segundo) {
        if (primer>segundo){
            return "el mayor es el "+primer;
        }else if (primer<segundo){
            return "el mayor es el "+segundo;
        }else {
            return "son iguales";
        }
    }
    public static double division(double d1, double d2) {
        return d1/d2;
    }
    private static double validacionNoCero() {
        Scanner t = new Scanner(System.in);
        double numero=0;
        while (numero==0){
            try {
                System.out.println("ingrese el divisor, no puede ser cero");
                numero = t.nextDouble();
                if (numero==0){
                    System.out.println("no puedes dividir por 0");
                }
            }catch (InputMismatchException e){
                t.nextLine();
                System.out.println("solo numeros");
            }
        }
        return numero;
    }
    public static double multiplicacion(double primer, double segundo) {
        return primer*segundo;
    }
    public static double resta(double primer, double segundo) {
        return primer-segundo;
    }
    public static double suma(double primer, double segundo) {
        return primer+segundo;
    }
    public static double validacionCaracter(String p) {
        Scanner t = new Scanner(System.in);
        double numero=0;
        boolean paso=false;
        while (!paso){
            try {
                System.out.println("ingrese el "+p);
                numero = t.nextDouble();
                paso=true;
            }catch (InputMismatchException e){
                t.nextLine();
                System.out.println("solo numeros");

            }
        }
        return numero;
    }

    private static int elegir(int i) {
        int eleccion=0;
        Scanner t = new Scanner(System.in);
        try{
            eleccion=t.nextInt();
        }catch (Exception e){
            t.nextLine();
            System.out.println("solo numeros");
            return 0;
        }
        if (eleccion<1 || eleccion>i){
            System.out.println("debe estar entre 1 y "+i);
        }
        return eleccion;
    }
}
