// Altere o programa anterior para mostrar no final a soma dos números

import java.util.Scanner;

public class Ex052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num1;
        int num2;
        int soma = 0;

        System.out.println("Entre com o primeiro numero:  ");
        num1 = scan.nextInt();
        System.out.println("Entre com o segundo numero: ");
        num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            soma += i;
        }
        System.out.print("Soma" + soma);
    }
}
