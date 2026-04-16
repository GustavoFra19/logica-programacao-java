package ForWhile;

public class somaNumerosPares {
    public static void main(String[] args){

      int soma = 0;

        for (int i = 0; i <100 ; i++) {
            if(i % 2 == 0){
                soma += i;
            }
        }
        System.out.println("O resultado da soma dos números pares ate 100: "+soma);
    }
}
