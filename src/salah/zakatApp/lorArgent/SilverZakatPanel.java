package salah.zakatApp.lorArgent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import salah.zakatApp.FirstPanel;
import salah.zakatApp.agriculture.ArgrcultureZakatPanel;
import salah.zakatApp.betail.CattleZakatPanel;
import salah.zakatApp.numeroraire.MoneyZakatPanel;

public class SilverZakatPanel {

	public SilverZakatPanel(JFrame mainFrame, JPanel mainPanel) {

		
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

		
		JLabel moneyLabel = new JLabel(new ImageIcon("images/moneySmall.png"));
		moneyLabel.setBounds(500, 10,70,70 );
		moneyLabel.setFocusable(false);
		moneyLabel.setCursor(Cursor.getPredefinedCursor(12));
		moneyLabel.addMouseListener( new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				new MoneyZakatPanel(mainFrame, mainPanel);
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				moneyLabel.setBounds(498, 8,70,70 );
			}

			@Override
			public void mouseExited(MouseEvent e) {
				moneyLabel.setBounds(500, 10,70,70 );
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
		upperPanel.add(moneyLabel);

			
			
//////////////////////////////////////////////////////////////////
			
			
	// icons:  
		var gold = new ImageIcon("images/gold.png");
		var silver = new ImageIcon("images/silver2.png");

				
	
				
				
		
	 // text fields : 
		var goldText = new JTextField();
		goldText.setText("0.0");
		goldText.setHorizontalAlignment(JTextField.CENTER);
		goldText.setToolTipText("كم تملك من الذهب بالجرام?");
		goldText.setBounds(120,100,100,30); 
		goldText.setFont(new Font("Courier", Font.PLAIN, 18 ));
		goldText.setBackground(Color.GRAY);
		goldText.setForeground(Color.white);
		goldText.setBorder(null);
		goldText.setCursor(Cursor.getPredefinedCursor(0));
		goldText.setCaretColor(Color.white);
		
		
		var silverText = new JTextField(40);
		silverText.setText("0.0");
		silverText.setHorizontalAlignment(JTextField.CENTER);
		silverText.setToolTipText("كم تملك من الفضة بالجرام?");
		silverText.setBounds(120,260,100,30);
		silverText.setFont(new Font("Courier", Font.PLAIN, 18 ));
		silverText.setBackground(Color.GRAY);
		silverText.setForeground(Color.white);
		silverText.setBorder(null);
		silverText.setCursor(Cursor.getPredefinedCursor(0)); // default: 2
		silverText.setCaretColor(Color.white);
		
		
			
			
				
				
				
				
	// radio buttons : 
		
		var button18 = new JRadioButton("18 carats");
		button18.setFocusable(false);
		button18.setFont(new Font("Courier", Font.PLAIN, 12));
		button18.setForeground(Color.BLACK);
		button18.setBackground(null);
		button18.setOpaque(false);
		button18.setBounds(130,150,100,30); //120
		
		
		var button21 = new JRadioButton("21 carats");
		button21.setFocusable(false);
		button21.setFont(new Font("Courier", Font.PLAIN, 12));
		button21.setForeground(Color.BLACK);
		button21.setBackground(null);
		button21.setOpaque(false);
		button21.setBounds(130,170,100,30);
		
		var button24 = new JRadioButton("24 carats");
		button24.setSelected(true);
		button24.setFocusable(false);
		button24.setFont(new Font("Courier", Font.PLAIN, 12));
		button24.setForeground(Color.BLACK);
		button24.setBackground(null);
		button24.setOpaque(false);
		button24.setBounds(130,190,100,30);
		
		
		
		var groupB = new ButtonGroup();
		groupB.add(button18);
		groupB.add(button21);
		groupB.add(button24);
		
				
				
				
				
				
				
				
				
		
				
	// labels in :
		JLabel goldLabel = new JLabel(gold);
		goldLabel.setBounds(50,85,60,60);
		

		JLabel silverLabel = new JLabel(silver);
		silverLabel.setBounds(50,245,60,60);
				
				
				
				
				
				
				
				
				
				
				
				
	
	 // text fields out : 
		var goldTextOut = new JTextField();
		goldTextOut.setEditable(false);
		goldTextOut.setBounds(50,100,100,30);
		goldTextOut.setHorizontalAlignment(JTextField.CENTER);
		goldTextOut.setFont(new Font("Courier", Font.PLAIN, 17 ));
		goldTextOut.setBackground(Color.GRAY);
		goldTextOut.setForeground(Color.white);
		goldTextOut.setBorder(null);
		goldTextOut.setCaretColor(Color.white);
		
		
		var silverOut = new JTextField(40);
		silverOut.setEditable(false);
		silverOut.setHorizontalAlignment(JTextField.CENTER);
		silverOut.setBounds(50,260,100,30);
		silverOut.setFont(new Font("Courier", Font.PLAIN, 17 ));
		silverOut.setBackground(Color.GRAY);
		silverOut.setForeground(Color.white);
		silverOut.setBorder(null);
		silverOut.setCaretColor(Color.white);
	

		
		
		
		
	// label text for result : 
		var goldLabelOut = new JLabel();
		goldLabelOut.setText("الذهب :");
		goldLabelOut.setBounds(170,100,100,30);
		goldLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
		goldLabelOut.setForeground(Color.BLACK);
		
		var silverLabelOut = new JLabel();
		silverLabelOut.setText("الفضة :");
		silverLabelOut.setBounds(170,260,100,30);
		silverLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
		silverLabelOut.setForeground(Color.BLACK);		
				
				
			
		
		
				
		String string = "مــــــلاحـظــــــــــة:   إذا أردت إخراج الزكاة على شكل أموال \n قم بضرب كمية الذهب الواجب إخراجه \n في ثمن الجرام الواحد من الذهب يوم \n إخراج الزكاة,  نفس الشيء بالنسبة للفضة";
			
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
			
		///	Float goldN = Float.parseFloat( goldText.getText() );
		//	Float silverN = Float.parseFloat( c.getText() );
			
			
		//	var calc = new SilverZakatCalculator(goldN, silverN );
			
			var calc = new SilverZakatCalculator(goldText, silverText );
			
			calc.calculeSilver(silverOut);
			
			if( button24.isSelected() )
				calc.calculeGold(goldTextOut, 24);
			else if( button21.isSelected() )
				calc.calculeGold(goldTextOut, 21);
			else if( button18.isSelected() )
				calc.calculeGold(goldTextOut, 18);
			
			
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
			
			goldText.setText("0.0");
			silverText.setText("0.0");
			goldTextOut.setText("");
			silverOut.setText("");
			
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
					informationLabel.add(goldText);
					informationLabel.add(silverText);
					informationLabel.add(silverLabel);
					informationLabel.add(goldLabel);
					informationLabel.add(button18);
					informationLabel.add(button21);
					informationLabel.add(button24);
					
					
					
					
					
					
					
					
					var affichageLabel = new JLabel();
					affichageLabel.setBounds(550,15,280,440);
					affichageLabel.setOpaque(false);
					affichageLabel.setBorder(BorderFactory.createTitledBorder(border2,"المقدار الواجب إخراجه" , 2, 0, font, color));
					
					affichageLabel.add(goldTextOut);
					affichageLabel.add(silverOut);
					affichageLabel.add(goldLabelOut);
					affichageLabel.add(silverLabelOut);
			
					affichageLabel.add(noteArea);
			
			
/////////////////////////////////			
			
			var centerPanel = new JPanel(null);
			centerPanel.setBounds(0,90,900,600);
			centerPanel.setOpaque(false);         // TODO panel.setOpaque(false); IMPORTANT.
			
			centerPanel.add(informationLabel);
			centerPanel.add(affichageLabel);
			
			centerPanel.add(calculateButton);
			centerPanel.add(resetButton);
			
			
/////////////////////////////////  
		
			JPanel panel = new JPanel(null); 
			panel.add(upperPanel);
			panel.add(centerPanel);
			panel.add(bgLabel);
		
			

//////////////////////////////////////////////////////////////////////////////////////////////////


		mainPanel.add(panel);
		mainFrame.setContentPane(mainPanel);
	
	}

}
