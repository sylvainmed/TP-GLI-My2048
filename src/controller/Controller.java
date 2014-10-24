package controller;

import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import model.Board;
import model.BoardImpl;
import model.TileImpl;
import view.View2048;

public class Controller {
	
	private static BoardImpl board;
	private static View2048 view;
	
	public BoardImpl getBoard() {
		return board;
	}

	public void setBoard(BoardImpl board) {
		this.board = board;
	}

	public View2048 getView() {
		return view;
	}

	public void setView(View2048 view) {
		this.view = view;
	}

	public void move(KeyEvent e){
		switch (e.getCode()){
		case LEFT: 
			board.packIntoDirection(Board.Direction.LEFT);
			break;
		case RIGHT:
			board.packIntoDirection(Board.Direction.RIGHT);
			break;
		case UP:
			board.packIntoDirection(Board.Direction.BOTTOM);
			break;
		case DOWN:
			board.packIntoDirection(Board.Direction.TOP);
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		
		view = new View2048();
		GridPane g = view.getGp();
		
		BoardImpl board = new BoardImpl(4);
		board.initTile();
		board.initTile();
		board.commit();
		}
	}
	


