import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;
import java.awt.event.ActionEvent;

public class MenuPanel extends JFrame {

	private JPanel contentPane;
	static long timeElapsed=0;
	static long timeElapsed2=0;
	JTextField txt;
	JPanel panel2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPanel frame = new MenuPanel();
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
	public MenuPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("5 LI THREAD");
		btnNewButton.setBackground(new Color(238, 130, 238));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				try {
					Thread5();
					DrawSudoku drawSudoku = new DrawSudoku();
				drawSudoku.txt.setText(" COZUM SURESI : "+String.valueOf(timeElapsed));
				drawSudoku.setVisible(true);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			}
		});
		btnNewButton.setBounds(10, 11, 125, 239);
		contentPane.add(btnNewButton);
		
		JButton btnLuThread = new JButton("10 LU THREAD");
		btnLuThread.setBackground(new Color(221, 160, 221));
		btnLuThread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Thread10();
					DrawSudoku drawSudoku = new DrawSudoku();
					drawSudoku.setVisible(true);
					drawSudoku.txt.setText(" COZUM SURESI : "+String.valueOf(timeElapsed2));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnLuThread.setBounds(299, 11, 125, 239);
		contentPane.add(btnLuThread);
		
		JButton btnGrafk = new JButton("GRAFIK");
		btnGrafk.setBackground(new Color(95, 158, 160));
		btnGrafk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DrawGraphic grafikCiz=new DrawGraphic();
				grafikCiz.setVisible(true);
			}
		});
		btnGrafk.setBounds(145, 11, 144, 239);
		contentPane.add(btnGrafk);
	}
	
	public void Thread5() throws InterruptedException {
		
		Map2 map = new Map2();
		map.dosyaOku();
		Thread t1= new SudokuSolver(map.getMap1());
		Thread t2= new SudokuSolver(map.getMap2());
		Thread t3= new SudokuSolver(map.getMap5());
		Thread t4= new SudokuSolver(map.getMap3());
		Thread t5= new SudokuSolver(map.getMap4());
		t1.start();
		Instant start = Instant.now();
		t1.join();
		System.out.println("\n\n\n_______________");
		t2.start();
		t2.join();
		System.out.println("\n\n\n_______________");
		t3.start();
		t3.join();
		System.out.println("\n\n\n_______________");
		t4.start();
		t4.join();
		System.out.println("\n\n\n_______________");
		t5.start();
		t5.join();
		System.out.println("\n\n\n_______________");
		Instant finish = Instant.now();
		 timeElapsed = Duration.between(start, finish).toMillis();
		 System.out.println(timeElapsed);
		
	}
	
	public void Thread10() throws InterruptedException {
	
		Map2 map = new Map2();
map.dosyaOku();
Thread t6= new SudokuSolver(map.getMap1(),1);
Thread t7= new SudokuSolver(map.getMap1(),2);
Thread t8= new SudokuSolver(map.getMap2(),1);
Thread t9= new SudokuSolver(map.getMap2(),2);
Thread t10= new SudokuSolver(map.getMap5(),1);
Thread t11= new SudokuSolver(map.getMap5(),2);
Thread t12= new SudokuSolver(map.getMap3(),1);
Thread t13= new SudokuSolver(map.getMap3(),2);
Thread t14= new SudokuSolver(map.getMap4(),1);
Thread t15= new SudokuSolver(map.getMap4(),2);

Instant start2 = Instant.now();
t6.start();

t7.start();

t8.start();

t9.start();

t10.start();

t11.start();

t12.start();

t13.start();

t14.start();

t15.start();



t6.join();
t7.join();
t8.join();
t9.join();
t10.join();
t11.join();
t12.join();
t13.join();
t14.join();
t15.join();
Instant finish2 = Instant.now();
timeElapsed2 = Duration.between(start2, finish2).toMillis();
System.out.println("\n 2.TIMER"+timeElapsed2);
	}
}
