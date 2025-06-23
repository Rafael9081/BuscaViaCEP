import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o CEP que deseja consultar:");
        var cep = scanner.nextLine();

        try{
        Endereco novoEndereco = consultaCep.buscaEndereco("26545-470");
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.gerarArquivo(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
