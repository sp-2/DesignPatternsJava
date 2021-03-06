
/*
 * The memento design pattern provides the ability to restore(undo or rollback) an object to its previous state.
 */
import java.util.ArrayList;
import java.util.List;

public class PlayGame {
public static void main(String[] args) {
		
		List<GameMemento> savedGameState = new ArrayList<>();
		
		ChessGame chessGame = new ChessGame();
		chessGame.printBoard();
		
		chessGame.makeMove(6, 4, 4, 4, "wp", "Player1");
		chessGame.printBoard();
		
		savedGameState.add(chessGame.getCurrentState());
		
		chessGame.makeMove(1, 4, 3, 4, "wp", "Player2");
		chessGame.printBoard();
		
		savedGameState.add(chessGame.getCurrentState());
		
		chessGame.makeMove(6, 3, 4, 3, "wp", "Player1");
		chessGame.printBoard();
		
		//undo move
		System.out.print("Undo last move:");
		chessGame.restoreState(savedGameState.remove(savedGameState.size()-1));
		chessGame.printBoard();
		
		System.out.print("Undo move:");
		chessGame.restoreState(savedGameState.remove(savedGameState.size()-1));
		chessGame.printBoard();				
	}
}
/* Output:
 * 
8 br bk bb bQ bK bb bk br 
7 bp bp bp bp bp bp bp bp 
6 -- -- -- -- -- -- -- -- 
5 -- -- -- -- -- -- -- -- 
4 -- -- -- -- -- -- -- -- 
3 -- -- -- -- -- -- -- -- 
2 wp wp wp wp wp wp wp wp 
1 wr wk wb wQ wK wb wk wr 
   A  B  C  D  E  F  G  H 



8 br bk bb bQ bK bb bk br 
7 bp bp bp bp bp bp bp bp 
6 -- -- -- -- -- -- -- -- 
5 -- -- -- -- -- -- -- -- 
4 -- -- -- -- wp -- -- -- 
3 -- -- -- -- -- -- -- -- 
2 wp wp wp wp -- wp wp wp 
1 wr wk wb wQ wK wb wk wr 
   A  B  C  D  E  F  G  H 



8 br bk bb bQ bK bb bk br 
7 bp bp bp bp -- bp bp bp 
6 -- -- -- -- -- -- -- -- 
5 -- -- -- -- wp -- -- -- 
4 -- -- -- -- wp -- -- -- 
3 -- -- -- -- -- -- -- -- 
2 wp wp wp wp -- wp wp wp 
1 wr wk wb wQ wK wb wk wr 
   A  B  C  D  E  F  G  H 



8 br bk bb bQ bK bb bk br 
7 bp bp bp bp -- bp bp bp 
6 -- -- -- -- -- -- -- -- 
5 -- -- -- -- wp -- -- -- 
4 -- -- -- wp wp -- -- -- 
3 -- -- -- -- -- -- -- -- 
2 wp wp wp -- -- wp wp wp 
1 wr wk wb wQ wK wb wk wr 
   A  B  C  D  E  F  G  H 

Undo last move:

8 br bk bb bQ bK bb bk br 
7 bp bp bp bp -- bp bp bp 
6 -- -- -- -- -- -- -- -- 
5 -- -- -- -- wp -- -- -- 
4 -- -- -- -- wp -- -- -- 
3 -- -- -- -- -- -- -- -- 
2 wp wp wp wp -- wp wp wp 
1 wr wk wb wQ wK wb wk wr 
   A  B  C  D  E  F  G  H 

Undo move:

8 br bk bb bQ bK bb bk br 
7 bp bp bp bp bp bp bp bp 
6 -- -- -- -- -- -- -- -- 
5 -- -- -- -- -- -- -- -- 
4 -- -- -- -- wp -- -- -- 
3 -- -- -- -- -- -- -- -- 
2 wp wp wp wp -- wp wp wp 
1 wr wk wb wQ wK wb wk wr 
   A  B  C  D  E  F  G  H 
   
 */