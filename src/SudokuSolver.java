import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.ThreadInfo;

import javax.xml.crypto.Data;





public class SudokuSolver extends Thread{

	private int matris[][];
	int sayac=0,sayac2=0;
	int x;
	FileWriter fWriter;
	PrintWriter pWriter;
	  BufferedWriter bufferedWriter;
	 static int solvedNumber1=0;
	 static int solvedNumber2=0;

	
Map2 map2;
	public SudokuSolver(int[][] matris) {
		super();
		this.matris = matris;
	}

	public SudokuSolver(int[][] matris,int x) {
		super();
		this.matris = matris;
		this.x=x;
	}




	public SudokuSolver() {
		super();
	}


	
	
	public void run() {		
	
		Map2 map = new Map2();
		map.dosyaOku();
	
if (x==1 ) {
solveSudoku(matris);
}
if (x==2 ) {
solveSudoku2(matris);
}


	if(solve(matris)&& solve2(matris)) {
printAnswer();
}	}






	public int MapbyIndex(int [][]map,int i,int j) {
	return map[i][j];
	}

	public int getSayac() {
		return sayac;
	}






	public void setSayac(int sayac) {
		this.sayac = sayac;
	}






	public  void solveSudoku(int [][] board) {
		if(matris == null || matris.length==0) {
			return;
		}
	      solve(board);
	}
	public  void solveSudoku2(int [][] board) {
		if(matris == null || matris.length==0) {
			return;
		}
	      solve2(board);
	}
	
	public int getSolvedNumber() {
		return solvedNumber1;
	}

	public void setSolvedNumber(int solvedNumber) {
		this.solvedNumber2 = solvedNumber;
	}

	private boolean solve(int[][] board) {
		
		
		map2= new Map2();
		map2.dosyaOku();
		for(int i=0 ; i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j] == 0) {
					for(int c = 1; c<=9;c++) {
						if(isValid(board,i,j,c)) {
							board[i][j]=c;
							if(solve(board)) {
							writeFile(i, j, c);
							solvedNumber1++;
								
								return true;
							}
							else {
								board[i][j]=0;
							}					
								
							
						}
					}
					return false;
				}
			}
			
		}
		return true;
}
	
	private boolean solve2(int[][] board) {
		
		map2= new Map2();
		map2.dosyaOku();
		for(int i=8 ; i>=0;i--) {
			for(int j=8;j>=0;j--) {
				if(board[i][j] == 0) {
					for(int c = 1; c<=9;c++) {
						if(isValid(board,i,j,c)) {
							board[i][j]=c;
							if(solve(board)) {
							
								solvedNumber2++;
								return true;
							}
							else {
								board[i][j]=0;
							}					
								
							
						}
					}
					return false;
				}
			}
			
		}
		return true;
}








	private boolean isValid(int [][] board,int row,int col,int c) {
		for(int i=0;i<9;i++) {
			if(board[i][col]!=0 && board[i][col] == c) {
				return false;
			}
			if(board[row][i] != 0 && board[row][i]==c) {
				return false;
			}
			if(board[3*(row/3)+i/3][3*(col/3)+i%3]!=0 && board[3*(row/3)+i/3][3*(col/3)+i%3]==c) {
				return false;
			}
		}
		return true;
	}
	


	  void printAnswer()  {
	



		for(int i = 0; i < 9; i++) {
		
			//	Thread.sleep(1000);
				System.out.println("");
				for (int j = 0; j < 9; j++) {
					//Thread.sleep(1000);
					System.out.print(matris[i][j] + " ");
				}
				
			
	}
	
		
	}
	  public void writeFile(int i,int j,int c) {
			try {
				
				 fWriter = new FileWriter("C:\\Users\\mehmet\\Desktop\\data.txt", true);
		          bufferedWriter = new BufferedWriter(fWriter);
		            bufferedWriter.write(" sudokunun "+(i+1)+" . satiri ve " +(j+1)+" . sutununa "+ c +" yazdi");
		            bufferedWriter.newLine();
		           
			bufferedWriter.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return;
	  }


	
	
	
}
