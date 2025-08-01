public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un número es par o no
        int numero = 5;
        String resultado = (numero % 2 == 0 ? "Par": "Impar"); // Es String porque devuelvo una cadena de texto y no devuelvo un numero

        System.out.println("El número " + numero + " es " + resultado);

        // Calcular si es mayor de de edad
        int edad = 18;
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = 0;
        resultado =((numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero");
        System.out.println("\nEl número " + numero + " es " + resultado);
    }
}
