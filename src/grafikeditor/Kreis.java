package grafikeditor;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.PrintWriter;

public class Kreis extends Figur {
	protected int radius;
	
	public Kreis(int positionX, int positionY, float dicke,  int radius) {
		super(positionX, positionY, dicke);
		this.radius = radius;
	}

	@Override
	public void zeichne(Graphics g) {
		Graphics2D graphics2d = (Graphics2D)g;
		graphics2d.setStroke(new BasicStroke(dicke));
		g.drawOval(positionX, positionY, radius, radius);
	}

	@Override
	public void speicherninDatei(PrintWriter printWriter) {
		printWriter.println("Kreis: " + positionX + " | " + positionY + " | " + dicke + " | " + radius);
		printWriter.close();
	}
}
