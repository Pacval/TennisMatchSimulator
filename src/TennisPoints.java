
public enum TennisPoints {
	ZERO("0"),
	QUINZE("15"),
	TRENTE("30"),
	QUARANTE("40"),
	AVANTAGE("A");
	
	private final String affichage;
	
	private TennisPoints(String affichage){
		this.affichage = affichage;
	}

	public String getAffichage() {
		return affichage;
	}
}
