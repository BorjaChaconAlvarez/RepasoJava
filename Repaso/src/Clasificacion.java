import java.util.Scanner;

public class Clasificacion {
    public static void main(String[] args) {
        System.out.println("CUANTAS CLASIFICACIONES TIENES: ");
        Scanner sc = new Scanner(System.in);
        var numero = Integer.parseInt(sc.nextLine());
        var clasificacion = new int[numero];
        double total = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println("Clasificacion " + "[" + i + "] : ");
            clasificacion[i] = Integer.parseInt(sc.nextLine());
            total = total + clasificacion[i];


        }
        double media = (total / numero);
        System.out.println("Media " + media);
    }
}
