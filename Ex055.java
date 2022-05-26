// Faça  um  programa  que  peça  10  números  inteiros,
// calcule  e  mostre  a quantidade de números pares e a
// quantidade de números impares.


import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        for (int i= 0; i< 10; i++){
            System.out.println("Entre com um numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                pares ++;
            } else {
                impares ++;
            }
        }
            System.out.println("A quantidade de numeros pares = : " + pares);
            System.out.println("A quantidade de numeros impares = : " + impares);


    }
}
