                // Os    números    primos    possuem    várias    aplicações    dentro    da Computação, por exemplo na Criptografia.
                // Um número primo é aquele que  é  divisível  apenas  por  um  e  por  ele  mesmo.  Faça  um  programa que  peça
                // um  número  inteiro  e  determine  se  ele  é  ou  não  um  número primo

                import java.util.Scanner;

                public class Ex069 {
                    public static void main(String[] args) {
                        Scanner scan = new Scanner(System.in);

                        System.out.println("Entre com um numero:");
                        int numero = scan.nextInt();

                        boolean primo = true;

                        for (int i=2; i<numero; i++) {

                            if (numero % i == 0) {
                                System.out.println("Nao e primo - divisivel por " + i);
                                primo = false;
                            }
                        }

                            if (primo) {
                                System.out.println("E um numero primo!");
                            }
                    }
                }
