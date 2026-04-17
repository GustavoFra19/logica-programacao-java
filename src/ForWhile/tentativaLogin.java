package ForWhile;
import java.util.Scanner;
public class tentativaLogin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean acessoConcedido = false;
        int senha = 1234, senhaDigitada;

        System.out.println("--------------------");
        System.out.println(" Sistema de login");
        System.out.println("--------------------");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Tentativa "+i+" Digite sua senha: ");
            senhaDigitada = sc.nextInt();
            if(senhaDigitada == senha){
                System.out.println("Senha correta.\nBem vindo!");
               acessoConcedido = true;
               break;

            } else if (i < 3 ){
                int restantes = 3 - i;
                System.out.println("Voce tem "+restantes+" Tentativas.");
            }
        }
        if (!acessoConcedido){
            System.out.println("Conta bloqueada temporariamente.");
        }
        sc.close();
    }
}
