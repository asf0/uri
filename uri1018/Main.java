package uri1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        if (valor > 0 && valor <1000000){
            int notas[] = new int[] {100, 50, 20, 10, 5, 2, 1};
            System.out.println(valor);
            for(int c = 0; c < notas.length; c++) {

                System.out.printf("%d nota(s) de R$ %d,00\n",(valor/notas[c]), notas[c]);
                valor -= notas[c] *(valor/notas[c]);
            }
        }

    }
}
