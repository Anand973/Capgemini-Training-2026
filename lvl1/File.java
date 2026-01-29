import java.io.*;

public class File {
    public static void readFile(String path) throws IOException {
        try (BufferedReader br =
             new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

            String line;
            while ((line = br.readLine()) != null) {
                
            }
        }
    }
}
