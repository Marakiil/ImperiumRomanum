
public class RoemischeZahlen {
	static char romZahl[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	

	public static void main(String[] args) {
		System.out.println("Gib eine Zahl kleiner 3999 ein: ");
		int a = Integer.parseInt(args[0]);
		
		//Array in der groesse der Eingabe
		int[] dezStellen = new int[4];
		
		int modulo = 10;
		int tmp = 0;
		int i = 0; //Laufvariable
		//Zahlen aufteilen und in Array einf�gen
		while(a != 0) {
			tmp = a % modulo;
			a = a - tmp;
			dezStellen[i] = tmp; //der kleinste Wert wird an die erste Stelle gespeichert
			i++; //die Laufvar wird hochgez�hlt, sodass der n�chste Wert an die n�chste Stelle kommt
			modulo = modulo*10;
		} 
		
		
		//Probeausgaben
		System.out.println("Modulo " + modulo);
		System.out.println("tmp " + tmp);
		for(int k = 0; k < 4; k++) {
			System.out.println(dezStellen[k]);
		}
		
		
	}
	
	public int restklassen(int a, int b) {
		
		return a;
	}

}
