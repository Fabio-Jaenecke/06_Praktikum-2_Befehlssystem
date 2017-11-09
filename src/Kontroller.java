/**
 * Diese Klasse verarbeitet Befehle vom Typ
 * {@link Befehl Befehl} und lösst die dazu 
 * passenden Aktionen aus.
 * 
 * @author daniellerch
 *
 */
public class Kontroller {
	/**
	 * Verarbeite einen gegebenen Befehl
	 * 
	 * @param befehl
	 *            Der zu verarbeitende Befehl.
	 * @return 'false', wenn ein Abbruchbefehl verarbeitet wurde
	 */
	public boolean verarbeiteBefehl(Befehl befehl) {
		boolean macheWeiter = true;
		String befehlswort = befehl.gibBefehlswort();
		if (Befehlswort.gibBefehlsworteAlsText().contains(befehlswort) && befehlswort != "unbekannt") {
			System.out.println("Der Befehl " + befehl.gibBefehlswort() + " " + befehl.gibZweitesWort() + " wird ausgeführt.");
		} else {
			System.out.println("Ich weiss nicht, was Sie meinen...");
		}
		return macheWeiter;
	}
}
