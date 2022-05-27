//O Sr.Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas.
// Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela que contém o número de itens
// que o cliente  comprou eao lado o valor da conta. Desta forma a atendente do caixa
// precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços.
// Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os preços de 1 até 20 produtos,
// conforme o exemplo abaixo:oLojas Quase Dois -Tabela de preçoso1 -R$ 1.99 o2 -R$ 3.98 o... o50 -R$ 99.5

import java.util.Scanner;

public class Ex064 {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);

        System.out.println("Lojas quase dois - Tabela de precos");

        for (int i=1; i<=20; i++){
            System.out.println(i + "- R$" + (1.99 *i));
        }


    }
}
