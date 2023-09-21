import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.*;

public class MainTest {
    @Test
    void restaTest(){
        double[][] ingresos = ValoresIngresados1();
        double[] esperados={-1, 2.9};
        for (int i = 0; i < ingresos.length ; i++) {
            Assertions.assertEquals((int)(resta(ingresos[i][0],ingresos[i][1]))*1000,(int)esperados[i]*1000);
        }
    }
    @Test
    void sumaTest(){
        double[][] ingresos = ValoresIngresados1();
        double[] esperados={7, 7.9};
        for (int i = 0; i < ingresos.length ; i++) {
            Assertions.assertEquals((suma(ingresos[i][0],ingresos[i][1]))*1000,(int)(esperados[i]*1000));
        }
    }
    @Test
    void multiplicacionTest(){
        double[][] ingresos = ValoresIngresados1();
        double[] esperados={12,13.5};
        for (int i = 0; i < ingresos.length ; i++) {
            Assertions.assertEquals(multiplicacion(ingresos[i][0],ingresos[i][1]),esperados[i]);
        }
    }
    @Test
    void divisionTest(){
        double[][] ingresos = ValoresIngresados2();
        double[] esperados = {(3),2.16};
        for (int i = 0; i < ingresos.length ; i++) {
            Assertions.assertEquals(division(ingresos[i][0],ingresos[i][1]),esperados[i]);
        }
    }
    @Test
    void mayorDeTest(){
        double[][] ingresos = ValoresIngresados1();
        String[] esperados = {"el mayor es el 4.0","el mayor es el 5.4"};
        for (int i = 0; i < ingresos.length ; i++) {
            Assertions.assertEquals(mayorDe(ingresos[i][0],ingresos[i][1]),esperados[i]);
        }
    }
    @Test
    void menorDeTest(){
        double[][] ingresos = ValoresIngresados1();
        String[] esperados = {"el menor es el 3.0","el menor es el 2.5"};
        for (int i = 0; i < ingresos.length ; i++) {
            Assertions.assertEquals(menorDe(ingresos[i][0],ingresos[i][1]),esperados[i]);
        }
    }
    @Test
    void elevarTest(){
        double[][] ingresos = ValoresIngresados1();
        double[] esperados = {81,67.76};
        for (int i = 0; i < ingresos.length ; i++) {
            Assertions.assertEquals((int)Double.parseDouble(elevar(ingresos[i][0],ingresos[i][1]))*100,(int)esperados[i]*100);
        }

    }
    @Test
    void porcentajeTest(){
        double[][] ingresos = valoresIngresados3();
        double[] esperados = {150,9};
        for (int i = 0; i <ingresos.length ; i++) {
            Assertions.assertEquals(porcentaje(ingresos[i][0],ingresos[i][1]),esperados[i]);
        }
    }

    private double[][] valoresIngresados3() {
        double[][] val= new double[2][2];
        val[0]=new double[]{500,30};
        val[1]=new double[]{45,20};
        return val;
    }

    private double[][] ValoresIngresados2() {
        double[][] val= new double[2][2];
        val[0]=new double[]{3,1};
        val[1]=new double[]{5.4,2.5};
        return val;
    }

    private double[][] ValoresIngresados1() {
        double[][] val=new double[2][2];
        val[0]=new double[]{3,4};
        val[1]=new double[]{5.4,2.5};
        return val;
    }
}
