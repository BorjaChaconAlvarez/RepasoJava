import java.util.Scanner;

public class Clasificacion {
    public static void main(String[] args) {
        System.out.println("CUANTAS CLASIFICACIONES TIENES: ");
        Scanner sc = new Scanner(System.in);
        double numero = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0 ; i < numero ; i++){
            System.out.println("Clasificacion " + "[" + i + "]" );
            int clasificacion = sc.nextInt();

            total = total + clasificacion;



        }
        double media = (total/numero);
        System.out.println("Media " +media);
    }
}
