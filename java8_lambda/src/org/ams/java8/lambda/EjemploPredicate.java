package org.ams.java8.lambda;

import org.ams.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        boolean result = test.test(11);
        System.out.println("result = " + result);

        System.out.println("____________Segundo ejemplo_______________");
        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("Son el mismo rol? = "+test2.test("ROLE_ADMIN"));

        System.out.println("-------- Tercer ejemplo usando BiProdacte-----------");
        BiPredicate<String,String> test3 = (a,b) -> a.equals(b);
        System.out.println("Son iguales?= "+test3.test("Andres","Andres"));

        System.out.println("________________Cuarto ejemplo usando BiPredicate_____________");
        BiPredicate<Integer,Integer> test4 = (i,j) -> j > i;
        boolean result4 = test4.test(5,10);
        System.out.println("Es mayor 5 que 10?= " + result4);

        System.out.println("_________________Ejemplo con la Clase Usuario_________________");
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Axel");
        b.setNombre("Axel");
        BiPredicate<Usuario,Usuario> test5 = (ua,ub)-> ua.getNombre().equals(ub.getNombre());
        System.out.println("Son el mismo nombre? = "+ test5.test(a,b));
    }
}
