
public class RoemischeZahlen {
	
	public static void main(String[] args) {
		System.out.println("Gib eine Zahl kleiner 3999 ein.");
		int a = Integer.parseInt(args[0]);
			if(a > 3999) {	//Fehlermeldung
				System.out.println("Die Zahl ist zu groß! Probier es nochmal.");
				System.exit(-1);
			}
			if(a == 0) {
				System.out.println("Es gibt keine Null bei den römischen Zahlen.");
			}
		
		System.out.println("Deine Zahl war: " + a);
		//Array in der groesse der Eingabe
		int[] dezStellen = new int[4];
		
		int modulo = 10;
		int tmp = 0;
		int i = 3;
		//Zahlen aufteilen und in Array einf�gen
		while(a != 0) {
			tmp = a % modulo;
			a = a - tmp;
			a = a / 10;
			dezStellen[i] = tmp; //der groeßte Wert wird an die erste Stelle gespeichert
			i--; 
		} 
				
		System.out.println(umwandeln(dezStellen));  //Rueckgabe der Methode wird direkt auf der Konsole ausgegeben.
	}
	
	
	
	public static String umwandeln(int[] dezStellen) {
		String ausgabe = "";
	
		if(dezStellen[0] != 0) { //Tausend
			int i = dezStellen[0];
			String tausend = "";
			while(i != 0) {
				tausend = tausend + "M";
				i--;
			}
			ausgabe = tausend;
		}
		
		if(dezStellen[1] != 0) {//Hundert
			int tmp = dezStellen[1];
			int i = tmp % 5;
			String hundert ="";
			if(tmp == 4 || tmp == 9) {
				hundert = hundert + "C";
				if(tmp == 4){
					hundert = hundert + "D";
				}else {
					hundert = hundert + "M";
				}
			}
			if(tmp == 5 || tmp > 5) {
				hundert = hundert + "D";
			}
			if(tmp < 4 || tmp > 5 && tmp < 9) {
				while(i != 0) {
					hundert = hundert + "C";
					i--;
				}
			}
			
			
			ausgabe = ausgabe + hundert;
		}
		
		if(dezStellen[2] != 0) {//Zehn
			int tmp = dezStellen[2];
			int i = tmp % 5;
			String zehn ="";
			if(tmp == 4 || tmp == 9) {
				zehn = zehn + "X";
				if(tmp == 4){
					zehn = zehn + "L";
				}else {
					zehn = zehn + "C";
				}
			}
			if(tmp == 5 || tmp > 5) {
				zehn = zehn + "L";
			}
			if(tmp < 4 || tmp > 5 && tmp < 9) {
				while(i != 0) {
					zehn = zehn + "X";
					i--;
				}
			}
			ausgabe = ausgabe + zehn;
		}
		
		if(dezStellen[3] != 0) {//Eins
			int tmp = dezStellen[3];
			int i = tmp % 5;
			String eins ="";
			if(tmp == 4 || tmp == 9) {
				eins = eins + "I";
				if(tmp == 4){
					eins = eins + "V";
				}else {
					eins = eins + "X";
				}
			}
			if(tmp == 5 || tmp > 5) {
				eins = eins + "V";
			}
			if(tmp < 4 || tmp > 5 && tmp < 9) {
				while(i != 0) {
					eins = eins + "I";
					i--;
				}
			}
			ausgabe = ausgabe + eins;
		}
		
			return ausgabe;
	}
}
