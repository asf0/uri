package uri1015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1, x2, y1, y2;
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();

        double dist = Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
        System.out.printf("%.4f\n", dist);
    }
}
