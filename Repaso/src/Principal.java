import Persona.Persona;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona persona = new Persona();
        System.out.print("Introduce el nombre : ");
        var nombre = sc.nextLine();
        System.out.print("Introduce el apellido : ");
        var apellido = sc.nextLine();

        persona.setNombre(nombre);
        persona.setApellido(apellido);
        System.out.println("Bienvenido : " + persona.getNombre() + " " + persona.getApellido());

        Persona persona1 = new Persona(nombre, apellido);

        System.out.println(persona1.toString());


    }
}
