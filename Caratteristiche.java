package febbraio;
import java.util.Scanner;
public class Caratteristiche {
	
	private String Descrizione;
	private int Punteggio;
	
	public Caratteristiche () {
		
	}
	
	public Caratteristiche (String descrizione, int punteggio) {
	
		Descrizione = descrizione;
		Punteggio = 0;
	}

	public void setPunteggio (int punteggio) {
		if (Valido(punteggio)) {
			
			Punteggio = punteggio;
		}
		else {
			
			setPunteggio();
		}
	}
	
	public void setPunteggio() {
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("punteggio non valido, reiserisci: ");
		int punteggio = x.nextInt();
		if (Valido(punteggio)) {
			
			Punteggio = punteggio;
		}
		else {
			
			setPunteggio();
		}
	}
	
	public String getDescrizione() {
		return Descrizione;
	}

	public int getPunteggio() {
		return Punteggio;
	}

	private boolean Valido (int punteggio) {
		
		boolean valido = false;
		if (punteggio >= 0 && punteggio <= 10) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	
}
