package uri1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int year, month, day;
        year = days / 365;
        month = (days - (year * 365)) / 30;
        day = (days - (year * 365) -(month * 30));
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", year, month, day);
    }
}
