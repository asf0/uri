package uri1011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double esfera = sc.nextDouble();
        System.out.printf("VOLUME = %.3f\n", ((4/3.0) * 3.14159 * Math.pow(esfera, 3.0)));
    }
}
