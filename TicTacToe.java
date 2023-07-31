import java.util.Scanner;

public class TicTacToe {
	public static void main (String [] args) {
		
		char[][] board = new char[3][3];
		
		for (int row=0 ; row < board.length ; row++) {
			for(int col=0 ; col < board[row].length ; col++) {
				board[row][col] = ' ';
			}
		}
		
		char player = 'X';
		boolean gameover = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************TIC-TAC-TOE GAME********************************");
		System.out.println();
		System.out.println("****************************Welcome************************************");
		System.out.println();
		System.out.println("<<<<<<<<<<<____________Let's start the Game________________>>>>>>>>>>>>");
		System.out.println();
		System.out.println();
		
		
		while (!gameover) {
			
			printBoard(board);
			System.out.println();
			System.out.println("<" +player + ">" +" player enter your co-ordinates");
			int row=sc.nextInt();
			int col= sc.nextInt();
			
			
			
			
			if(board[row][col] == ' ') {
				board[row][col] = player;
				
				gameover = hasWon(board,player);
				
				if(gameover) {
					System.out.println("Player : <" +player + ">" +" has Won the game");
				}
				else {
					
					if(player == 'X')
					{
						player = 'O';
					}
					else
					{
						player = 'X';
					}
					
				}
				
				
				
			}
			else 
			{
				System.out.println("****************<<<<<<INVALID MOVE>>>>>>>>>>***************");
				
			}
			
			
			
			
		}
		
	}



	public static boolean hasWon(char[][] board, char player) {
		
		
		//check rows
		for (int row=0 ; row < board.length ; row++) {
			
			if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
				return true;
			}
		}
		
		
		//check columns
		for (int col=0 ; col < board.length ; col++) {
			
			if(board[0] [col]== player && board[1][col] == player && board[2][col]== player) {
				return true;
			}
		}
		
		
		// diagonal check

		if(board[0] [0]== player && board[1][1] == player && board[2][2]== player) {
			return true;
		}
		if(board[0] [2]== player && board[1][1] == player && board[2][0]== player) {
			return true;
		}
		
		return false;
	}



	public static void printBoard(char[][] board) {
		
		for (int row=0 ; row < board.length ; row++) {
			for(int col=0 ; col < board[row].length ; col++) {
			
				
				System.out.print(board[row][col] + " | ");
			}
			
			System.out.println();
			System.out.println("--+---+---+");
		}
		
	}

}
