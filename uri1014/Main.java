package uri1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        float lts = sc.nextFloat();
        System.out.printf("%.3f km/l\n",(km/lts));

    }
}
