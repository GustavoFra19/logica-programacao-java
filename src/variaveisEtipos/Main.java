package variaveisEtipos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String nome;
      int idade;

      System.out.println("Digite seu nome: ");
      nome = sc.nextLine();
      System.out.println("Digite sua idade:");
      idade = sc.nextInt();

      System.out.println("Seu nome é " + nome + ", e vc tem " + idade + " anos.");

        sc.close();
        }
    }
