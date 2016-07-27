package esercizio_3;

import java.io.IOException;

import it.ads.formazione.*;

public class Main {

	public static void main(String[] args) {
	
		//Util contaCaratteri = new Util();
		
		//int numChar = Util.contaChar("Prova conteggio caratteri");
		//System.out.println(numChar);
		
		
		//Util.scriviFileTXT("CddFILE.TXT", "Prova di scrittura file");
		
		
		String vettore[]=Util.dayOfWeek();
		try {
			Util.stampaStringa(vettore);
		}
		catch(Exception e) {
			System.err.println((e.getMessage()));
		}
	}

}
