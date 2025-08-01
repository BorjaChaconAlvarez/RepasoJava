import java.util.Scanner;

public class AutenticacionFacill {
    public static void main(String[] args) {
        String usuario =  "admin";
        String password = "admin";

        Scanner sc = new Scanner(System.in);

        System.out.println("*** INTRODUCE TU AUTENTICACIÓN ***");

        System.out.println("Introduce el nombre del usuario : ");
        String usuarioLeido = sc.nextLine();
        System.out.println("Introduce el password del usuario : ");
        String passwordLeido = sc.nextLine();

        if (usuarioLeido.equals(usuario) && passwordLeido.equals(password)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
