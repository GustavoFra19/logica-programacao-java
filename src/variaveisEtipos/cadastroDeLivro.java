package variaveisEtipos;

import java.util.Scanner;
public class cadastroDeLivro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int continuar;
       do {
           String titulo;
           String autor;
           int numeroPag;
           double preco;
           char categoria;

           System.out.println("--------------------------------");
           System.out.println("Sistema de cadastro de Livros");
           System.out.println("--------------------------------");

           System.out.println("Categoria Disponiveis: \n F- Ficção \n N- Não-Ficção \n T- Technologia \n H- História ");
           System.out.println("--------------------------------");

           System.out.println("Qual a categoria do livro: ");
           categoria = sc.next().toUpperCase().charAt(0);
           sc.nextLine();
           System.out.println("Qual nome do livro: ");
           titulo = sc.nextLine();
           System.out.println("Qual nome do autor: ");
           autor = sc.nextLine();
           System.out.println("Qual o número de paginas: ");
           numeroPag = sc.nextInt();
           System.out.println("Qual o preço do livro: ");
           preco = sc.nextDouble();


           String categoriaDescricao;

           if (categoria == 'F') {
               categoriaDescricao = "Ficção";
           } else if (categoria == 'N') {
               categoriaDescricao = "Não-Ficção";
           } else if (categoria == 'T') {
               categoriaDescricao = "Technologia";
           } else if (categoria == 'H') {
               categoriaDescricao = "História";
           } else {
               categoriaDescricao = "Categoria invalida !";
           }

           System.out.println("---------------------------");
           System.out.println("   Resumo do Cadastro");
           System.out.println("---------------------------");
           System.out.println("Livro cadastrado: " + titulo);
           System.out.println("Autor: " + autor);
           System.out.println("Número de paginas: " + numeroPag);
           System.out.println("Preço: " + preco);
           System.out.println("Categoria: " + categoriaDescricao);

           System.out.println("Deseja cadastrar outro livro?: 1 - Sim / 2 - Não");
           continuar = sc.nextInt();
       }while (continuar == 1);
    sc.close();
    }
}

