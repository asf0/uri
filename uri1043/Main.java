package uri1043;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if ((a < (b+c)) && (b < (c+a)) && (c < (a+b))) {
            System.out.printf("Perimetro = %.1f\n", (a + b + c));
        } else {
            System.out.printf("Area = %.1f\n",(((a+b)*c)/2));
        }
    }
}
