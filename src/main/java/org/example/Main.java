package org.example;

public class Main {
    public static void main(String[] args) {

    }

    private static void operacionesBasicas() {
    }

    private static double porcentaje(double primer, double segundo) {
            return (primer*(segundo/100));
    }

    private static String elevar(double i, double i1) {
        if (i==0 && i1==0){
            return "puede se 1 o indefinido dependiendo del contexto";
        }else {
            return ""+Math.pow(i,i1);
        }
    }
    private static String menorDe(double primer, double segundo) {
        if (primer<segundo){
            return "el menor es el "+primer;
        }else if (primer>segundo){
            return "el menor es el "+segundo;
        }else {
            return "son iguales";
        }
    }
    private static String mayorDe(double primer, double segundo) {
        if (primer>segundo){
            return "el mayor es el "+primer;
        }else if (primer<segundo){
            return "el mayor es el "+segundo;
        }else {
            return "son iguales";
        }
    }
    private static double division(double d1, double d2) {
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
    private static double multiplicacion(double primer, double segundo) {
        return primer*segundo;
    }
    private static double resta(double primer, double segundo) {
        return primer-segundo;
    }
    private static double suma(double primer, double segundo) {
        return primer+segundo;
    }
    private static double validacionCaracter(String p) {
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
}
