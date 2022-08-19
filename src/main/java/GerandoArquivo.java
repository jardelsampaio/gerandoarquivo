import java.util.Scanner;

public class GerandoArquivo {

    public static void main(String[] args) {
        System.out.println("Cadastro de Pessoa");
        Scanner insira = new Scanner(System.in);
        System.out.println("Digite o nome da Pessoa: ");
        String nome = insira.next();

        Pessoa geo = new Pessoa(nome);
        System.out.println(geo.getNome());

    }

}
