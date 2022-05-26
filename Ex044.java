// Faça um programa que leia e valide as seguintes informações:
// a.Nome: maior que 3 caracteres;b.Idade: entre 0 e 150;c.
// Salário: maior que zero;d.Sexo: 'f' ou 'm';e.Estado Civil: 's', 'c', 'v', 'd


import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infovalida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com o nome: ");
            nome = scan.next();

            if (nome.length() >= 3){
                infovalida = true;
            } else {
                System.out.println("Nome precisa no minimo 03 caracteres.");
            }
        } while (!infovalida);

        infovalida = false;

        do {
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150){
                infovalida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150 ");
            }
        } while (!infovalida);

        infovalida = false;

        do {
            System.out.println("Entre com o salario: ");
            salario = scan.nextDouble();

            if (salario > 0){
                infovalida = true;
            } else {
                System.out.println("Salario precisa ser maior que zero ");
            }
        } while (!infovalida);

        infovalida = false;

        do {
            System.out.println("Entre com o sexo: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infovalida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'. ");
            }
        } while (!infovalida);


        infovalida = false;

        do {
            System.out.println("Entre com o estado civil: ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("d") ||
                    estadoCivil.equalsIgnoreCase("v")){
                infovalida = true;
            } else {
                System.out.println("Estado Civil precisa ser 's', 'c', 'd' ou 'v' ");
            }
        } while (!infovalida);

            System.out.println("As seguintes informacoes foram coletadas! ");
            System.out.println("Nome: " +  nome);
            System.out.println("Idade: " +  idade);
            System.out.println("Salario: " +  salario);
            System.out.println("Sexo: " +  sexo);
            System.out.println("Estado Civil: " +  estadoCivil);


    }
}
