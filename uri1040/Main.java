package uri1040;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n5, ntex, media;

        double pesos[] = new double[] {0.2, 0.3, 0.4, 0.1};
        ArrayList<Float> notas = new ArrayList<Float>();

        for (int i = 0; i <4; i++) {
            notas.add(sc.nextFloat());
        }
        media = 0;
        int cont = 0;
        for (Float v: notas) {
            media += (v * pesos[cont]);
            cont++;
        }

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            n5 = sc.nextFloat();
            ntex = (media + n5)/2;
            System.out.printf("Nota do exame: %.1f\n", n5);

            if (ntex >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final: %.1f\n", ntex);
        } else {
            System.out.println("Aluno reprovado.");

        }
    }
}
