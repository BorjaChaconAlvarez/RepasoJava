import java.util.Random;
import java.util.Scanner;

public class GenerarID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre : ");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu apellido : ");
        String apellido = sc.nextLine();

        System.out.println("Introduce tu año de nacimiento : ");
        int anio = Integer.parseInt(sc.nextLine());

        System.out.println(" *** Generado id Unico *** ");
        String nombreCortado = nombre.substring(0, 2).toUpperCase();

        String apellidoCortado = apellido.substring(0, 2).toUpperCase();

        String anioCortado = String.valueOf(anio).substring(2, 4);

        Random random = new Random();

        int aleatorio = random.nextInt(9999);

        int numero = Integer.parseInt(String.format("%4d" , aleatorio)); // PARA FORMATO DE 4 DIGITOS %4d


        System.out.println("Hola  " + nombre + " Tu id es : ");

        System.out.println(nombreCortado + apellidoCortado + anioCortado + numero) ;



    }
}
