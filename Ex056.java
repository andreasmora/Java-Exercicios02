// A série de Fibonacci é formada pela seqüência
// 1,1,2,3,5,8,13,21,34,55,...
// Faça  um  programa  capaz  de  gerar  a  série até o n−ésimo termo

import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n;
        System.out.println("Entre com o n-esimo termo da serie de fibonacci: ");
        n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        //1,1,2,3,5 sequencia fibonacci
        //primeiro = 1
        //segundo = 2
        //proximo = 3

        for (int i=3; i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }


    }
}
