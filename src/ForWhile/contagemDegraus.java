package ForWhile;
import java.util.Scanner;
public class contagemDegraus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int degraus;

        System.out.println("Digite quantos degraus você quer subir: ");
        degraus = sc.nextInt();

        for (int i = 1; i <= degraus; i++){
            System.out.println("Subindo o degrau: "+ i);
        }
    }
}
