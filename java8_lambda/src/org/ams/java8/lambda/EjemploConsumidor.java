package org.ams.java8.lambda;

import org.ams.java8.lambda.models.Usuario;

import java.sql.Array;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumidor {
    public static void main(String[] args) {

        //Consumidor es una expresión lambda que nos permite pasar por argumento un solo parametro del tipo generico
        //no devuelve nada
        Consumer<String> consumidor = saludo -> {System.out.println(saludo);};
        consumidor.accept("Hola mundo con lambda");

        Consumer<Date> consumidor2 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor2.accept(new Date());

        System.out.println("_______________________________BiConsumer___________________________");

        //se coloca parentesis cuando son dos o mas argumentos
        BiConsumer<String,Integer> consumidorBi = (nombre,edad) ->{System.out.println(nombre + ", tiene " + edad + " años");};
        consumidorBi.accept("Axel",20);

        System.out.println("------------------ Ejemplo ForEahc ------------------------------");
        // refernecia de metodos
        Consumer<String> consumidor3 = System.out::println;
        consumidor3.accept("Hola mundo con referencia de metodos");

        List<String> nombres = Arrays.asList("Andres", "Axel", "Edgar", "Naomi");
        nombres.forEach(consumidor3);

        System.out.println("____________EJEMPLO LAMBDA BICONSUMER CON CLASE USUARIO_______________");
        Usuario user = new Usuario();

        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(user,"Axel");
        System.out.println("Nombre de usuario: "+ user.getNombre());

        System.out.println("_______________ EXPRESIÓN PROVEEDOR______________________");
        Supplier<String> proveedor = ()->{
            return "Hola mundo lambda supplier";
        };
        System.out.println(proveedor.get());


    }
}
