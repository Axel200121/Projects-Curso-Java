package org.ams.java8.lambda;

import org.ams.java8.lambda.aritmetica.Ariitmetica;
import org.ams.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {

        Ariitmetica suma = (a,b) -> a + b;
        Ariitmetica resta = (a,b) -> a - b;

        Calculadora cal = new Calculadora();
        System.out.println(cal.computar(10,5,suma));
        System.out.println(cal.computar(10,5,resta));
        System.out.println(cal.computar(10,5, (a,b)-> a*b));

        System.out.println("______________Ejemplo con BiFunction_______________");
        System.out.println(cal.computarConBiFunction(10,5, (a,b)->a+b));

    }
}
