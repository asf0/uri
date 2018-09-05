package uri1045;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, temp;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        } if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }   if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (a*a > ((b*b)+(c*c))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if ((a*a) == ((b*b) + (c*c))) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if ((a*a) < (((b*b) +(c*c)))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c && c == a) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((a == b) && (a != c) || ((a == c) && (a != b)) || ((b == c) && (b !=a))) {
            System.out.println("TRIANGULO ISOSCELES");
        }
        }
    }

