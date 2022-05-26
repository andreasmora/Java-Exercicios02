// Faça  um  programa  que  leia  5  números  e  informe  a  soma  e  a
// média dos números

import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma = 0;

        for (int i= 0; i < 5; i++) {
            System.out.println("Entre com um numero: ");
            num = scan.nextInt();

            soma += num;

        }
        media = soma / 5;

        System.out.println("Soma: " +soma);
        System.out.println("Media: " + media);
    }
}
