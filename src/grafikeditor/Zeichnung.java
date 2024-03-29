package grafikeditor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung extends JFrame {
    private List<Figur> figuren = new ArrayList<Figur>();

    public Zeichnung(List<Figur> figuren) {
        this.figuren = figuren;
    }

    public Zeichnung() {}



    /**
     * Zeichnet alle Figuren.
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    public void zeichneFiguren(Graphics g) {
        for (Figur f : figuren) {
            f.zeichne(g);
        }
    }
    /**
     * F�gt eine weitere Figur hinzu und l�st die Auffrischung des Fensterinhaltes aus.
     * @param figur Referenz auf das weitere Figur-Objekt.
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
        repaint();
    }

    /**
     * L�scht alle Figuren und l�st die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
        repaint();
    }
}
