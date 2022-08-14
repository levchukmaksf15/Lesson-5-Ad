package ua.itea.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("123");
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		URL urlImageIcon = getClass().getClassLoader().getResource("images/pudge.png");
		URL urlTxtFile = getClass().getClassLoader().getResource("text/1.txt");

		// URL urlImageIcon2 =
		// getClass().getClassLoader().getResource("images/zeus.png");

		System.out.println(urlTxtFile.toExternalForm());
		
		JPanel panel = new JPanel();
		JLabel label_1 = new JLabel(GetFileContent(urlTxtFile.toString()));
		JLabel label_2 = new JLabel(GetFileContent("lib/2.txt"));

		JLabel label_image_1 = new JLabel(new ImageIcon(urlImageIcon));
		JLabel label_image_2 = new JLabel(new ImageIcon("lib/zeus.png"));

		panel.add(label_image_1);
		panel.add(label_1);
		panel.add(label_image_2);
		panel.add(label_2);

		add(panel);
		pack();

	}

	public static void main(String[] args) {
		new MainFrame();
	}

	private String GetFileContent(String file) {
		if (file == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		BufferedReader reader = null;
		try {
			String row = null;
			reader = new BufferedReader(new FileReader(file));
			while ((row = reader.readLine()) != null) {
				sb.append(row);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return sb.toString();
	}

}
