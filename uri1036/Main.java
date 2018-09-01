package uri1036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);

        if ((a != 0) && delta > 0) {
            double x1 = (-b + Math.sqrt(delta))/ (2 * a);
            double x2 = (-b - Math.sqrt(delta))/ (2 * a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        } else {
            System.out.println("Impossivel calcular");
        }

    }
}
