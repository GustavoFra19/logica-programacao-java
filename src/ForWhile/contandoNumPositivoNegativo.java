package ForWhile;
import java.util.Scanner;
public class contandoNumPositivoNegativo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String entrada;
        int positivo = 0, negativo =0;

        while (true){
            System.out.println("Digite um número positivo ou negativo (ou 'fim' para encerrar)");
            entrada = sc.nextLine();

            if(entrada.equalsIgnoreCase("Fim")){
                
                break;
            }
            int num = Integer.parseInt(entrada);

            if(num > 0){
                positivo++;
            }else if (num < 0){
                negativo++;
            }
        }
        System.out.println("Números positivos: "+positivo);
        System.out.println("Números negativos: "+negativo);

        sc.close();
    }
}
