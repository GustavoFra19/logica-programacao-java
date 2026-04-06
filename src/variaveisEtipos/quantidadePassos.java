package variaveisEtipos;

import java.util.Scanner;
public class quantidadePassos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int continuar;
        do {


        int quantidadePassos, op, passos;

        System.out.println("--------------------");
        System.out.println("Verificador de passos");
        System.out.println("--------------------");

        System.out.println("Quantos passos vc desejar andar hoje?:");
        quantidadePassos = sc.nextInt();

        System.out.println("Quantos passos vc andou hoje?: ");
        passos = sc.nextInt();

        op = quantidadePassos - passos;

        System.out.println("Ainda faltam " + op + " Para completar a quantidade de passos desejada.");

        System.out.println("-------------------------------------");
        System.out.println("Andou mais passo? 1 - Sim / 2 - Não");
        continuar = sc.nextInt();
        } while(continuar == 1);
        sc.close();
    }
}
