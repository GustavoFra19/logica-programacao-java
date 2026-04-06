package variaveisEtipos;

public class correcaoDeErro {
    public static void main(String[] args) {
        int idade = 17;
        String mensagem;

        if (idade >= 18) {
             mensagem = "Você é maior de variaveisEtipos.idade.";
        } else {
             mensagem = "Você é menor de variaveisEtipos.idade.";
        }

        System.out.println(mensagem);
    }
}