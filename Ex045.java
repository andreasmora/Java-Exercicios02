// Supondo  que  a  população  de  um  país  A  seja  da  ordem  de  80000
// habitantes  com  uma  taxa  anual  de  crescimento  de  3%  e  que  a
// população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
// Faça um programa que calcule e escreva o número de anos necessários
// para  que  a  população  do  país  A  ultrapasse  ou  iguale  a população do país
// B, mantidas as taxas de crescimento


import java.util.Scanner;

public class Ex045 {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);

        int popA = 80000;
        int popB = 200000;
        int contador = 0;

        while (popA < popB){
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            contador ++;

        }
        System.out.println("A populacao A: " + popA);
        System.out.println("A populacao B: " + popB);
        System.out.println("Quantidade de anos: " + contador);
        System.out.println(contador + " anos para a populacao 'A' passar a populacao 'B'. ");


    }
}
