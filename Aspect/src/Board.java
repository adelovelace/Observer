import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;



public class Board {

	public static JFrame frame = new JFrame("Tarea de Aspectos");
	public static JButton colorBlueBg = new JButton("Change to Blue background");
	public static JButton colorRedBg = new JButton("Change to Red background");
	public static JButton colorGrayBg = new JButton("Change to Gray background");
	public static JButton cleanWhiteBg = new JButton("Clean Background");

	public static void main(String[] args) {

		initWindow();
		initButtons();
		addAction();
		cleanBackground();
	}

	public static void initWindow() {

		frame.setBackground(Color.white);
		frame.setSize(400, 600);
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public static void initButtons() {

		colorBlueBg.setBounds(75, 50, 250, 50);
		colorBlueBg.setVisible(true);

		colorRedBg.setBounds(75, 150, 250, 50);
		colorRedBg.setVisible(true);

		colorGrayBg.setBounds(75, 250, 250, 50);
		colorGrayBg.setVisible(true);
		
		cleanWhiteBg.setBounds(75, 450, 250, 50);
		cleanWhiteBg.setVisible(true);

	}
	
	public static void addAction() {

		colorBlueBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeColor(Color.blue);
			}
			
			
		});
		frame.add(colorBlueBg);

		colorRedBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeColor(Color.red);
			}
		});
	
		frame.add(colorRedBg);

		colorGrayBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeColor(Color.gray);
			}
		});
		frame.add(colorGrayBg);

	}
	
	public static void cleanBackground() {
		cleanWhiteBg.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				changeColor(Color.white);
			}
		});
		frame.add(cleanWhiteBg);		
	}	
	
	public static void changeColor (Color color) {
		frame.getContentPane().setBackground(color);
	} 

}
