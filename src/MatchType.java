public enum MatchType {
	BEST_OF_THREE(2),
	BEST_OF_FIVE(3);
	
	private final int numberOfSetsToWin;

	private MatchType(int numberOfSetsToWin) {
		this.numberOfSetsToWin = numberOfSetsToWin;
	}

	public int numberOfSetsToWin() {
		return numberOfSetsToWin;
	}

	public int maxNumberOfSets() {
		return numberOfSetsToWin * 2 - 1;
	}
}
