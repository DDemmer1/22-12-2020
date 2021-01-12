package de.demmer.dennis;

public class Chess {
	
	private int[][] board;
	
	int gameTime;
	
	
	public Chess(int x, int y) {
		board = initBoard(x,y);
		gameTime = 50;
	}
	
	
	
	private int[][] initBoard(int x, int y){
		
		int[][] board = new int[x][y];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
				if(i % 2 == 0 && j % 2 == 0) {
					board[i][j] = 1;
				}
				
				if(i % 2 != 0 && j % 2 != 0) {
					board[i][j] = 1;
				}
	
			}
			
			
		}
		return board;
	}
	
	
	
	
	
	
	public void printBoard(boolean debug) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
				if(debug) {
					System.out.print( "(" + i + "|" + j +")\t");
				}
			}
			System.out.println();
		}
	}
	
	
	

}
