    //Desenvolva um programa que faça a tabuada de um número qualquer inteiro  que  será  digitado  pelo  usuário,  mas  a
    // tabuada  não  deve necessariamente  iniciar  em  1  e  terminar  em  10,  o  valor  inicial  e  final devem   ser
    // informados   também   pelo   usuário,   conforme   exemplo abaixo:oMontar a tabuada de: 5
    //oComeçar por: 4 oTerminar em: 7  ooVou montar a tabuada de 5 começando em 4 e terminando em
    // 7: o5 X 4 = 20 o5 X 5 = 25 o5 X 6 = 30 o5 X 7 = 35Obs: Você deve verificar
    // se o usuário não digitou o final menor que o inicia


    import java.util.Scanner;

    public class Ex071 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com um numero para gerar a tabuada: ");
            int numero = scan.nextInt();

            boolean invalido = true;
            int numFinal, numInicial;


            do {
                System.out.println("Entre com o inicio da tabuada:");
                numInicial = scan.nextInt();

                System.out.println("Entre com o final da tabuada: ");
                numFinal = scan.nextInt();

                if (numFinal > numInicial){
                    invalido = false;
                }

            } while (invalido);

                System.out.println("Tabuada de " + numero + ":");
                System.out.println("Comecar por " + numInicial);
                System.out.println("Terminar em " + numFinal);
                System.out.println();



            for (int i=numInicial; i<=numFinal; i++){
                System.out.println(numero + " X " + i + " = " + (numero*i));


            }
        }
    }
