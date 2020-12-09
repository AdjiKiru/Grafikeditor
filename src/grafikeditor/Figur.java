package grafikeditor;
import java.awt.Graphics;
import java.io.PrintWriter;

public abstract class Figur {
	protected int positionX;
	protected int positionY;
	protected float dicke;
	
	public Figur(int positionX, int positionY, float dicke){
		this.positionX = positionX;
		this.positionY = positionY;
		this.dicke = dicke;
	}
	
	public abstract void zeichne(Graphics g);

	public void move(int deltaX, int deltaY){
		positionX += deltaX;
		positionY += deltaY;
	}

	public abstract void speicherninDatei(PrintWriter printWriter);
}
