package uri1010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int produto1 = sc.nextInt();
        int qnt1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        int produto2 = sc.nextInt();
        int qnt2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",((qnt1 * preco1) + (qnt2 * preco2)));

    }
}
