package grafikeditor;

import java.awt.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Gruppe extends Figur {
	List<Figur> figuren;
	
	public Gruppe() {
		super(0, 0, 1f);
		this.figuren = new ArrayList<>();
	}

	@Override
	public void zeichne(Graphics g) {
		for (Figur f : figuren) {
	    	f.zeichne(g);
	    }
	}

	@Override
	public void speicherninDatei(PrintWriter printWriter) {
		for (Figur figur : figuren){
			figur.speicherninDatei(printWriter);
		}
	}

	public void hinzufuegenGruppe(Figur figur) {
	    figuren.add(figur);
	}
	
	public void loeschenGruppe(Figur figur) {
	    figuren.remove(figur);
	}
}
