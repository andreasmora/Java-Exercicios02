// calculando as raises de uma equacao do segundo grau

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor de A: ");
        double valorA = scan.nextDouble();

        if (valorA == 0){
            System.out.println("Nao e equacao de segundo grau!");
        } else {
            System.out.println("Entre com o valor de B: ");
            double valorB = scan.nextDouble();

            System.out.println("Entre com o valor de C: ");
            double valorC = scan.nextDouble();

            double delta = (valorB * valorB) - (4*valorA*valorC);
            if (delta < 0){
                System.out.println("Delta negativo");
            } else {

                System.out.println("Delta: " + delta);

                double x1 = ((-valorB) + Math.sqrt (delta)) / (2 * valorA);
                double x2 = ((-valorB) + Math.sqrt (delta)) / (2 * valorA);

                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);

            }
        }

    }
}
