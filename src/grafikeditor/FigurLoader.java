package grafikeditor;
import java.io.*;
import java.util.StringTokenizer;

public class FigurLoader {

    public void loadFromFile() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("./test.txt"));
        String Fileline = in.readLine();// <-- read whole line
        while(Fileline != null){
            System.out.println(Fileline);
            //read next line
            Fileline = in.readLine();
        }
    }
}
