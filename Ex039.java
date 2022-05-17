import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de litros vendidos: ");
        double qtdLitros = scan.nextDouble();

        System.out.println("Entro com o tipo de combustivel: (G) Gasolina, (A) Alcool");
        String tipoCombustivel = scan.next();

        double precoGasolina = 7.50;
        double precoAlcool = 5.50;
        int percentualDesconto = 0;
        double total = 0;
        double totalDesconto = 0;


        if (tipoCombustivel.equalsIgnoreCase("a")){

            if (qtdLitros <= 20){
                percentualDesconto = 3;
            } else {
                percentualDesconto = 5;
            }

            total = qtdLitros * precoAlcool;

        } else if (tipoCombustivel.equalsIgnoreCase("g")) {

            if (qtdLitros <= 20){
                percentualDesconto = 4;
            } else {
                percentualDesconto = 6;
            }
            total = qtdLitros * precoGasolina;
        }
            totalDesconto = (total / 100) * percentualDesconto;
                 System.out.println("O Total de desconto sera de: " + totalDesconto);
                 System.out.println("O percentual de desconto sera de: " + percentualDesconto);

                 double precoApagar = total - totalDesconto;
                 System.out.println("Valor a ser pago, sera: R$" + precoApagar);
    }
}

