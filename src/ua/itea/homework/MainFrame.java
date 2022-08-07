package ua.itea.homework;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("123");
		setVisible(true);
		setSize(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JLabel label_1 = new JLabel();
		JLabel label_2 = new JLabel();
		
		JLabel label_image_1 = new JLabel();
		JLabel label_image_2 = new JLabel();
	}

}
