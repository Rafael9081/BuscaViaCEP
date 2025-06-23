import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void  gerarArquivo(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(endereco.cep() + " .json");
        try {
            fileWriter.write(gson.toJson(endereco));
            fileWriter.close();
            System.out.println("Arquivo gerado com sucesso: " + endereco.cep() + ".json");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar o arquivo: " + endereco.cep() + ".json", e);
        }
    }
}
