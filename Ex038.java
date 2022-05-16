import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou pra vitima: ");
        String resp1 = scan.next();
        System.out.println("Esteve no local do crime: ");
        String resp2 = scan.next();
        System.out.println("Mora perto da vitima: ");
        String resp3 = scan.next();
        System.out.println("Devia pra vitima: ");
        String resp4 = scan.next();
        System.out.println("Ja trabalhou com a vitima: ");
        String resp5 = scan.next();

        int contador = 0;
        if (resp1.equalsIgnoreCase("SIM")){
            contador ++;
        }
        if (resp2.equalsIgnoreCase("SIM")){
            contador ++;
        }
        if (resp3.equalsIgnoreCase("SIM")){
            contador ++;
        }
        if (resp4.equalsIgnoreCase("SIM")){
            contador ++;
        }
        if (resp5.equalsIgnoreCase("SIM")){
            contador ++;
        }
        if (contador == 2){
            System.out.println("Suspeita!!");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cumplice!!");
        } else if (contador == 5) {
            System.out.println("Assassino");
        } else if (contador == 0) {
            System.out.println("Voce e inocente");
        }
    }
}
