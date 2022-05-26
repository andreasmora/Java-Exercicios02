// Faça  um  programa  que  calcule  o  fatorial  de  um  número
// inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120


import java.util.Scanner;

public class Ex058 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        System.out.println(numero + "! = ");
        int fatorial = 1;

        for (int i= numero; i>0; i--){
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);

    }
}
