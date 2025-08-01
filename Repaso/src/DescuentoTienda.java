import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** Tienda con descuento *** ");

        System.out.println("Cual fue el precio de la compra : ");
        int precio = Integer.parseInt(input.nextLine());

        System.out.println("Eres miembro de la tienda (true / false)");
        String valido = input.nextLine();

        if (valido.equalsIgnoreCase("true") || valido.equalsIgnoreCase("false")) {
            double precioFinal;
            double descuento;
            if ((valido.equalsIgnoreCase("true"))) {
                descuento = precio * (0.05);
                precioFinal = precio - descuento;
                System.out.printf("El precio final con descuento por ser miembro de la tienda = %.2f€%n", precioFinal);
            } else if ((precio > 1000) && (valido.equalsIgnoreCase("true"))) {
                descuento = precio * (0.10);
                precioFinal = precio - descuento;
                System.out.printf("Tu precio final con descuento de mas de 1000 € = %.2f€%n", precioFinal);

            } else {
                System.out.println("No posees ningun descuento, tu precio es = " + precio);
            }
        } else {
            System.out.println("Incorrecto en el formato ");
        }

    }
}
