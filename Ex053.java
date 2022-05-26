// Desenvolva  um  gerador  de  tabuada,  capaz  de  gerar  a  tabuada
// de qualquer número inteiro entre 1 a 10. O usuário deve informar
// de qual numero  ele  deseja  ver  a  tabuada.
// A  saída  deve  ser  conforme  o exemplo abaixo:
// oTabuada de 5: o5 X 1 = 5 o5 X 2 = 10 o... o5 X 10 = 50


import java.util.Scanner;

public class Ex053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Entre com um numero para gerar a tabuada: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de: " + numero + ":");
        for (int i= 1; i <= 10; i++){
            System.out.println(numero + "x" + i + " = " + (numero * i));

        }
            System.out.println("----------Tabuada gerada!!------------");
    }
}
