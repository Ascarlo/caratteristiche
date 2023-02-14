package febbraio;
import java.util.Scanner;
public class test_Caratteristiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		Caratteristiche persona1 = new Caratteristiche();
		Caratteristiche persona2 = new Caratteristiche();
		String rifai;
		
		do {
			System.out.print("inserisci il punteggio della persona 1: ");
			persona1.setPunteggio(x.nextInt());
			persona2.setPunteggio(7);
			
			
			
			if (persona1.getPunteggio() == persona2.getPunteggio() || persona1.getPunteggio()-1 == persona2.getPunteggio()+1 
				|| persona1.getPunteggio()+1 == persona2.getPunteggio()-1) {
				
				System.out.println("le due persona sono compatibili");
			}
			else {
				
				System.out.println("le due persona non sono compatibili");
			}
			
			System.out.print("vuoi rifare? ");
			rifai = y.nextLine();
		}while(rifai.equals("si"));
	}

}
