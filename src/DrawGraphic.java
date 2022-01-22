import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class DrawGraphic extends JFrame {

	private JPanel contentPane;

	SudokuSolver solver=new SudokuSolver();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawGraphic frame = new DrawGraphic();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DrawGraphic() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
	
	
	}
	
	public void paint(Graphics g) {
		MenuPanel menuPanel = new MenuPanel();
		SudokuSolver solver = new SudokuSolver();
				
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponents(g2d);
		  g2d.drawLine(100, 50, 100, 250);
		  g2d.drawLine(100, 250,300, 250);
		  g2d.setColor(Color.green);
		g2d.drawString("millisecond", 305, 250);
		g2d.drawString("SolvedBox", 100, 45);
		g2d.setColor(Color.blue);
		 g2d.drawLine(430, 80,450, 80);
		 g2d.drawString("T5",455,80);
		
		 g2d.setColor(Color.magenta);
		 g2d.drawLine(430, 95,450, 95);
		 g2d.drawString("T10",455,95);
		 g2d.setColor(Color.green);
		 for(int i=0;i<=200;i+=50)
	        { 
	        	g2d.drawOval(100+i,250,3,3);
	        	g2d.drawString(String.valueOf((i/50)*1000), 90+i, 265);
	        	g2d.drawOval(100,50+i,3,3);
	        	g2d.drawString(String.valueOf((i/50)*200), 105, 255-i);
	   	    } 

		 for(int i=0;i<200;i+=50) {
				g2d.setColor(Color.blue);
			  QuadCurve2D q = new QuadCurve2D.Float();
		q.setCurve(100,250, 600,i/menuPanel.timeElapsed , 400,i/solver.solvedNumber1/50);
		g2d.draw(q);
		g2d.setColor(Color.MAGENTA);
		q.setCurve(100,250, 300,i/menuPanel.timeElapsed2 , 400,i/solver.solvedNumber2/50);
		g2d.draw(q);
		 }
		
		
		 
		
		
		
		
	}
	

}
