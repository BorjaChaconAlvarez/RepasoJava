import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        // Definimos las tarifas de envío por kg
        final Double TARIFA_NACIONAL = 10.0;
        final Double TARIFA_INTERNACIONAL = 20.0;

        // Solicitamos los valores de destino y peso
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        String destino = consola.nextLine().trim().toLowerCase();

        System.out.print("Ingresa el peso del paquete (en kg): ");
        Double peso = Double.parseDouble(consola.nextLine());

        // Calculo del envío del paquete
 /*       Double costoEnvio = switch (destino){
            case "nacional" -> peso * TARIFA_NACIONAL;
            case "internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino inválido. Ingresa nacional/internacional");

            }
        };
        // Mostramos el costo de envío
        if(costoEnvio != null)
            System.out.printf("El costo de envío de paquete es: $%.2f", costoEnvio);
*/
    }

}
