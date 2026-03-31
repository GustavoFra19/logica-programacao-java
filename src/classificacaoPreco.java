import java.util.Scanner;
public class classificacaoPreco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     int continuar;
     do {
         double preco;
         String categoria;

         System.out.println("--------------------------------");
         System.out.println("Sistema de classificação de preços ");
         System.out.println("--------------------------------");

         System.out.println("Digite o preço do seu produto: ");
         preco = sc.nextDouble();

         if (preco <= 50) {
             categoria = "Econômico";
         } else if (preco <= 200) {
             categoria = "Intermidiário";
         } else {
             categoria = "Premium";
         }
         System.out.println("--------------------------------");
         System.out.println("Resumo do produto");
         System.out.println("--------------------------------");

         System.out.println("Seu produto custa : " + preco);
         System.out.println("Seu produto pertence a categoria: " + categoria);

        System.out.println("Deseja classificar outro produto ? 1 - Sim / 2 - Não");
        continuar = sc.nextInt();
     }while(continuar == 1);
      sc.close();
    }
}
