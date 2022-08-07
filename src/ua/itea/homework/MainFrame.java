package ua.itea.homework;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("123");
		setVisible(true);
		setSize(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		URL urlImageIcon = getClass().getClassLoader().getResource("images/pudge.png");
		URL urlTxtFile = getClass().getClassLoader().getResource("text/1.txt");

		JPanel panel = new JPanel();
		JLabel label_1 = new JLabel();
		JLabel label_2 = new JLabel();

		JLabel label_image_1 = new JLabel(new ImageIcon(urlImageIcon));
		JLabel label_image_2 = new JLabel(urlTxtFile.toString());
	}

	public static void main(String[] args) {
		new MainFrame();
	}

}
