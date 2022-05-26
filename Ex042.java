// Faça um programaque peça uma nota, entre zero e dez.
// Mostre uma mensagem  caso  o  valor  seja  inválido
// e  continue  pedindo  até  que  o usuário informe um valor válido

import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Voce Digitou: " + nota);
            } else {
                System.out.println("Nota invalida, digite novamente: ");
            }

        } while (!notaValida);


    }
}
