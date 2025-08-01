import java.util.Scanner;

public class IntroducirPorTeclado {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");

        String nombre = sc.nextLine();
        System.out.println("tu nombre es : " + nombre);
    }
}
