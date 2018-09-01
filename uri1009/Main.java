package uri1009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        float salario = sc.nextFloat();
        float venda = sc.nextFloat();
        System.out.printf("TOTAL = R$ %.2f\n", (salario + (venda*0.15)));

    }
}
