import java.util.Scanner;

public class Ex040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade (Kg) de morangos: ");
        double qtdmorango = scan.nextDouble();

        System.out.println("Digite a quantidade (Kg) de maca: ");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango = 0;

        if (qtdmorango <= 5) {
            precoKgMorango = 2.50;
        } else {
            precoKgMorango = 2.20;
        }

        double precoKgMaca = 0;

        if (qtdMaca <= 5){
            precoKgMaca = 1.80;
        } else {
            precoKgMaca = 1.50;
        }
        double precoTotalMorango = qtdmorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;

        if ((qtdmorango + qtdMaca > 8) || precoParcial > 25 ) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        System.out.println("Preco total = " + precoTotal);







    }
}
