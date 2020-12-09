package grafikeditor;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.PrintWriter;

public class AbgerundetesRechteck extends Rechteck {
	protected int rundung;
	
	public AbgerundetesRechteck(int positionX, int positionY, float dicke, int breite, int hoehe, int rundung) {
		super(positionX, positionY, dicke, breite, hoehe);
		this.rundung = rundung;
	}
	
	@Override
	public void zeichne(Graphics g) {
		Graphics2D graphics2d = (Graphics2D)g;
		graphics2d.setStroke(new BasicStroke(dicke));
		g.drawRoundRect(positionX, positionY, breite, hoehe, rundung, rundung);
	}

	@Override
	public void speicherninDatei(PrintWriter printWriter) {
		printWriter.println("AbgerundetesRechteck: " + positionX + " | " + positionY + " | " + dicke + " | " + breite + " | " + hoehe + " | " + rundung);
		printWriter.close();
	}


}
