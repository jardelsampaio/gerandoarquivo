import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class GerandoArquivo {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\Gerando_TXT_Java\\teste.txt");

        if(Files.notExists(path)) {
            Files.createFile(path);

        }

        String texto = "Oi, JP. Tudo bem?";

        Files.writeString(path, texto);

        //Files.delete(path);
    }

}
