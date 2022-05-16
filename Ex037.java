// faca um programa que leia 02 numeros e em seguida pergunte ao usuario qual operacao
// ele deseja realizar. O resultado da operacao deve ser acompanhado de uma frase que diga se
// o numero e: par ou impar /  positivo ou negativo.

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Qual operacao voce deseja realizar, ( + - / * ");
        String operacao = scan.next();

        double  resultado = 0;
        boolean valida = true;

        switch (operacao){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "/": resultado = num1 / num2; break;
            case "*": resultado = num1 * num2; break;
            default:
                System.out.println("operacao invalida!!");
                valida = false;

        }

        if (valida){

            System.out.println("Valor do resultado: " + resultado);
            if (resultado >= 0){
                System.out.println("Resultado positivo!");
            } else {
                System.out.println("Resultado negativo!");
            }
             if (resultado % 2 == 0){
                 System.out.println("Resultado PAR!");
             } else {
                 System.out.println("Resultado IMPAR!");
             }
        }
    }
}
