package salah.zakatApp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import salah.zakatApp.numeroraire.MoneyZakatPanel;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Test version");
		frame.setSize(900,600); //setBounds(100, 80, 900, 600);
								//setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(new ImageIcon("images/zakat.png").getImage());
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		frame.setContentPane(mainPanel);
		frame.setVisible(true);
		
		// CALL THE FIRST PANEL : 
		new FirstPanel(frame, mainPanel);
	

	}

}
