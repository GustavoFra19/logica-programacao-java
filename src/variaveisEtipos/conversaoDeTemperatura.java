package variaveisEtipos;

import java.util.Scanner;
public class conversaoDeTemperatura {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cel;
        double fh;

        System.out.println("--------------------------------");
        System.out.println("  Conversor de temperatura");
        System.out.println("--------------------------------");

        System.out.println("Digite a temperatura em graus celsius: ");
        cel = sc.nextInt();

        fh = (cel * 9 /5  ) + 32;

        System.out.println("A temperatura em Fahrenheint é : " + fh);
        sc.close();
    }
}
