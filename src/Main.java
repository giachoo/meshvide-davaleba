import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        URI uri = Main.class.getResource("data.txt").toURI();
        List<String> striqonebi = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());
        for (int i = 0; i <striqonebi.size() ; i++) {
            if (i%2==0){
                System.out.println(striqonebi.get(i));
            }
        }
    }

}
