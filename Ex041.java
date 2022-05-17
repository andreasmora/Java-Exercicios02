import java.util.Scanner;

public class Ex041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne:");
        System.out.println("1- File duplo");
        System.out.println("2- Alcatra");
        System.out.println("3- Picanha");

        int tipo = scan.nextInt();
        System.out.println("Entre com a quantidade (KG): ");
        double quantidade = scan.nextDouble();
        double precoKilo = 0;

        if (tipo == 1){
            System.out.println(quantidade + "KG - File duplo");
            if (quantidade < 5) {
                precoKilo = 4.90;
            } else {
                precoKilo = 5.80;
            }
        } else if (tipo == 2) {
            System.out.println(quantidade + "KG - Alcatra");
                if (quantidade < 5){
                    precoKilo = 5.90;
                } else {
                    precoKilo = 6.80;
                }
        } else if (tipo == 3) {
            System.out.println(quantidade + "KG - Picanha");
                if (quantidade < 5){
                    precoKilo = 6.90;
                } else {
                    precoKilo = 7.80;
                }
        }
                double total = quantidade * precoKilo;
                 System.out.println(quantidade + "KG * " + precoKilo + "=" + total);

                  System.out.println(" Compra no cartao divite (1) para SIM:");
                  int cartao = scan.nextInt();

                  if (cartao == 1){
                      double desconto = (total / 100) * 5;
                      System.out.println("Desconto de: " + desconto);
                      System.out.println("Valor a Pagar: " + (total - desconto));
                  } else {
                      System.out.println("Valor a pagar: " + total);
                  }
    }
}
