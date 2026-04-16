package ForWhile;
import java.util.Scanner;
public class encontrandoMaiorNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = {1,2,3,4,5};
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número da lista é " +maior);




    }
}
