// Faça  um  programa  que  imprima  na  tela  apenas  os  números  ímpares
// entre 1 e 50.

import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);


        for (int i= 1; i <= 50; i++){

            if (i % 2 != 0){
                System.out.print(i + " ");
            }

        }
    }
}
