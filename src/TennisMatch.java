
public class TennisMatch {
	
	Player player1;
	Player player2;
	MatchType typeMatch;
	boolean breakInLastSet;
	
	// Constructor
	public TennisMatch(Player player1, Player player2, MatchType typeMatch,
			boolean breakInLastSet) {
		this.player1 = player1;
		this.player2 = player2;
		this.typeMatch = typeMatch;
		this.breakInLastSet = breakInLastSet;
	}
	
	public void updateWithPointWonBy(Player player){
		
	}
	
	public String pointsForPlayer(Player player){
		
		return "";
	}
	
	public int currentSetNumber(Player player){
		
		return 0;
	}
	
	public int gamesInCurrentSetForPlayer(Player player){
		
		return 0;
	}
	
	public int gamesInSetForPlayer(int setNumber, Player player){
		
		return 0;
	}
	
	public boolean isFinished(){
		return false;
	}
	
	
}
