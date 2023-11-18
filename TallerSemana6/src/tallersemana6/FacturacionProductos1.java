
package tallersemana6;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 * 18 / 11 / 2023 -> 5:05 p.m
 */
public class FacturacionProductos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double IVA = 0, descuento = 0, precioEnvio = 0, subtotalProducto1, subtotalProducto2, subtotal, subtotalConIVA, montoFactura;

        //Pedir cantidad y precio por producto
        System.out.println("Ingrese la cantidad del primer producto que adquirio");
        int cantidadProducto1 = sc.nextInt();
        System.out.println("Ingrese el precio de cada producto 1: ");
        int precioProducto1 = sc.nextInt();

        System.out.println("Ingrese la cantidad del segundo producto que adquirió");
        int cantidadProducto2 = sc.nextInt();
        System.out.println("Ingrese el precio de cada producto 2: ");
        int precioProducto2 = sc.nextInt();

        //Calcular los subtotales de cada producto
        subtotalProducto1 = precioProducto1 * cantidadProducto1;
        subtotalProducto2 = precioProducto2 * cantidadProducto2;

        //Calcular el subtotal general
        subtotal = subtotalProducto1 + subtotalProducto2;
        IVA = (subtotal * 0.12); //Sacar el precio del IVA a partir del 12%

        //Calcular el subtotal con el IVA.
        subtotalConIVA = subtotal + IVA;

        //Pedir el costo del envio
        System.out.println("Ingrese el costo del envio");
        precioEnvio = sc.nextInt();

        //Aplicar 20% de descuento en caso de que el subtotal sea superior a 1000.
        if (subtotalConIVA > 1000) {
            descuento = subtotalConIVA * 0.20;
        } else {
            //Aplicar 5% de descuento caso contrario
            descuento = subtotalConIVA * 0.05;
        }

        montoFactura = (subtotalConIVA - descuento);
        
        //Imprimir la factura
        System.out.println("SU FACTURA ES: ");
        System.out.println("-------------------------------------------");
        System.out.println("Producto uno: " + cantidadProducto1 + ". \n Precio por cada uno: "
                + precioProducto1 + ". \n Precio total de producto 1: $" + subtotalProducto1);

        System.out.println("Producto dos: " + cantidadProducto1 + ". \n Precio por cada uno: " + precioProducto2
                + ". \n Precio total de producto 2: $" + subtotalProducto2);

        System.out.println("-------------------------------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA del 12%: " + IVA);
        System.out.println("Subtotal + IVA: " + subtotalConIVA);
        System.out.println("Descuento: " + descuento);

        //Comprobar si se aplica gasto de envio :) n
        if (subtotal > 5000) {
            System.out.println("Gasto de envio: 0.0");
        } else {
            System.out.println("Gasto de envio: " + precioEnvio);
            montoFactura += precioEnvio;
        }

        System.out.println("MONTO FACTURA: " + montoFactura);
        System.out.println("-------------------------------------------");

    }

}
