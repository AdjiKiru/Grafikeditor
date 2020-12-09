package grafikeditor;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.PrintWriter;

public class Rechteck extends Figur{
	protected int breite;
	protected int hoehe;

	public Rechteck(int positionX, int positionY, float dicke, int breite, int hoehe) {
		super(positionX, positionY, dicke);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public void zeichne(Graphics g) {
		Graphics2D graphics2d = (Graphics2D)g;
		graphics2d.setStroke(new BasicStroke(dicke));
		g.drawRect(positionX, positionY, breite, hoehe);
	}

	@Override
	public void speicherninDatei(PrintWriter printWriter) {
		printWriter.println("Rechteck: " + positionX + " | " + positionY + " | " + dicke + " | " + breite + " | " + hoehe);
		printWriter.close();
	}
}
