import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double operando1 = 0, operando2 = 0, resultado;
        var salir = false;
        // Ciclo para la aplicacion de Calculadora
        while(!salir){
            System.out.printf("*** Calculadora en Java ***\n" +
                    "1. Suma \n" +
                    "2. Resta\n" +
                    "3. Multiplicación\n" +
                    "4. División \n" +
                    "5. Salir\n" +
                    "Escoge una opción:\n");
            var opcion = consola.nextInt();

            if(opcion >= 1 && opcion <= 4){
                System.out.print("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                operando2 = consola.nextDouble();
            }

            switch(opcion){
                case 1 -> { // Suma
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado suma: %.2f%n%n", resultado);
                }
                case 2 -> { // Resta
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado resta: %.2f%n%n", resultado);
                }
                case 3 -> { // Multiplicación
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado multiplicación: %.2f%n%n", resultado);
                }
                case 4 -> { // División
                    if(operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.printf("Resultado división: %.2f%n%n", resultado);
                    }
                    else
                        System.out.println("Error: División entre cero.\n");
                }
                case 5 -> { // Salir
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, " +
                        "selecciona otra opción...\n");
            }
        }
    }
}
