import java.util.Scanner;

public class MayorNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");

        int numeroUno = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce otro número");
        int numeroDos = Integer.parseInt(teclado.nextLine());


        if (numeroUno > numeroDos) {
            System.out.println("El número mas grande es : " + numeroUno);
        } else {
            System.out.println("El número mas grandes es : " + numeroDos);
        }
    }
}
