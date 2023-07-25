package org.ams.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFuncion {
    public static void main(String[] args) {
        //Recibe un argumento y tambien devuelve un valor
        //es una interfaz con el metodo apply
        //el primer generic esl tipo de argumento
        // el segundo es el tipo que va devolver


        Function<String, String> f1 = param -> "Hola que tal!: " + param;
        String resultado = f1.apply("Axel");
        System.out.println(resultado);

        System.out.println("------------EJEMPLO 2------------");
        Function<String,String> f2 = param -> param.toUpperCase();
        System.out.println(f2.apply("Axel"));

        System.out.println("------EJEMPLO CON BiFunctions");
        BiFunction<String,String,String> f3 = (a,b) ->  a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Axel","Miros");
        System.out.println(r2);

        System.out.println("------------EJMPLO 2 CON BIFUNCTIONS-----------------");
        BiFunction<String,String,Integer> f4 = (a ,b)-> a.compareTo(b);
        System.out.println(f4.apply("Axel","Axel"));

        System.out.println("------------EJMPLO 2 CON BIFUNCTIONS-----------------");
        BiFunction<String,String,String> f5 = String::concat;
        System.out.println(f5.apply("Axel","Edgar"));
    }
}
