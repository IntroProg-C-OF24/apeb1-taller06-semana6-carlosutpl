/*
 Dado un número del 1 al 12, que representa un mes del año, muestra el nombre del mes correspondiente. 
Por ejemplo, si el usuario ingresa 1, debe mostrar "Enero"; 
si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 */

package tallersemana6;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class NumeroNombre4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes;
        
        System.out.println("Ingrese el número del mes: ");
        int numeroMes = sc.nextInt();
        
        switch(numeroMes){
            case 1 -> mes = "Enero";
            case 2 -> mes = "Febrero";
            case 3 -> mes = "Marzo";
            case 4 -> mes = "Abril";
            case 5 -> mes = "Mayo";
            case 6 -> mes = "Junio";
            case 7 -> mes = "Julio";
            case 8 -> mes = "Agosto";
            case 9 -> mes = "Septiembre";
            case 10 -> mes = "Octubre";
            case 11 -> mes = "Noviembre";
            case 12 -> mes = "Diciembre";
            default -> mes = "Inexistente";
        }
        
        System.out.println("Su número de mes corresponde a " + mes);
    }
}
