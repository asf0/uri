package uri1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valores[] = new double[] {4.00, 4.50, 5.00, 2.00, 1.50};
        int cod = sc.nextInt();
        int pd = sc.nextInt();
        double cont = valores[cod-1] * pd;
        System.out.printf("Total: R$ %.2f\n", cont);
    }
}
