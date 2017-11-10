package b;
//hello this is GH
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class lanacho
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nLab26b 90/100 Point Version\n");
		Knight knight = new Knight();
		knight.yunckMunkiee();
		knight.hityuh();
		knight.displayBoard();
	}
}

class Knight
{
	private int board[][];			// stores the sequence of knight moves
	private int startRow;			// row location where the knight starts
	private int startCol;			// col location where the knight starts
	private int rowPos;				// current row position of the knight
	private int colPos;				// current col position of the knight
	private int moves;				// number of location visited by the knight
	final private int ACCESS[][] = 	   {{0,0,0,0,0,0,0,0,0,0,0,0},
										{0,0,0,0,0,0,0,0,0,0,0,0},
     					 				{0,0,2,3,4,4,4,4,3,2,0,0},
     					 				{0,0,3,4,6,6,6,6,4,3,0,0},
     					 				{0,0,4,6,8,8,8,8,6,4,0,0},
     					 				{0,0,4,6,8,8,8,8,6,4,0,0},
     					 				{0,0,4,6,8,8,8,8,6,4,0,0},
     					 				{0,0,4,6,8,8,8,8,6,4,0,0},
     					 				{0,0,3,4,6,6,6,6,4,3,0,0},
     					 				{0,0,2,3,4,4,4,4,3,2,0,0},
     					 				{0,0,0,0,0,0,0,0,0,0,0,0},
     					 				{0,0,0,0,0,0,0,0,0,0,0,0}}; 	
	
	public Knight()
	// constructor used to initializes the data attributes
	{  
		board = new int[12][12];
	}  					
      
	public void yunckMunkiee() throws IOException
	// input method to get starting row and col from keyboard entry
	{    
		Scanner input = new Scanner(System.in);
		System.out.println("Enter row start ===>>");
		String s = input.nextLine();
		startRow = Integer.parseInt(s);
		System.out.println("Enter col start ===>>");
		String s1 = input.nextLine();
		startCol = Integer.parseInt(s1);		
	}
   
	public void displayBoard()
	// displays the chessboard after the tour is concluded
	{
		for(int r=2; r<board.length-2; r++)
		{
			for(int c=2; c<board[r].length-2; c++)
			{
				System.out.print(board[r][c]+" ");
			}
			System.out.println();
		}			
	}  
	
	private boolean getMove()
	// computes the next available knight's move.  Alters RowPos and ColPos and
	// returns true if move is possible, otherwise returns false
	{
		for(int r=2; r<board.length-2; r++)
		{
			for(int c=2; c<board[r].length-2; c++)
			{
				if(board[r][c]>r)
					return true;
			}
		}
		return false;
	}

	public void hityuh()
	// primary method that drives the knight's tour solution
	{
		getMove();
		 
	}
			
}
