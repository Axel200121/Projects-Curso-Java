package org.ams.appfacturapoo;

import org.ams.appfacturapoo.models.Cliente;
import org.ams.appfacturapoo.models.Factura;
import org.ams.appfacturapoo.models.ItemFactura;
import org.ams.appfacturapoo.models.Producto;

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
        String nombre;
        float precio;
        int catidad;

        System.out.println();
        for (int  i=0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto numero: "+producto.getCodigo() + ": ");
            nombre = scanner.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = scanner.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            catidad = scanner.nextInt();

            ItemFactura item = new ItemFactura(catidad, producto);
            factura.addItemFactura(item);

            System.out.println();
            scanner.nextLine(); 
        }
        System.out.println(factura.generarDetalle());
    }
}
