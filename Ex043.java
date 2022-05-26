//Faça um programa que leia um nome de usuário e a sua senha e não aceite
// a  senha  igual  ao  nome  do  usuário,  mostrando  uma  mensagem de erro
// e voltando a pedir as informações.

import java.util.Scanner;

public class Ex043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do {
            System.out.println("Entre com o nome de usuario: ");
            nomeUser = scan.next();

            System.out.println("Entre com a senha: ");
            senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                infoValidas = false;
                System.out.println("Senha igual a usuario, digite novamente: ");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuarios validos!");
            }

        } while (!infoValidas);


    }
}
