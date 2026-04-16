package ForWhile;
import java.util.Scanner;
public class calculadoraFatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int continuar = 1;
      do {
          double numero, fator = 1;
          System.out.println("----------------------------");
          System.out.println("     Calculadora\n      Fatorial");
          System.out.println("----------------------------");

          System.out.println("Digite o número que deseja fatorar: ");
          numero = sc.nextDouble();

          for (int i = 1; i <= numero; i++) {
              fator = fator * i;
          }
          System.out.println("O resultado da fatoração de " + numero + " é:" + fator);

          System.out.println("Deseja fatorar outro número: 1 - Sim / 2 - Não");
          continuar = sc.nextInt();
      }while(continuar == 1);
        sc.close();
    }
}
