package salah.zakatApp.agriculture;

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
import javax.swing.JTextField;
import javax.swing.border.Border;

import salah.zakatApp.FirstPanel;
import salah.zakatApp.betail.CattleZakatPanel;
import salah.zakatApp.lorArgent.SilverZakatPanel;
import salah.zakatApp.numeroraire.MoneyZakatPanel;

public class ArgrcultureZakatPanel {

	public ArgrcultureZakatPanel(JFrame mainFrame, JPanel mainPanel) {

		mainPanel.removeAll();
		mainPanel.validate();
		mainPanel.repaint();
		mainPanel.setLayout(null);
		
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
		
		
		JLabel silverLabel = new JLabel(new ImageIcon("images/silvermetalSmall.png"));
		silverLabel.setBounds(650, 10,70,70 );
		silverLabel.setFocusable(false);
		silverLabel.setCursor(Cursor.getPredefinedCursor(12));
		silverLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
				new SilverZakatPanel(mainFrame, mainPanel);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				silverLabel.setBounds(648, 8,70,70 );
			}

			@Override
			public void mouseExited(MouseEvent e) {
				silverLabel.setBounds(650, 10,70,70 );
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
		//upperPanel.setBackground(Color.orange);
		
		upperPanel.add(label);
		upperPanel.add(cattleLabel);
		upperPanel.add(silverLabel);
		upperPanel.add(moneyLabel);

			
			
//////////////////////////////////////////////////////////////////
			
			
	// icons:  
		var grain = new ImageIcon("images/grain.png");
		var vegetable = new ImageIcon("images/vegetable.png");

				
	
				
				
		
	 // text fields : 
		var grainText = new JTextField();
		grainText.setText("0.0");
		grainText.setToolTipText("كم تملك من كيلوغرام قمح؟");
		grainText.setBounds(120,100,100,30); 
		grainText.setFont(new Font("Courier", Font.PLAIN, 18 ));
		grainText.setBackground(Color.GRAY);
		grainText.setForeground(Color.white);
		grainText.setHorizontalAlignment(JTextField.CENTER);
		grainText.setBorder(null);
		grainText.setCursor(Cursor.getPredefinedCursor(0));
		grainText.setCaretColor(Color.white);
		
		
		var vegetableText = new JTextField();
		vegetableText.setText("0.0");
		vegetableText.setToolTipText("كم تملك كيلوغرام من المنتوجات الأخرى؟");
		vegetableText.setHorizontalAlignment(JTextField.CENTER);
		vegetableText.setBounds(120,260,100,30);
		vegetableText.setFont(new Font("Courier", Font.PLAIN, 18 ));
		vegetableText.setBackground(Color.GRAY);
		vegetableText.setForeground(Color.white);
		vegetableText.setBorder(null);
		vegetableText.setCursor(Cursor.getPredefinedCursor(0)); // default: 2
		vegetableText.setCaretColor(Color.white);
		
		// TODO I don't know all of the cursors!
			
			
				
				
				
				
	// radio buttons : 
		
		var artificialB = new JRadioButton("ري إصطناعي");
		artificialB.setFocusable(false);
		artificialB.setFont(new Font("Courier", Font.PLAIN, 14));
		artificialB.setForeground(Color.BLACK);
		artificialB.setBackground(null);
		artificialB.setOpaque(false);
		artificialB.setBounds(130,160,100,30); //120
		
		
		var naturalB = new JRadioButton("ري طبيعي");
		naturalB.setFocusable(false);
		naturalB.setSelected(true);
		naturalB.setFont(new Font("Courier", Font.PLAIN, 14));
		naturalB.setForeground(Color.BLACK);
		naturalB.setBackground(null);
		naturalB.setOpaque(false);
		naturalB.setBounds(130,185,100,30);
		
		
		
		
		var groupB = new ButtonGroup();
		groupB.add(artificialB);
		groupB.add(naturalB);
		
				
				
				
				
				
				
				
				
		
				
	// labels in :
		JLabel grainLabel = new JLabel(grain);
		grainLabel.setBounds(50,85,60,60);
		
		JLabel vegetablesLabel = new JLabel(vegetable);
		vegetablesLabel.setBounds(50,245,60,60);
				
				
				
				
				
				
				
				
				
				
	
	 // text fields out : 
		var grainTextOut = new JTextField();
		grainTextOut.setEditable(false);
		grainTextOut.setBounds(50,100,100,30);
		grainTextOut.setFont(new Font("Courier", Font.PLAIN, 16 ));
		grainTextOut.setHorizontalAlignment(JTextField.CENTER);
		grainTextOut.setBackground(Color.GRAY);
		grainTextOut.setForeground(Color.white);
		grainTextOut.setBorder(null);
		grainTextOut.setCaretColor(Color.white);
		
		
		var vegetablesTextOut = new JTextField(40);
		vegetablesTextOut.setEditable(false);
		vegetablesTextOut.setBounds(50,260,100,30);
		vegetablesTextOut.setHorizontalAlignment(JTextField.CENTER);
		vegetablesTextOut.setFont(new Font("Courier", Font.PLAIN, 16 ));
		vegetablesTextOut.setBackground(Color.GRAY);
		vegetablesTextOut.setForeground(Color.white);
		vegetablesTextOut.setBorder(null);
		vegetablesTextOut.setCaretColor(Color.white);
	

		
		
		
		
	// label text for result : 
		var grainLabelOut = new JLabel();
		grainLabelOut.setText("القمح :");
		grainLabelOut.setBounds(170,100,100,30);
		grainLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
		grainLabelOut.setForeground(Color.BLACK);
		
		var vegetablesLabelOut = new JLabel();
		vegetablesLabelOut.setText("ثمار أخرى :");
		vegetablesLabelOut.setBounds(170,260,100,30);
		vegetablesLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
		vegetablesLabelOut.setForeground(Color.BLACK);		
				
				
				
				
				
				
				
				
				
				
				
	
	// buttons: 
		
		
		var calculateButton = new JButton("حساب الزكاة");
		calculateButton.setBounds(350,150,150,50);
		calculateButton.setFocusable(false);
		calculateButton.setBackground(new Color(45,45,85));
		calculateButton.setForeground(Color.white);
		calculateButton.setCursor(Cursor.getPredefinedCursor(12));
		calculateButton.setBorder(BorderFactory.createBevelBorder(0));
		calculateButton.setFont(new Font("Calibri", Font.PLAIN, 22));
		calculateButton.addActionListener(e ->{
			
		//	Float grainNumber = Float.parseFloat( grainText.getText() );
		//	Float vegetableNumber = Float.parseFloat( vegetableText.getText() );
			
		//	var agri = new AgricultureZakatCalculator(grainNumber, vegetableNumber);
			
			var agri = new AgricultureZakatCalculator(grainText, vegetableText);
			
			if( naturalB.isSelected()  )
				agri.calcule(grainTextOut, vegetablesTextOut ,'n');
			else
				agri.calcule(grainTextOut, vegetablesTextOut ,'a');
			
			
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
			
			grainText.setText("0.0");
			vegetableText.setText("0.0");
			grainTextOut.setText("");
			vegetablesTextOut.setText("");
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
			informationLabel.add(grainText);
			informationLabel.add(vegetableText);
			informationLabel.add(vegetablesLabel);
			informationLabel.add(grainLabel);
			informationLabel.add(artificialB);
			informationLabel.add(naturalB);
			
			
			
			
			
			
			
			var affichageLabel = new JLabel();
			affichageLabel.setBounds(550,15,280,440);
			affichageLabel.setOpaque(false);
			affichageLabel.setBorder(BorderFactory.createTitledBorder(border2,"المقدار الواجب إخراجه" , 2, 0, font, color));
			
			affichageLabel.add(grainTextOut);
			affichageLabel.add(vegetablesTextOut);
			affichageLabel.add(grainLabelOut);
			affichageLabel.add(vegetablesLabelOut);
	
			
			
/////////////////////////////////			
			
			var centerPanel = new JPanel(null);
			centerPanel.setBounds(0,90,900,600);
			centerPanel.setOpaque(false);         // TODO panel.setOpaque(false); IMPORTANT.
			
			centerPanel.add(informationLabel);
			centerPanel.add(affichageLabel);
			
			centerPanel.add(calculateButton);
			centerPanel.add(resetButton);
	
			

//////////////////////////////////////////////////////////////////////////////////////////////////


		mainPanel.add(upperPanel);
		mainPanel.add(centerPanel);
		mainPanel.add(bgLabel);
		mainFrame.setContentPane(mainPanel);
		
		
		
	}

}
