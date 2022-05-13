// Faca um programa que le as duas notas parciais de um aluno numa disciplina ao longo
// de um semestre. E calcule sua media. A atribuicao de conceitos obedece a tabela abaixo.


import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        String aproveitamento = "";


        if (media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if (media >= 7.5 && media <= 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media <= 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media <= 6) {
            aproveitamento = "D";
        } else if (media >= 0 && media < 4) {
            aproveitamento = "E";
        }
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Conceito: " + aproveitamento);
        System.out.println("A media e: " + media);

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO!");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO!");
                break;
        }


    }
}
