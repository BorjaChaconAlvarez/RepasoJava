import java.util.Scanner;

public class CalculoTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Base del triangualo : ");
        Double base = input.nextDouble();
        System.out.println("Area del triangulo : ");
        Double altura = input.nextDouble();


        System.out.println("el area del triangulo : " + base * altura);

        System.out.println("el perimetro del triangulo : " + 2 * (base + altura));

    }
}
