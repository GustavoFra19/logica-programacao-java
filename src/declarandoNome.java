import java.util.Scanner;
public class declarandoNome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        boolean estudande = true;

        System.out.println("--------------------");
        System.out.println("Informações do aluno");
        System.out.println("--------------------");

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println("--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudade: " + estudande);



        sc.close();
    }
}
