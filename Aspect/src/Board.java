import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;



public class Board {

	public static JFrame frame = new JFrame("Tare de Aspectos");
	public static JButton colorBlueBg = new JButton("Change to Blue background");
	public static JButton colorRedBg = new JButton("Change to Red background");
	public static JButton colorGrayBg = new JButton("Change to Gray background");

	public static void main(String[] args) {

		initWindow();
		initButtons();
		changeColorBackground();

	}

	public static void initWindow() {

		frame.setBackground(Color.gray);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);

	}
	
	public static void initButtons() {

		colorBlueBg.setBounds(50, 50, 250, 50);
		colorBlueBg.setVisible(true);

		colorRedBg.setBounds(50, 150, 250, 50);
		colorRedBg.setVisible(true);

		colorGrayBg.setBounds(50, 250, 250, 50);
		colorGrayBg.setVisible(true);

	}
	
	public static void changeColorBackground() {

		colorBlueBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.blue);
			}
			
			
		});
		frame.add(colorBlueBg);

		colorRedBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.red);
			}
		});
	
		frame.add(colorRedBg);

		colorGrayBg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.gray);
			}
		});
		frame.add(colorGrayBg);

	}
	
	

}
