package uri1045;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c,;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if ((a*a) == ((b*b) + (c*c))) {
                System.out.println("TRIANGULO RETANGULO");
            } else if ((a*a) >= ((b*b) + (c*c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if ((a*a) <= ((b*b) +(c*c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else if (a == b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
        }

    }
}
