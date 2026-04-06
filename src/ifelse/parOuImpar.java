package ifelse;

import java.util.Scanner;
public class parOuImpar {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int continuar;
    do {

        int numero;

        System.out.println("------------------------");
        System.out.println("      Par ou ímpar");
        System.out.println("------------------------");

        System.out.println("Digite um Número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par !!");
        } else {
            System.out.println("O número " + numero + " é ímpar !!");
        }

        System.out.println("Deseja testar outro número?: 1 - Sim / 2 - Não");
        continuar = sc.nextInt();
    } while(continuar == 1);
        sc.close();
    }
}
