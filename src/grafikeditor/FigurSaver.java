package grafikeditor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FigurSaver {

    public void saveToFile(Figur figur) throws IOException {
        File file = new File("./test.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        figur.speicherninDatei(printWriter);


        //if (figur instanceof Rechteck){
        //     Rechteck r = (Rechteck) figur;
        //     printWriter.println("Rechteck: " + r.positionX + " | " + r.positionY + " | " + r.dicke + " | " + r.breite + " | " + r.hoehe);
        //     printWriter.close();
        // }
        // else if (figur instanceof Linie){
        //     Linie l = (Linie) figur;
        //     printWriter.println("Linie: " + l.positionX + " | " + l.positionY + " | " + l.dicke + " | " + l.endpunktX + " | " + l.endpunktY);
        //     printWriter.close();
        // }
        // else if (figur instanceof Kreis){
        //     Kreis k = (Kreis) figur;
        //     printWriter.println("Kreis: " + k.positionX + " | " + k.positionY + " | " + k.dicke + " | " + k.radius);
        //     printWriter.close();
        // }
        // else if (figur instanceof AbgerundetesRechteck){
        //     AbgerundetesRechteck abgr = (AbgerundetesRechteck) figur;
        //     printWriter.println("AbgerundetesRechteck: X-Position:" + abgr.positionX + " | Y-Position:" + abgr.positionY + " | Dicke:" + abgr.dicke + " | Breite:" + abgr.breite + " | Höhe:" + abgr.hoehe + " | Rundung:" + abgr.rundung);
        //     printWriter.close();
        // }
    }
}
