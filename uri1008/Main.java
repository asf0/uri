package uri1008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();
        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f\n", (b*c));

    }
}
