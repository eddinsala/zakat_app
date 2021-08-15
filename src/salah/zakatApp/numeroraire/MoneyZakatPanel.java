package salah.zakatApp.numeroraire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import salah.zakatApp.FirstPanel;
import salah.zakatApp.agriculture.ArgrcultureZakatPanel;
import salah.zakatApp.betail.CattleZakatPanel;
import salah.zakatApp.lorArgent.SilverZakatPanel;

public class MoneyZakatPanel {

	public MoneyZakatPanel(JFrame mainFrame, JPanel mainPanel) {

		
		mainPanel.removeAll();
		mainPanel.validate();
		mainPanel.repaint();
		mainPanel.setLayout(new BorderLayout());
		
//////////////////////////////////////////////////////////////////////////////////////////////////
		
		var bgLabel = new JLabel( new ImageIcon("images/BG2.png") );
		bgLabel.setBounds(0,0,900,600);
		
		
		JLabel label = new JLabel(new ImageIcon("images/home.png"));
		label.setBounds(10,10,70,70);
		label.setCursor(Cursor.getPredefinedCursor(12));
		label.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				new FirstPanel(mainFrame, mainPanel);
			}
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setBounds(8,8,70,70);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setBounds(10,10,70,70);
			}
		});
		
		
		
		
/////////////////////////////////

		
		JLabel silveLabel = new JLabel(new ImageIcon("images/silvermetalSmall.png"));
		silveLabel.setBounds(500, 10,70,70 );
		silveLabel.setFocusable(false);
		silveLabel.setCursor(Cursor.getPredefinedCursor(12));
		silveLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
				new SilverZakatPanel(mainFrame, mainPanel);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				silveLabel.setBounds(498, 8,70,70 );
			}

			@Override
			public void mouseExited(MouseEvent e) {
				silveLabel.setBounds(500, 10,70,70 );
			}
		});
		
		JLabel agriculturalLabel = new JLabel(new ImageIcon("images/agricultureSmall.png"));
		agriculturalLabel.setBounds(650, 10,70,70 );
		agriculturalLabel.setFocusable(false);
		agriculturalLabel.setCursor(Cursor.getPredefinedCursor(12));
		agriculturalLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
				new ArgrcultureZakatPanel(mainFrame, mainPanel); 
				
			}
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				agriculturalLabel.setBounds(648, 8,70,70 );
			}

			@Override
			public void mouseExited(MouseEvent e) {
				agriculturalLabel.setBounds(650, 10,70,70);
			}
		});
		
		JLabel cattleLabel = new JLabel(new ImageIcon("images/ramSmall.png"));
		cattleLabel.setBounds(800, 10,70,70 );
		cattleLabel.setFocusable(false);
		cattleLabel.setCursor(Cursor.getPredefinedCursor(12));
		cattleLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
				new CattleZakatPanel(mainFrame, mainPanel);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				cattleLabel.setBounds(798, 8,70,70 );
			}

			@Override
			public void mouseExited(MouseEvent e) {
				cattleLabel.setBounds(800, 10,70,70 );
			}
		});
		
		
/////////////////////////////////
		var upperPanel = new JPanel(null);
		upperPanel.setBounds(-2,-2,901,90);
		upperPanel.setOpaque(false);
		upperPanel.setBorder(BorderFactory.createBevelBorder(0));
		
		upperPanel.add(label);
		upperPanel.add(cattleLabel);
		upperPanel.add(agriculturalLabel);
		upperPanel.add(silveLabel);

			
			
//////////////////////////////////////////////////////////////////
			
			
	// icons: 
		var money = new ImageIcon("images/algeria64.png");		
	
				
				
		
	 // text fields : 
		var DAinputText = new JTextField();
		DAinputText.setText("0.0");
		DAinputText.setBounds(100,105,140,30); 
		DAinputText.setHorizontalAlignment(JTextField.CENTER);
		DAinputText.setFont(new Font("Courier", Font.PLAIN, 17 ));
		DAinputText.setBackground(Color.GRAY);
		DAinputText.setForeground(Color.white);
		DAinputText.setBorder(null);
		DAinputText.setCursor(Cursor.getPredefinedCursor(0));
		DAinputText.setCaretColor(Color.white);
		
		
		var gold1gramText = new JTextField(40);
		gold1gramText.setText("8300.00");
		gold1gramText.setBounds(105,260,140,30);
		gold1gramText.setHorizontalAlignment(JTextField.CENTER);
		gold1gramText.setFont(new Font("Courier", Font.PLAIN, 17 ));
		gold1gramText.setBackground(Color.GRAY);
		gold1gramText.setForeground(Color.white);
		gold1gramText.setBorder(null);
		gold1gramText.setCursor(Cursor.getPredefinedCursor(0)); // default: 2
		gold1gramText.setCaretColor(Color.white);
		
		
			
			
				
				
				
	
				
				
				
				
				
			
		
				
	// labels in :
		JLabel DAinputLabel = new JLabel(money);
		DAinputLabel.setBounds(30,95,60,60);
		

		JLabel gold1GramLabel = new JLabel(new ImageIcon("images/gold.png"));
		gold1GramLabel.setBounds(30,245,60,60);
				
				
				
				
				
				
				
				
				
				
				
				
	
	 // text fields out : 
		var DATextOutput = new JTextField();
		DATextOutput.setEditable(false);
		DATextOutput.setBounds(30,100,140,30);
		DATextOutput.setHorizontalAlignment(JTextField.CENTER);
		DATextOutput.setFont(new Font("Courier", Font.PLAIN, 17 ));
		DATextOutput.setBackground(Color.GRAY);
		DATextOutput.setForeground(Color.white);
		DATextOutput.setBorder(null);
		DATextOutput.setCaretColor(Color.white);
		
		
	

		
		
		
		
	// label text for result : 
		var DALabelOut = new JLabel();
		DALabelOut.setText("الأمــوال :");
		DALabelOut.setBounds(190,100,100,30);
		DALabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
		DALabelOut.setForeground(Color.BLACK);
	

		

		
		String string = "مــــــلاحـظــــــــــة:  سعر 1جرام من الذهب الإفتراضي \n هو 8300 دج من الأفضل أن تلقي نظرة \n على سعره في يوم إخراج الزكاة وتقوم \n بوضع القيمة في المكان المناسب أعلاه";	
		
		var noteArea = new JTextArea();
		noteArea.setBounds(30,350,260,80);
		noteArea.setEditable(false);
		noteArea.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		noteArea.setText(string);
		noteArea.setOpaque(false);
		noteArea.setForeground(Color.BLACK);
				
				
	
	// buttons: 
		
		
		var calculateButton = new JButton("حساب الزكاة");
		calculateButton.setBounds(350,150,150,50);
		calculateButton.setFocusable(false);
		calculateButton.setBackground(new Color(45,45,85));
		calculateButton.setForeground(Color.white);
		calculateButton.setBorder(BorderFactory.createBevelBorder(0));
		calculateButton.setCursor(Cursor.getPredefinedCursor(12));
		calculateButton.setFont(new Font("Calibri", Font.PLAIN, 22));
		//calculateButton.setHorizontalAlignment(JLabel.CENTER);
		calculateButton.addActionListener(e ->{
			
		//	Float DA = Float.parseFloat( DAinputText.getText() );
		//	Float gold1gN = Float.parseFloat( gold1gramText.getText() );
			
			
		//	var calc = new MoneyZakatCalculator(DA, gold1gN );
			
			var calc = new MoneyZakatCalculator(DAinputText, gold1gramText );
			calc.calcule(DATextOutput);
			
			
			
		});
		
		
		var resetButton = new JButton("إعادة ");
		resetButton.setBounds(350,240,150,50);
		resetButton.setFocusable(false);
		resetButton.setCursor(Cursor.getPredefinedCursor(12));
		resetButton.setBackground(new Color(45,45,85));
		
		//resetButton.setOpaque(false);
		resetButton.setForeground(Color.white);
		//resetButton.setHorizontalTextAlignment(JLabel.CENTER); 
		resetButton.setBorder(BorderFactory.createBevelBorder(0));
		resetButton.setFont(new Font("Calibri", Font.PLAIN,25)); // 35
		resetButton.addActionListener( e ->{
			
			DAinputText.setText("0.0");
			gold1gramText.setText("8300.00");
			DATextOutput.setText("");
			
		});
	
					
					
/////////////////////////////////			
					
					
					Font font = new Font("Andalus", Font.PLAIN, 30);
					Color color = Color.white;
					Border border = BorderFactory.createLoweredBevelBorder();
					Border border2 = BorderFactory.createRaisedBevelBorder();
					
					
					
					
					
					var informationLabel = new JLabel();
					informationLabel.setBounds(10,15,280,440);
					informationLabel.setOpaque(false);
					informationLabel.setBorder(BorderFactory.createTitledBorder(border, "ممتلكات المزكي", 2, 0, font, color));
					//  0-> 6
					informationLabel.add(DAinputText);
					informationLabel.add(gold1gramText);
					informationLabel.add(gold1GramLabel);
					informationLabel.add(DAinputLabel);
					informationLabel.add(noteArea);
					
					
					
					
					
					
					
					var affichageLabel = new JLabel();
					affichageLabel.setBounds(550,15,280,440);
					affichageLabel.setOpaque(false);
					affichageLabel.setBorder(BorderFactory.createTitledBorder(border2,"المقدار الواجب إخراجه" , 2, 0, font, color));
					
					affichageLabel.add(DATextOutput);
					affichageLabel.add(DALabelOut);
			
			
			
/////////////////////////////////			
			
			var centerPanel = new JPanel(null);
			centerPanel.setBounds(0,90,900,600);
			centerPanel.setOpaque(false);         // TODO panel.setOpaque(false); IMPORTANT.
			
			centerPanel.add(informationLabel);
			centerPanel.add(affichageLabel);
			
			centerPanel.add(calculateButton);
			centerPanel.add(resetButton);
			
			
/////////////////////////////////  
		
			JPanel panel = new JPanel(null); // it was innerPanel
			panel.add(upperPanel);
			panel.add(centerPanel);
			panel.add(bgLabel);
		
			

//////////////////////////////////////////////////////////////////////////////////////////////////


		mainPanel.add(panel);
		mainFrame.setContentPane(mainPanel);
	
		
		
	
	}

}
