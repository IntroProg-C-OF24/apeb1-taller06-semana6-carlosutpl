/*
Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división),
muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma";
si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 */
package tallersemana6;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class DeterminarOperacion5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion;

        System.out.println("Ingrese un número del 1 al 4 para determinar su operación matemática");
        int number = sc.nextInt();

        switch (number) {
            case 1 ->
                operacion = "suma";
            case 2 ->
                operacion = "resta";
            case 3 ->
                operacion = "multiplicacion";
            case 4 ->
                operacion = "division";
            default ->
                operacion = "no existente";
        }

        System.out.println("Su operación es " + operacion);
    }
}
