package esercizio;

import java.util.Scanner;

/*
X - O - O    8 (UP) A (LEFT) 6 (RIGHT) 2 (DOWN)
O - O - O
O - O - O

Give direction: 6

O - O - O    8 (UP) A (LEFT) 6 (RIGHT) 2 (DOWN)
O - O - O
X - O - O
*/

public class FxTris {
	
	// starting coordinates
	private int[] start = new int[] {0, 0};
	
	// default settings
	private static String sonc = "X";
	private static String soffc = "O";
	private static int rowsc = 3;
	private static int colsc = 3;
	
	private int rows = rowsc;
	private int cols = colsc;
	
	private String[][] matrix;
	private String onc = sonc;
	private String offc = soffc;
	private String sep = " - ";
	
	private int currX;
	private int currY;

	/*
	 *  main execution
	 */
	public static void main(String[] args) {
		
		FxTris fx1 = new FxTris(4, 4);
		
		fx1.setOnc(" ** ");
		fx1.setOffc(" [] ");
		fx1.setSep(" - ");
		
		fx1.getMove();
		
	}
	
	/*
	 * uses the custom settings
	 */
	FxTris(String _onc, String _offc, int _rows, int _cols) {
		rows = _rows;
		cols = _cols;
		
		matrix = new String[rows][cols];
		currX = start[0];
		currY = start[1];
		
		setOnc(_onc);
		setOffc(_offc);
	}
	
	FxTris(int _rows, int _cols) {
		this(sonc, soffc, _rows, _cols);
	}
	
	/*
	 * uses the default settings
	 */
	FxTris() {
		this(sonc, soffc, rowsc, colsc);
	}
	
	/*
	 * prints the matrix
	 */
	public void printMatrix() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print( matrix[i][j] + ( (j < matrix[i].length-1) ? sep : "" ) );
			}
			nl();
		}
		nl();
	} 
	
	/*
	 * sets the matrix to the new coordinates
	 */
	public void makeMatrix() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if( i == currY && j == currX ) matrix[i][j] = onc;
				else matrix[i][j] = offc;
			}
		}
	} 
	
	/*
	 * moves the cursor to the right
	 */
	public void moveRight() {
		currX = ( currX < cols-1 ) ? currX+1 : 0;
		makeMatrix();
	}
	
	/*
	 * moves the cursor to the left
	 */
	public void moveLeft() {
		currX = ( currX > 0 ) ? currX-1 : cols-1;
		makeMatrix();
	}
	
	/*
	 * moves the cursor to the down
	 */
	public void moveDown() {
		currY = ( currY < rows-1 ) ? currY+1 : 0;
		makeMatrix();
	}
	
	/*
	 * moves the cursor to the up
	 */
	public void moveUp() {
		currY = ( currY > 0 ) ? currY-1 : rows-1;
		makeMatrix();
	}
	
	/*
	 * asks for a new move till wrong direction
	 */
	public void getMove() {
		makeMatrix();
		printMatrix();
		
		Scanner in = new Scanner(System.in);
		boolean goOn = true;
		int dir = 0;
		
		while( goOn ) {
			System.out.println(
				"Give me the direction [8 (UP) A (LEFT) 6 (RIGHT) 2 (DOWN) other (EXIT)]"
			);
			
			try {
				dir = Integer.parseInt(in.nextLine());
			} catch(Exception exc) {
				System.out.println("Wrong direction. Insert corret direction.");
			}
			
			if(dir == 0) continue;
			
			switch( dir ) {
				case 8:
					moveUp();
					break;
				case 4:
					moveLeft();
					break;
				case 2:
					moveDown();
					break;
				case 6:
					moveRight();
					break;
				default:
					goOn = false;
					return;
			}
			
			printMatrix();
		}
		
		
		in.close();
	}
	
	/*
	 * Setters utilities
	 */
	public void setOnc(String _onc) { onc = _onc; }
	public void setOffc(String _offc) { offc = _offc; }
	public void setSep(String _sep) { sep = _sep; }
	
	public void nl() { System.out.println(""); }

}