import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final String USUARIO_VALIDO = "admin";
        final String PASSWORD_VALIDO = "123";

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        String usuario = consola.nextLine().trim();

        System.out.print("Ingresa tu password: ");
        String password = consola.nextLine().trim();

        // Cada caso de validacion de usuario y password
      /*  var mensajeAutenticacion = switch (usuario){
            case USUARIO_VALIDO -> {
                if(PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al Sistema!";
                else
                    yield "Password incorrecto, favor de corregirlo!";
            }
            default -> {
                if(PASSWORD_VALIDO.equals(password))
                    yield "Usuario incorrecto, favor de corregirlo!";
                else
                    yield "Usuario y password incorrectos, favor de corregirlos!";
            }
        };
        // Imprimir el mensaje
        System.out.println(mensajeAutenticacion);*/
    }
}
