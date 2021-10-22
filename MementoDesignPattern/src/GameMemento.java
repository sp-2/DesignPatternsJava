public class GameMemento {
	private GameState gameState;
	
	public GameMemento(GameState gameState) {
		this.gameState = gameState;
	}
	
	public GameState getSavedState() {
		return this.gameState;
	}
}