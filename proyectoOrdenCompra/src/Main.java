import org.ams.models.Cliente;
import org.ams.models.OrdenCompra;
import org.ams.models.Producto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compras componentes pc");
        orden1.setCliente(new Cliente("Axel", "Martinez Sanjuan"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Fabricante 1", "Unidad SSD 125GB", 1500));
        orden1.addProducto(new Producto("fabricante 2", "Monito Smasung", 2500));
        orden1.addProducto(new Producto("fabricante 3", "Mosuse Ryzen", 650));

        //Info de la orden de compra numero 2 con sus prpductos
        OrdenCompra orden2 = new OrdenCompra("Compras para perritos");
        orden2.setCliente(new Cliente("Edgar","Martinez"));
        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("fab perro 1", "casa", 3500));
        orden2.addProducto(new Producto("fab perrito 2", "Bulto de croqueta", 450));
        orden2.addProducto(new Producto("fab perrito 3", "Trastes de plastico", 120));

        //Info de la orden de compra numero 3 con sus prpductos
        OrdenCompra orden3 = new OrdenCompra("Compras de electrodomesticos");
        orden3.setCliente(new Cliente("Oralia", "Sanjuan"));
        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("elctro 1", "Estufa", 5700));
        orden3.addProducto(new Producto("electro 2", "Refrigerador", 9000));
        orden3.addProducto(new Producto("electro 3", "telefono", 5500));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};
        for (OrdenCompra orden : ordenes){
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: "+ orden.getCliente().getNombre() +" " + orden.getCliente().getApellido());
            System.out.println("Descripción: "+ orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal() + "\n");

            int i = 1;
            for (Producto producto: orden.getProductos()){
                System.out.println("Producto "+ i++ + ": "  + producto.getNombre() +"\t");
                System.out.println("Fabricante: "+ producto.getFabricante() + "\t");
                System.out.println("Precio: "+ producto.getPrecio()+ "\t");
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
}