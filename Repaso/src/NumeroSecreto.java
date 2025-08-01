import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        System.out.println("*** Juego de la adivinanza***");

        Random rnd = new Random();
        int numeroAcertado = rnd.nextInt(99) + 1;  // nextInt(99) va de 0 a 98, +1 → 1–99
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el número que quieras");
        int numeroUsuario = sc.nextInt();
        boolean acierto = false;

        while(!acierto){

            if(!(numeroUsuario == numeroAcertado)) {

                System.out.println("Numero fallado, Introduce otro numero");
                numeroUsuario = sc.nextInt();
            }
            else{
                System.out.println("Numero acertado : " + numeroAcertado);
                acierto = true;
            }

        }

    }
}
