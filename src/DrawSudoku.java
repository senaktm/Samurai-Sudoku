import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.Text;



import javax.swing.JTextField;

public class DrawSudoku extends JFrame {
	int olcek =30;
	int ekran_en=890;
	int ekran_boy=890;
	JTextField txt;
	private SudokuSolver solver;


	public DrawSudoku() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1400,1400);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		this.setVisible(true);
	 
		 txt = new JTextField();
		 txt.setBounds(900,200 , 200, 200);
		txt.setBorder(BorderFactory.createLineBorder(Color.black));
		  this.add(txt);
		 
	
	
		
	}

	@Override

		public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
        
        //sudoku1  sudoku2  sudoku5 sudoku3 sudoku4
        for(int i=0;i<9;i++) {	
			for(int j=0;j<9;j++) {
        	
				  g2d.drawRect(40+j*30,40+i*30,30,30);
				  g2d.drawRect(40+((j+12)*30),40+i*30,30,30);
				  g2d.drawRect(40+((j+6)*30),40+((i+6)*30),30,30);  
 				  g2d.drawRect(40+j*30,40+((i+12)*30),30,30);
 				 g2d.drawRect(40+((j+12)*30),40+((i+12)*30),30,30);}}
 		Map2 map2=new Map2();		
 		map2.dosyaOku();
 	
 	
 		
	  
 	    for(int i=0;i<9;i++) {	
 				for(int j=0;j<9;j++) {
						 solver=new SudokuSolver(map2.getMap1());
 	solver=new SudokuSolver(map2.getMap2());
 	 solver=new SudokuSolver(map2.getMap5());
 		 solver=new SudokuSolver(map2.getMap3());
 		solver=new SudokuSolver(map2.getMap4());
 		solver.solveSudoku(map2.getMap1());
 		solver.solveSudoku(map2.getMap2());
 		solver.solveSudoku(map2.getMap5());
 		solver.solveSudoku(map2.getMap3());
 		solver.solveSudoku(map2.getMap4());
	
 		 g2d.drawString(String.valueOf(solver.MapbyIndex(map2.getMap1(), i, j)),50+j*30 ,60+i*30 );
	     g2d.drawString(String.valueOf(solver.MapbyIndex(map2.getMap2(), i, j)),50+((j+12)*30) ,60+i*30 );	   
	     g2d.drawString(String.valueOf(solver.MapbyIndex(map2.getMap5(), i, j)), 50+((j+6)*30), 60+((i+6)*30));
	     g2d.drawString(String.valueOf(solver.MapbyIndex(map2.getMap3(), i, j)),50+j*30,60+((i+12)*30));
	     g2d.drawString(String.valueOf(solver.MapbyIndex(map2.getMap4(), i, j)),50+((j+12)*30),60+((i+12)*30));
	     
			}}}}  
 		
 	
    
        
      
        	
				 		  
	 
   	    	
						
	
        
