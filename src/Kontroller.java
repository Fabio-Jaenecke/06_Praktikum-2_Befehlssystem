/**
 * Diese Klasse verarbeitet Befehle vom Typ
 * {@link Befehl Befehl} und lösst die dazu 
 * passenden Aktionen aus.
 * 
 * @author daniellerch, fabiojaenecke
 * @version 1.1
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
		String secondword = befehl.gibZweitesWort();
		if (Befehlswort.gibBefehlsworteAlsText().contains(befehlswort)) {
			if (Befehlswort.gibBefehlswort(befehlswort).equals(Befehlswort.BEENDEN)) {
				macheWeiter = false;
			}
			String print2ndWord = " ";
			if (befehl.hatZweitesWort()) {
				if (Befehlswort.gibBefehlsworteAlsText().contains(secondword)) {
					print2ndWord = " " + befehl.gibZweitesWort() + " ";
				} else {
						System.out.println("Ich weiss nicht, was Sie nach '" + befehlswort + "' meinen...");
					
				}
			}
			System.out.println("Der Befehl " + befehl.gibBefehlswort() + print2ndWord + "wird ausgeführt.");
		} else {
			System.out.println("Ich weiss nicht, was Sie meinen...");
		}
		return macheWeiter;
	}
}
