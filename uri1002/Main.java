package uri1002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double a = reader.nextDouble();
        double z = (3.14159 * a * a);
        System.out.printf("A=" + "%.4f\n",z);

    }
}