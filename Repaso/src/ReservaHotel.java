import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("*** RESERVA DEL HOTEL *** ");
        System.out.println("Ingrese el nombre del cliente : ");

        String nombreCliente = teclado.nextLine();

        System.out.println("Cuantos dias se quedara usted : " + nombreCliente);

        int diasEstadia = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Cuarto con vistas a la mar ? (si/no");
        String mar = teclado.nextLine();

        if (mar.equalsIgnoreCase("si")) {

            Double precioDia = 190.50;
            Double preciototal = precioDia * diasEstadia;
            System.out.println("La precio por un cuarto con vistas a la mar es : $" + preciototal  + "€");
        }
        else{
            Double precioDia = 150.50;
            Double preciototal = precioDia * diasEstadia;
            System.out.println("La precio por un cuarto sin vistas al mar es: " + preciototal + "€");

        }
    }

}
