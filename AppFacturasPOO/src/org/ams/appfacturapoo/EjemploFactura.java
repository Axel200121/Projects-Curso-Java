package org.ams.appfacturapoo;

import org.ams.appfacturapoo.models.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("555-3");
        cliente.setNombre("Axel");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura: ");
        String descripcion = scanner.nextLine();
        Factura factura = new Factura(descripcion,cliente);

        Producto producto;


        System.out.println();
        for (int  i=0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto numero: "+producto.getCodigo() + ": ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));

            System.out.println();
            scanner.nextLine(); 
        }
        System.out.println(factura);
    }
}
