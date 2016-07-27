package it.ads.formazione;

import java.io.*;

public class Util {
	
	
	public static int contaChar(String inputString){
		return inputString.length();
	}
	
	
	public static void scriviFileTXT(String fileName, String testoFile){
		
		try {
			File file = new File(fileName);
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileWriter fileToWrite = new FileWriter(file);
			BufferedWriter bufferToWrite = new BufferedWriter(fileToWrite);
			bufferToWrite.write(testoFile);
			bufferToWrite.close();
			System.out.println("Scrittura avvenuta Correttamente");	
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Scrittura non Avvenuta");
		}
	}
	
	
	
	public static String[] dayOfWeek(){
		String[] settimana = {"Lun","Mar","Mer","Gio","Ven","Sab","Dom"};
		return settimana;
	}
	
	
	
	public static void stampaStringa(String array[]) throws Exception{
		if (array == null)
			throw new Exception("Array vuoto!");
		
		int i = 0;
		for(String elemento:array){
			System.out.println("Elemento "+ ++i + ": " + elemento);
			
		}
	}
	
	
	
}
