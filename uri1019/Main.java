package uri1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int sec, min, hour;
        hour = entrada / 3600;
        min = (entrada - (hour * 3600)) / 60;
        sec = (entrada - (hour * 3600) - (min * 60));
        System.out.printf("%d:%d:%d\n", hour, min, sec);
    }
}
