    // O cardápio de uma lanchonete é o seguinte:oEspecificação   Código  Preço oCachorro Quente 100
    // R$ 1,20 oBauru Simples   101     R$ 1,30 oBauru com ovo   102     R$ 1,50 oHambúrguer   103
    // R$ 1,20 oCheeseburguer   104     R$ 1,30 oRefrigerante    105     R$ 1,00Faça  um  programa  que
    // leia o  código  dos  itens  pedidos  e  as quantidades desejadas. Calcule e mostre o valor a ser
    // pago por item  (preço  *  quantidade)  e  o  total  geral  do  pedido.  Considere que   o   cliente
    // deve   informar   quando   o   pedido   deve   ser encerrado

    import java.util.Scanner;

    public class Ex073 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            boolean naoTerminar = true;
            int codigo;
            int quantidade;
            double total = 0;
            String output = "";


            do {
                System.out.println("Digite o codigo e a quantidade. Digite 0 0 para sair");
                codigo = scan.nextInt();
                quantidade = scan.nextInt();

                if (codigo == 0 && quantidade == 0){
                    naoTerminar = false;
                    output += "Total a pagar = " + total;
                } else {

                    if (codigo == 100){
                        output += "Cachorro quente ->  R$ 1,20 * " + quantidade;
                        output += " = " + (1.20*quantidade) + "\n";
                        total += 1.20*quantidade;
                    } else if (codigo == 101) {
                        output += "Bauru simples ->  R$ 1,30 * " + quantidade;
                        output += " = " + (1.30*quantidade) + "\n";
                        total += 1.30*quantidade;
                    } else if (codigo == 102) {
                        output += "Bauru com ovo ->  R$ 1,50 * " + quantidade;
                        output += " = " + (1.50*quantidade) + "\n";
                        total += 1.50*quantidade;
                    } else if (codigo == 103) {
                        output += "Hamburguer ->  R$ 1,20 * " + quantidade;
                        output += " = " + (1.20*quantidade) + "\n";
                        total += 1.20*quantidade;
                    } else if (codigo == 104) {
                        output += "Chesseburguer ->  R$ 1,30 * " + quantidade;
                        output += " = " + (1.30*quantidade) + "\n";
                        total += 1.30*quantidade;
                    } else if (codigo == 105) {
                        output += "Refrigerante ->  R$ 1,00 * " + quantidade;
                        output += " = " + (1.00*quantidade) + "\n";
                        total += 1.00*quantidade;
                    }
                }



            } while (naoTerminar);

            System.out.println(output);
        }
    }
