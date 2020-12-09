package grafikeditor;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.PrintWriter;

public class Linie extends Figur {
	protected int endpunktX;
	protected int endpunktY;
	
	public Linie(int positionX, int positionY, float dicke, int endpunktX, int endpunktY) {
		super(positionX, positionY, dicke);
		this.endpunktX = endpunktX;
		this.endpunktY = endpunktY;
	}
	@Override
	public void zeichne(Graphics g) {
		Graphics2D graphics2d = (Graphics2D)g;
		graphics2d.setStroke(new BasicStroke(dicke));
		g.drawLine(positionX, positionY, endpunktX, endpunktY);
	}

	@Override
	public void move(int deltaX, int deltaY){
		positionX += deltaX;
		positionY += deltaY;
		endpunktX += deltaX;
		endpunktY += deltaY;
	}

	@Override
	public void speicherninDatei(PrintWriter printWriter) {
		printWriter.println("Linie: " + positionX + " | " + positionY + " | " + dicke + " | " + endpunktX + " | " + endpunktY);
		printWriter.close();
	}
}
