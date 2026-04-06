package variaveisEtipos;

import java.util.Scanner;
public class conversorDeMoedas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int continuar;
        do {

            double valorReal;
            double op;

            System.out.println("------------------------");
            System.out.println("  Conversor de dolares ");
            System.out.println("------------------------");

            System.out.println("Digite o valor em reais que deseja converter para dolares:  ");
            valorReal = sc.nextDouble();

            op = (valorReal / 5.25);

            System.out.println("----------------------------------");
            System.out.println("Conversão realizada com sucesso");
            System.out.println("----------------------------------");

            System.out.println("Você tinha " + valorReal + " reais, agora possui " + op + " Dolares !!");

        System.out.println("Deseja converter outro valor?: 1 - Sim / 2 - Não");
        continuar = sc.nextInt();
        }while(continuar == 1);
        sc.close();
    }
}
