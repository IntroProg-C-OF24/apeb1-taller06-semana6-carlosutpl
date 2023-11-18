/*
Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete.
Si el peso es menor de 5 kg y la región es "local", el costo es de $5. 
Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 */
package tallersemana6;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class CostoPaquetes3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costo;
        System.out.println("Ingrese el peso del paquete en KGs: ");
        double peso = sc.nextDouble();

        System.out.println("Ingrese la región: 0 para local || 1 para nacional");
        int region = sc.nextInt();

        if (peso < 5 && region == 0) {
            costo = 5;
        } else if (peso >= 5 && peso <= 10 && region == 1) {
            costo = 10;
        } else {
            costo = 15;
        }
        
        System.out.println("El coste para su paquete es de: $" + costo);
    }
}
