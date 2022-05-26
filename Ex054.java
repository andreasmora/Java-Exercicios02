// Faça um programa que peça dois números,base e expoente,
// calcule e mostre  o  primeiro  número  elevado ao  segundo  número.  Não  utilize  a função de potência da linguagem


import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base;
        int potencia;

        System.out.println("Entre com a base: ");
        base = scan.nextInt();

        System.out.println("Entre com a potencia: ");
        potencia = scan.nextInt();

         //2ˆ2 = 2 * 2
        //2ˆ3 = 2 * 2 * 2

        int resultado = base;

        for (int i= 1; i<potencia; i++){
            resultado *= base;
        }
        System.out.println("Resultado = " + resultado);
    }
}
