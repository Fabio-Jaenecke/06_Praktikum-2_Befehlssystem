public class Anwendung {
	Parser parser = new Parser();
	Kontroller kontroller = new Kontroller();
	//Befehlswort befehlswort = new Befehlswort();
	
	public static void main(String[] args) {
		
		Anwendung anwendung = new Anwendung();
		anwendung.start();
	}
	
	public void start() {		        
        boolean beendet = false;
        while (!beendet) {
            Befehl befehl = parser.liefereBefehl();
            beendet = !kontroller.verarbeiteBefehl(befehl);
        }
        System.out.println("Danke für dieses Spiel. Auf Wiedersehen.");
	}
}
