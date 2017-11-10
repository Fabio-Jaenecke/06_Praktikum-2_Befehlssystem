public class Anwendung {
	Parser parser = new Parser();
	Kontroller kontroller = new Kontroller();
	//Befehlswort befehlswort = new Befehlswort();
	
	public static void main(String[] args) {
		
		Anwendung anwendung = new Anwendung();
		anwendung.start();
	}
	
	public void start() {
		willkommen();
        boolean beendet = false;
        while (!beendet) {
            Befehl befehl = parser.liefereBefehl();
            beendet = !kontroller.verarbeiteBefehl(befehl);
        }
        System.out.println("Danke für dieses Spiel. Auf Wiedersehen.");
	}
	private void willkommen() {
		System.out.println("Willkommmen zum Befehlssystem. Bitte geben Sie eines der folgenden Befehle ein:");
		for (Befehlswort b : Befehlswort.values()) {
			if (b != Befehlswort.UNBEKANNT) {
			System.out.print(b + " ");
			}
		}
		System.out.println();
	}
}
