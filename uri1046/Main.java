package uri1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a >= b) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", (24 - (a-b)));
        } else{
            System.out.printf("O JOGO DUROU %d HORA(S)\n", b - a);
        }
    }
}
