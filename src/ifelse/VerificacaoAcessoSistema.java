package ifelse;
import java.util.Scanner;
public class VerificacaoAcessoSistema {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int continuar;
       do {
           int codigoCorreto = 1234;
           int nivelPermissaoMininimo = 1;
           int nivelPermissaoMaxima = 3;

           System.out.println("Digite o codigo para entrar: ");
           int codigoDigitado = sc.nextInt();
           System.out.println("Digite o nivel de permissão: ");
           int nivelDigitado = sc.nextInt();

           boolean codigoValido = codigoDigitado == codigoCorreto;
           boolean nivelValido = nivelDigitado >= nivelPermissaoMininimo && nivelDigitado <= nivelPermissaoMaxima;

           if (codigoValido && nivelValido) {
               System.out.println("Acesso permitido ! Bem vindo.");
           } else {
               System.out.println("Acesso negado ! motivos: ");
           }
           if (!codigoValido) {
               System.out.println("- codigo invalido.");
           }
           if (!nivelValido) {
               System.out.println("- Nivel invalido.");
           }
           System.out.println("Deseja tentar novamente? 1 - Sim / 2 - Não ");
           continuar = sc.nextInt();
       }while(continuar == 1);
    sc.close();
    }
}
