// faca um programa que peca um numero inteiro e determine se ele e par ou impar
// Dica: Utilize o operador modulo ( resto da divisao ).

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para descobrirmos se e par ou impar: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println(" PAR!");
        } else {
            System.out.println(" IMPAR!");
        }

    }
}
