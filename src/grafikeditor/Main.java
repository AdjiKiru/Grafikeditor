package grafikeditor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main{
	
	private static final Display display = new Display();
	private static final FigurSaver figurSaver = new FigurSaver();

	public static void main(String[] args) throws IOException {

		Kreis kreis = new Kreis(300, 300, 30f, 100);
		Rechteck rechteck = new Rechteck(5, 5, 10f, 100, 100);
		Linie linie = new Linie(200, 1, 40f, 200, 300);
		AbgerundetesRechteck abgRechteck = new AbgerundetesRechteck(500, 300, 5f, 100, 100, 40);
		List<Figur> figuren = new ArrayList<Figur>();

		linie.move(300, 0);
		
		Gruppe testGruppe = new Gruppe();
		Gruppe saveTestGruppe = new Gruppe();
		
		testGruppe.hinzufuegenGruppe(linie);
		testGruppe.hinzufuegenGruppe(rechteck);
		testGruppe.hinzufuegenGruppe(kreis);
		testGruppe.hinzufuegenGruppe(abgRechteck);

		Zeichnung zeichnung = new Zeichnung(figuren);
		zeichnung.hinzufuegen(testGruppe);
		display.setZeichnung(zeichnung);


		//FigurSaver & FigurLoader Kompetenz 3.5

		saveTestGruppe.hinzufuegenGruppe(linie);
		saveTestGruppe.hinzufuegenGruppe(rechteck);
		saveTestGruppe.hinzufuegenGruppe(kreis);
		saveTestGruppe.hinzufuegenGruppe(abgRechteck);

		FigurSaver figurSaver = new FigurSaver();
		figurSaver.saveToFile(kreis);
		figurSaver.saveToFile(rechteck);
		figurSaver.saveToFile(linie);
		figurSaver.saveToFile(abgRechteck);

		/*FigurLoader figurLoader = new FigurLoader();
		figurLoader.loadFromFile();*/

	}
}
