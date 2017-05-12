
public class MatchPoints {
	
	public int[] setsP1, setsP2;
	int gamesP1, gamesP2;
	TennisPoints pointsP1, pointsP2;
	// On doit stocker une référence des joueurs car sinon on ne sait pas à qui ajouter les points
	Player p1, p2;
	
	public MatchPoints(MatchType matchType, Player player1, Player player2){
		p1 = player1;
		p2 = player2;
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
	
	
	public void addPointTo(Player player){
		if (player == p1){
			// On regarde l'avancée dans le jeu
			switch (pointsP1) {
			case AVANTAGE:
				gameWonBy(p1);
				break;
			case QUARANTE:
				// On gère le cas du 40 points un peu spécial
				switch (pointsP2) {
				case AVANTAGE:
					pointsP2 = TennisPoints.QUARANTE;
					break;
				case QUARANTE:
					pointsP1 = TennisPoints.AVANTAGE;
					break;
				default:
					gameWonBy(p1);
					break;
				}
				break;
			case TRENTE:
				pointsP1 = TennisPoints.QUARANTE;
				break;
			case QUINZE:
				pointsP1 = TennisPoints.TRENTE;
				break;
			case ZERO:
				pointsP1 = TennisPoints.QUINZE;
				break;
			default:
				break;
			}	
		} else if (player == p2){
			switch (pointsP2) {
			case AVANTAGE:
				gameWonBy(p2);
				break;
			case QUARANTE:
				switch (pointsP1) {
				case AVANTAGE:
					pointsP1 = TennisPoints.QUARANTE;
					break;
				case QUARANTE:
					pointsP2 = TennisPoints.AVANTAGE;
					break;
				default:
					gameWonBy(p2);
					break;
				}
				break;
			case TRENTE:
				pointsP2 = TennisPoints.QUARANTE;
				break;
			case QUINZE:
				pointsP2 = TennisPoints.TRENTE;
				break;
			case ZERO:
				pointsP2 = TennisPoints.QUINZE;
				break;
			default:
				break;
			}	
		}
	}
	
	public void gameWonBy(Player player){
		if(player == p1){
			
		} else if (player == p2){
			
		}
	}
}
