import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuentos VIP*** ");
        final int NO_PRODUCTOS_DESCUENTO = 10;
        Scanner consola = new Scanner(System.in);

        System.out.print("Cuántos productos compraste hoy? ");
        int cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresía de la tienda (true/false)? ");
        boolean tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        String esElegibleDescuento =
                String.valueOf(cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia);

        System.out.println("Tienes acceso al descuento VIP ? " + esElegibleDescuento);
    }
}
