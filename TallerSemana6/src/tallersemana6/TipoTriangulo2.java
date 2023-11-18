/*
  Determinar el tipo de triángulo es base a los lados de input.
  Leer el código 2 veces para entender
 */
package tallersemana6;

import java.util.Scanner;

/**
 *
 * @author Carlos Sánchez
 */
public class TipoTriangulo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la longitud de los 3 lados del triángulo. Por cada lado, ingresa un <enter>");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        
        
        double sumaDosLados = 0;
        double max;
        //Ordenar los números para comprobar si se trata de un triángulo:
        //En sumaDosLados se guarda la suma de los lados mas pequeños, para comparar con el lado más grande el cual es max
        if(lado1 >= lado2){
            sumaDosLados += lado2; 
            max = lado1;
        }else{
            sumaDosLados += lado1; 
            max = lado2;
            
        }
        
        if(max <= lado3){
            sumaDosLados += max;
            max = lado3;
        }else{
           sumaDosLados += lado3; 
        }
        
        //Checar triangulo:
        
        if(sumaDosLados < max){
            System.out.println("No es un triángulo");
        }else if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Es un triángulo equilátero");
        }else if(lado1 == lado2 || lado2 == lado3){
            System.out.println("Es un triángulo isósceles");
        }else{
            System.out.println("Es un triángulo escaleno");
        }
        
        
    }
}
