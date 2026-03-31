import java.util.Scanner;
public class mediaNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int continuar;
        do {
           double n1, n2, n3, media;


           System.out.println("--------------------------------");
           System.out.println("      Media de notas ");
           System.out.println("--------------------------------");

           System.out.println("Digite a nota da sua primeira prova: ");
           n1 = sc.nextDouble();
           System.out.println("Digite a nota da sua segunda prova: ");
           n2 = sc.nextDouble();
           System.out.println("Digite a nota da sua terceira prova: ");
           n3 = sc.nextDouble();

           media = (n1 + n2 + n3) / 3;

           System.out.println("A media das notas foi: " + media);


           System.out.println("Deseja testar outras notas?: 1 - Nim / 2 - Não");
           continuar = sc.nextInt();
       }while(continuar == 1);
        System.out.println("programa encerrado");
        sc.close();
    }
}
