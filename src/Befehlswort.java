import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter. Mit
 * ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author daniellerch
 * @version 1.0
 */
public enum Befehlswort {
	UNBEKANNT("unbekannt"), 
	GEHE("gehe"), 
	HILFE("hilfe"), 
	BEENDEN("beenden");

	// Das Befehlswort als Zeichenkette.
	private String befehl = "";

	/**
	 * Konstruktor für Befehlswort, welcher das Datenfeld befehl setzt
	 * 
	 * @param befehl der Befehl als Zeichenkette
	 */
	Befehlswort(String befehl) {
		this.befehl = befehl;
	}

	/**
	 * gibt das zugehörige Befehlswort Enum zurück
	 * 
	 * @param wort
	 * @return das zum Befehlswort gehörenden Enum Objekt. Für unbekannte Werte
	 *         von wort wird das Enum Objekt UNBEKANNT zurückgegeben werden.
	 */

	public static Befehlswort gibBefehlswort(String wort) {
		Befehlswort befehlswort = UNBEKANNT;
		for (Befehlswort b : Befehlswort.values()) {
			if (b.getBefehl().equals(wort)) {
				befehlswort = b;
			}
		}
		return befehlswort;

	}

	/**
	 * Gibt die gültigen Befehlsworte durch Leerzeichen getrennt als String
	 * zurück.
	 * 
	 */
	public static String gibBefehlsworteAlsText() {
		String befehlsworteAlsText = "";
		for (Befehlswort b : Befehlswort.values()) {
			befehlsworteAlsText = befehlsworteAlsText + " " +  b.getBefehl();
		}
		return befehlsworteAlsText;
	}

	/**
	 * getter für befehl
	 * 
	 * @return befehl der Befehl als Zeichenkette
	 */
	public String getBefehl() {
		return befehl;
	}

}
