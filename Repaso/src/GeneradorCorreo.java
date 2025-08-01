public class GeneradorCorreo {

    public static void main(String[] args) {

        // Parte del nombre de usuario

        String nombreCompleto = " Borja Chacon alvarez  "; //trim quita los espacios en blanco
        String nombreFormateado = nombreCompleto.trim().toLowerCase().replace(" " , "."); // Pasar del nombre a minusculas y quitar los espacios por puntos
        System.out.println(nombreFormateado);

        // Parte del correo electrónico


        String empresa = "Econcom";
        String empresaMinuscula = empresa.toLowerCase();
        String dominio = ".com";
        String direccion = "@"+empresaMinuscula + dominio;
        System.out.println(direccion);

        // Parte final juntando el nombre con el correo

        System.out.println(nombreFormateado + direccion);


    }
}
