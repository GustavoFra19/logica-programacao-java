package ForWhile;
import java.util.Scanner;
public class pulaNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeros;

        System.out.println("Digite ate onde deseja contar pulando os números 5: ");
        numeros = sc.nextInt();

        for (int i = 1; i <= numeros; i++) {
            if(i % 10 != 5){
                System.out.print(i + " ");
            }
        }

    }
}
