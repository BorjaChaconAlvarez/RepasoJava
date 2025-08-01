import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa!");

        boolean salir = false;
        Scanner sc = new Scanner(System.in);

        while (!salir){

            System.out.println("Escriba la contraseña:");
            var con = sc.nextLine();
            if(con.length() < 6){
                System.out.println("Introduce otra contraseña");
                salir= false;
            }

            else{
                System.out.println("Contraseña Valida : " + con);
                salir = true;

            }
        }
    }
}
