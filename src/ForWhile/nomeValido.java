package ForWhile;
import java.util.Scanner;
public class nomeValido {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;

           System.out.println("Digite seu nome: ");
           nome = sc.nextLine();
        while (nome.length() < 3){
            System.out.println("Nome inválido. Digite novamente\nDigite seu nome: ");
            nome = sc.nextLine();
        }
        System.out.println("Nome "+nome+" cadastrado com sucesso.");
    }
}
