package uri1012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.printf("TRIANGULO: %.3f\n",((a*c)/2));
        System.out.printf("CIRCULO: %.3f\n", (c*c*3.14159));
        System.out.printf("TRAPEZIO: %.3f\n", (((a+b)/2)*c));
        System.out.printf("QUADRADO: %.3f\n",(b*b));
        System.out.printf("RETANGULO: %.3f\n",(a*b));
    }
}
