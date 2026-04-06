package variaveisEtipos;

import java.util.Scanner;
public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar;
        do {
            int idade;
            String nome;

            System.out.println("--------------------");
            System.out.println("Verificação de variaveisEtipos.idade");
            System.out.println("--------------------");

            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite sua variaveisEtipos.idade: ");
            idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Bem vindo " + nome + " Você tem " + idade + " Então pode entrar, pse e maior de variaveisEtipos.idade  !");
            } else {
                System.out.println(nome + " Você não pode entrar, vc tem " + idade + " Você e de menor.");
            }
            System.out.println("Deseja tentar de novo? 1 - Sim / 2 - Não");
            continuar = sc.nextInt();
            sc.nextLine();
        } while (continuar == 1);
        sc.close();
    }
}