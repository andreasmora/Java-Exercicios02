//Faça um programa que calcule o valor total investido por um colecionador em  sua  coleção  de  CDs
// e  o valor médio  gasto em cada um deles.O usuário deverá informar a quantidade
// de CDs e o valor para em cada um

import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de CDS: ");
        int cds = scan.nextInt();

        double preco;
        double soma= 0;

        for (int i=1; i<=cds; i++){
            System.out.println("Informe o valor do CD: " + i);
            preco = scan.nextDouble();
            soma += preco;

        }
        double media = soma / cds;
        double total = soma;
        System.out.println("Media gasta com cada CDS e: " + media);
        System.out.println("Valor total gasto em CD: " + total);

    }
}
