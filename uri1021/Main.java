package uri1021;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <=1000000.00){

            int notas[] = new int[] {100, 50, 20, 10, 5, 2};
            System.out.println("NOTAS:");

            for (int c = 0; c < notas.length; c++) {
                int temp = (int) (valor / notas[c]);
                System.out.printf("%d nota(s) de R$ %d.00\n",temp, notas[c]);
                valor = converteDouble(valor - (notas[c] * temp));
            }

            double moedas[] = new double[] {1, 0.5, 0.25, 0.10, 0.05, 0.01};
            System.out.println("MOEDAS:");

            for (int d = 0; d < moedas.length; d ++) {
                int temp = (int) (valor / moedas[d]);
                System.out.printf("%d moeda(s) de R$ %.2f\n", temp, moedas[d]);
                valor = converteDouble(valor - (moedas[d] * temp));
            }
        }
    }
    private static double converteDouble(double var){
        DecimalFormat format = new DecimalFormat("0.00");
        return Double.valueOf(format.format(var));
    }
}