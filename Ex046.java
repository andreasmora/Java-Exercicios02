// Altere   o   programa   anterior   permitindo   ao   usuário   informar
// as populações  e  as  taxas  de  crescimento  iniciais.  Valide  a  entrada  e
// permita repetir aoperação


import java.util.Scanner;

public class Ex046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valido = false;


        do {
            System.out.println("Entre com a populacao A: ");
            popA = scan.nextDouble();
            if (popA > 0){
                valido = true;
            } else {
                System.out.println("Populacao 'A' precisa ser maior que zero: ");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a populacao B: ");
            popB = scan.nextDouble();
            if (popB > 0){
                valido = true;
            } else {
                System.out.println("Populacao 'B' precisa ser maior que zero: ");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da populacao A: ");
            taxaA = scan.nextDouble();
            if (taxaA > 0){
                valido = true;
            } else {
                System.out.println("Populacao 'A' precisa ser maior que zero: ");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da populacao B: ");
            taxaB = scan.nextDouble();
            if (taxaB > 0){
                valido = true;
            } else {
                System.out.println("Populacao 'B' precisa ser maior que zero: ");
            }

        } while (!valido);

        int contador = 0;
        while (popA < popB){
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            contador ++;
        }

        System.out.println("A populacao A: " + popA);
        System.out.println("A populacao B: " + popB);
        System.out.println("Quantidade de anos: " + contador);
    }
}
