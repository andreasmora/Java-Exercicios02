// Faça um programa que leia 5 números e informe o maior número.


import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++){
            System.out.println("Entre com um numero: ");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
                System.out.println("O maior numero mudou: " + maior);
            }

        }

        System.out.println("O maior numero digitado foi: " + maior);
        }
    }

