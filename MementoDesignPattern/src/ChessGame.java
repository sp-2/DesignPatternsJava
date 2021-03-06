import java.util.Arrays;

public class ChessGame {
	GameState gameState;
	
	public ChessGame() {
		this.gameState        = new GameState();
		this.gameState.board  = initGame();
		this.gameState.player = "Player1";
	}

	private String [][] initGame() {
		String [][] board  ={ {"br","bk","bb","bQ","bK","bb","bk","br"},
				  			  {"bp","bp","bp","bp","bp","bp","bp","bp"},
				  			  {"--","--","--","--","--","--","--","--"},
				  			  {"--","--","--","--","--","--","--","--"},
				  			  {"--","--","--","--","--","--","--","--"},
				  			  {"--","--","--","--","--","--","--","--"},
				  			  {"wp","wp","wp","wp","wp","wp","wp","wp"},
				  			  {"wr","wk","wb","wQ","wK","wb","wk","wr"}};
		return board;
	}
	
	public void makeMove(int fromRow, int fromCol, int toRow, int toCol, String piece, String player) {
		//check if move is valid
		//if valid
			setBoard(fromRow, fromCol, toRow, toCol, piece);
			setPlayer(player);
			//checkIfWin();
		//else indicate invalid move
	}
	
	private void setBoard(int fromRow, int fromCol, int toRow, int toCol, String piece) {
		this.gameState.board[fromRow][fromCol]  = "--";
		this.gameState.board[toRow][toCol]      = piece;
	}
	
	private void setPlayer(String player) {
		this.gameState.player = player;
	}
	
	public GameMemento getCurrentState() {
		GameState currentGameState = new GameState();
		currentGameState.board     = cloneBoard(this.gameState.board);
		currentGameState.player    = this.gameState.player;
		return new GameMemento(currentGameState);
	}
	
	public void restoreState(GameMemento savedMemento) {
		GameState savedGameState = savedMemento.getSavedState();
		this.gameState.board     = savedGameState.board;
		this.gameState.player    = savedGameState.player;
	}
	
	public void printBoard() {
		System.out.println("\n");
		for(int i = 0; i < 8; i++) {
			System.out.print(8-i + " ");
			for(int j = 0; j < 8; j++) {		
				System.out.print(this.gameState.board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("  ");
		for(int j = 65; j < 73; j++) {	
			System.out.print(" ");
			System.out.print((char)j);
			System.out.print(" ");
		}
		System.out.println("\n");
	}	

	public static String[][] cloneBoard(String[][] array){
		String[][] result = new String[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = Arrays.copyOf(array[i], array[i].length);
		}
		return result;
	}
}