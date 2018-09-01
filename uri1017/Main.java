package uri1017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = 12;
        float calc = (float)(a*b)/c;
        System.out.printf("%.3f\n", calc);

    }
}
