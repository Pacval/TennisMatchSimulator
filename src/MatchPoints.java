
public class MatchPoints {
	
	public int[] setsP1, setsP2;
	int gamesP1, gamesP2;
	TennisPoints pointsP1, pointsP2;
	
	public MatchPoints(MatchType matchType){
		if (matchType == MatchType.BEST_OF_THREE){
			setsP1 = new int[3];
			setsP2 = new int[3];
		} else if (matchType == MatchType.BEST_OF_FIVE){
			setsP1 = new int[5];
			setsP2 = new int[5];
		}
		gamesP1 = gamesP2 = 0;
		pointsP1 = pointsP2 = TennisPoints.ZERO;
	}
	
	
}
