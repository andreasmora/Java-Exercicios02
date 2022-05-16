// faca um programa que peca um numero correspondente a um determinado ano e em seguida
// informe se esse ano é um ano bissexto.



import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println(ano + " E um ano bissexto");
        } else {
            System.out.println(ano + " Nao e um ano bissexto");
        }

    }
}
