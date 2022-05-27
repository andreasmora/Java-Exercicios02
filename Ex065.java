//O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha,
// que já é um sucesso na sualoja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães,
// de 1 até 20 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
// oPreço do pão: R$ 0.18 oPanificadora Pão de Ontem -Tabela de preçoso1 -R$ 0.18 o2 -R$ 0.36 o... o50 -R$ 9.0025.O

import java.util.Scanner;

public class Ex065 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        System.out.println("Preco do pao: R$ 0.18" );
        System.out.println("Panificadora paes de ontem - Tabela de precos.");

        for (int i=1; i<=20; i++){
            System.out.println(i + "- R$" + (0.18 *i));
        }
    }
}
