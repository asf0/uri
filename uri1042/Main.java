package uri1042;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        ArrayList l = new ArrayList();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        l.add(a);
        l.add(b);
        l.add(c);
        Collections.sort(l);

        for (Object integer : l) {
            System.out.println(integer);
        }
        System.out.printf("\n%d\n%d\n%d\n", a, b, c);

    }
}
