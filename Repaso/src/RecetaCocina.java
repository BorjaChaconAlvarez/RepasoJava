import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {

        System.out.println("*** Receta Cocina ***");


        System.out.println("Introduce el nombre de la receta : ");
        Scanner sc = new Scanner(System.in);
        String nombreReceta = sc.nextLine();

        System.out.println("Introduce los ingredientes : ");
        String ingrediente = sc.nextLine();

        System.out.println("Introduce el tiempo (min) :");
        int tiempo = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce la dificultad : ");
        String dificultad = sc.nextLine();

        System.out.println("\n--- Receta Cocina ---");
        System.out.println("Nombre de la receta : " +  nombreReceta);
        System.out.println("Ingredientes de la receta : " +  ingrediente);
        System.out.println("Tiempo de la receta : " +  tiempo);
        System.out.println("Dificultad de la receta : " +  dificultad);


    }

}