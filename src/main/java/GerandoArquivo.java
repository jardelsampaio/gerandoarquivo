import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class GerandoArquivo {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\Gerando_TXT_Java\\teste.txt");

        if(Files.notExists(path)) {
            Files.createFile(path);

        }

        String texto = "Oi, JP. Tudo bem?";
        String texto1 = "\nTeste Geosales";


        Files.writeString(path, texto);
        Files.writeString(path, texto1, StandardOpenOption.APPEND);


        List<String> strings = Files.readAllLines(path);

        for(String teste: strings) {
            System.out.println(teste);
        }//Files.delete(path);
    }

}
