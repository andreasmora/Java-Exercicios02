// Faça  um  programa  que  peça  um  número  inteiro  e  determine  se
// ele  é ou  não  um  número  primo.  Um  número  primo  é  aquele
// que  é  divisível somente por ele mesmo e por 1

import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();

        boolean primo = false;

        for (int i= 2; i< num; i++){
            if (num % i == 0) {
                System.out.println("Nao e primo - divisivel por: " + i);
            }
        }

        if (primo){
            System.out.println("E numero primo");
        }

    }
}
