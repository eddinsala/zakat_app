package salah.zakatApp.betail;

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
import javax.swing.JTextField;
import javax.swing.border.Border;

import salah.zakatApp.*;
import salah.zakatApp.agriculture.ArgrcultureZakatPanel;
import salah.zakatApp.lorArgent.SilverZakatPanel;
import salah.zakatApp.numeroraire.MoneyZakatPanel;

public class CattleZakatPanel {

	public CattleZakatPanel(JFrame mainFrame, JPanel mainPanel) {

		// TODO need to know how to start typing at the middle of the text field
		
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
		
		
		JLabel silverLabel = new JLabel(new ImageIcon("images/silvermetalSmall.png"));
		silverLabel.setBounds(800, 10,70,70 );
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
				silverLabel.setBounds(798, 8,70,70 );
			}

			@Override
			public void mouseExited(MouseEvent e) {
				silverLabel.setBounds(800, 10,70,70);
			}
		});
		
		
/////////////////////////////////
			var upperPanel = new JPanel(null);
			upperPanel.setBounds(-2,-2,901,90);
			upperPanel.setOpaque(false);
			//upperPanel.setBorder(BorderFactory.createLoweredBevelBorder());
			upperPanel.setBorder(BorderFactory.createBevelBorder(0));
			
			upperPanel.add(label);
			upperPanel.add(silverLabel);
			upperPanel.add(agriculturalLabel);
			upperPanel.add(moneyLabel);

			
			
//////////////////////////////////////////////////////////////////
			
		// icons:   
			var sheep = new ImageIcon("images/sheep.png");
			var cow = new ImageIcon("images/cow.png");
			var camel = new ImageIcon("images/camel.png");
			
		// text fields : 
			var sheepText = new JTextField();
			sheepText.setText("0");
			//sheepText.setToolTipText("how many sheeps do you have ?");
			sheepText.setBounds(120,100,100,30); // 120,75,100,30
			sheepText.setFont(new Font("Courier", Font.PLAIN, 20 ));
			sheepText.setHorizontalAlignment(JTextField.CENTER);
			sheepText.setBackground(Color.GRAY);
			sheepText.setForeground(Color.white);
			sheepText.setBorder(null);
			sheepText.setCursor(Cursor.getPredefinedCursor(0));
			sheepText.setCaretColor(Color.white);
			
			var cowText = new JTextField(40);
			cowText.setText("0");
			//cowText.setToolTipText("how many cows do you have ?");
			cowText.setBounds(120,180,100,30); // 120,125,100,30
			cowText.setFont(new Font("Courier", Font.PLAIN, 20 ));
			cowText.setHorizontalAlignment(JTextField.CENTER);
			cowText.setBackground(Color.GRAY);
			cowText.setForeground(Color.white);
			cowText.setBorder(null);
			cowText.setCursor(Cursor.getPredefinedCursor(0)); // default: 2
			cowText.setCaretColor(Color.white);
			
			var camelText = new JTextField();
			camelText.setText("0");
			//camelText.setToolTipText("how many camels do you have ?");
			camelText.setBounds(120,260,100,30); // 120,175,100,30
			camelText.setFont(new Font("Courier", Font.PLAIN, 20 ));
			camelText.setBackground(Color.GRAY);
			camelText.setHorizontalAlignment(JTextField.CENTER);
			camelText.setForeground(Color.white);
			camelText.setBorder(null);
			camelText.setCursor(Cursor.getPredefinedCursor(0));
			camelText.setCaretColor(Color.white);
		
		
		// labels :
			JLabel sheepLabel = new JLabel(sheep);
			sheepLabel.setBounds(50,85,60,60);

			JLabel cowLabel = new JLabel(cow);
			cowLabel.setBounds(50,165,60,60);
			
			JLabel camelLabel = new JLabel(camel);
			camelLabel.setBounds(50,245,60,60);
			
			
			
		// text fields out : 
			var sheepTextOut = new JTextField();
			sheepTextOut.setText("0");
			sheepTextOut.setEditable(false);
			sheepTextOut.setToolTipText("عدد الكباش");
			sheepTextOut.setBounds(50,75,100,30);
			sheepTextOut.setHorizontalAlignment(JTextField.CENTER);
			sheepTextOut.setFont(new Font("Courier", Font.PLAIN, 20 ));
			sheepTextOut.setBackground(Color.GRAY);
			sheepTextOut.setForeground(Color.white);
			sheepTextOut.setBorder(null);
			sheepTextOut.setCaretColor(Color.white);
			
			
			var cowTextOut = new JTextField(40);
			cowTextOut.setText("0");
			cowTextOut.setEditable(false);
			cowTextOut.setBounds(50,125,100,30);
			cowTextOut.setHorizontalAlignment(JTextField.CENTER);
			cowTextOut.setFont(new Font("Courier", Font.PLAIN, 20 ));
			cowTextOut.setBackground(Color.GRAY);
			cowTextOut.setForeground(Color.white);
			cowTextOut.setBorder(null);
			cowTextOut.setCaretColor(Color.white);
			
			
			var smallCowTextOut = new JTextField();
			smallCowTextOut.setText("0");
			smallCowTextOut.setHorizontalAlignment(JTextField.CENTER);
			smallCowTextOut.setEditable(false);
			smallCowTextOut.setBounds(50,175,100,30);
			smallCowTextOut.setFont(new Font("Courier", Font.PLAIN, 20 ));
			smallCowTextOut.setBackground(Color.GRAY);
			smallCowTextOut.setForeground(Color.white);
			smallCowTextOut.setBorder(null);
			smallCowTextOut.setCaretColor(Color.white);
			
			
			var makhadTextOut = new JTextField(40);
			makhadTextOut.setText("0");
			makhadTextOut.setHorizontalAlignment(JTextField.CENTER);
			makhadTextOut.setEditable(false);
			makhadTextOut.setBounds(50,225,100,30);
			makhadTextOut.setFont(new Font("Courier", Font.PLAIN, 20 ));
			makhadTextOut.setBackground(Color.GRAY);
			makhadTextOut.setForeground(Color.white);
			makhadTextOut.setBorder(null);
			makhadTextOut.setCaretColor(Color.white);
			
			
			
			var labonTextOut = new JTextField(40);
			labonTextOut.setText("0");
			labonTextOut.setHorizontalAlignment(JTextField.CENTER);
			labonTextOut.setEditable(false);
			labonTextOut.setBounds(50,275,100,30);
			labonTextOut.setFont(new Font("Courier", Font.PLAIN, 20 ));
			labonTextOut.setBackground(Color.GRAY);
			labonTextOut.setForeground(Color.white);
			labonTextOut.setBorder(null);
			labonTextOut.setCaretColor(Color.white);
			
			
			var hikaTextOut = new JTextField(40);
			hikaTextOut.setText("0");
			hikaTextOut.setHorizontalAlignment(JTextField.CENTER);
			hikaTextOut.setEditable(false);
			hikaTextOut.setBounds(50,325,100,30);
			hikaTextOut.setFont(new Font("Courier", Font.PLAIN, 20 ));
			hikaTextOut.setBackground(Color.GRAY);
			hikaTextOut.setForeground(Color.white);
			hikaTextOut.setBorder(null);
			hikaTextOut.setCaretColor(Color.white);
			
			
			var jid3aTextOut = new JTextField(40);
			jid3aTextOut.setText("0");
			jid3aTextOut.setHorizontalAlignment(JTextField.CENTER);
			jid3aTextOut.setEditable(false);
			jid3aTextOut.setBounds(50,375,100,30);
			jid3aTextOut.setFont(new Font("Courier", Font.PLAIN, 20 ));
			jid3aTextOut.setBackground(Color.GRAY);
			jid3aTextOut.setForeground(Color.white);
			jid3aTextOut.setBorder(null);
			jid3aTextOut.setCaretColor(Color.white);
			
			
			
						
						
		// label text for result : 
			var sheepLabelOut = new JLabel();
			sheepLabelOut.setText("غنم :");
			sheepLabelOut.setBounds(170,60,100,60);
			sheepLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
			sheepLabelOut.setForeground(Color.BLACK);
			
			var cowLabelOut = new JLabel();
			cowLabelOut.setText("بقرة مسنة :");
			cowLabelOut.setBounds(170,110,100,60);
			cowLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
			cowLabelOut.setForeground(Color.BLACK);
			
			var smallCowLabelOut = new JLabel();
			smallCowLabelOut.setText("تبيع :");
			smallCowLabelOut.setBounds(170,160,100,60); 
			smallCowLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
			smallCowLabelOut.setForeground(Color.BLACK);
			
			var makhadLabelOut = new JLabel();
			makhadLabelOut.setText("مخاض :");
			makhadLabelOut.setBounds(170,210,100,60);
			makhadLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
			makhadLabelOut.setForeground(Color.BLACK);
			
			var labonLabelOut = new JLabel();
			labonLabelOut.setText("لبون :");
			labonLabelOut.setBounds(170,260,100,60);
			labonLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
			labonLabelOut.setForeground(Color.BLACK);
			
			
			var hikaLabelOut = new JLabel();
			hikaLabelOut.setText("حقة :");
			hikaLabelOut.setBounds(170,310,100,60);
			hikaLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20 ));
			hikaLabelOut.setForeground(Color.BLACK);
			
			var jid3aLabelOut = new JLabel();
			jid3aLabelOut.setText("جذعة :");
			jid3aLabelOut.setBounds(170,360,100,60);
			jid3aLabelOut.setFont(new Font("Calibri", Font.PLAIN, 20));
			jid3aLabelOut.setForeground(Color.BLACK);
			
			
						
						
						
											
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
				
				
			//	int sheepNumber = Integer.parseInt( sheepText.getText() );
			//	int camelNumber = Integer.parseInt( camelText.getText() );
			//	int cowNumber = Integer.parseInt( cowText.getText() );
				
				
			//	var calcule = new CattleZakatCalculator(sheepNumber, camelNumber,cowNumber);
			
				var calcule = new CattleZakatCalculator(sheepText, camelText,cowText);
				
				calcule.calculeCows(cowTextOut , smallCowTextOut );
				calcule.calculeSheeps(sheepTextOut);
				calcule.calculeCamels(sheepTextOut, makhadTextOut ,labonTextOut ,hikaTextOut , jid3aTextOut  );
				
				
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
				
				camelText.setText("0");
				sheepText.setText("0");
				cowText.setText("0");
				
				sheepTextOut.setText("0");
				cowTextOut.setText("0");
				smallCowTextOut.setText("0");
				makhadTextOut.setText("0");
				labonTextOut.setText("0");
				hikaTextOut.setText("0");
				jid3aTextOut.setText("0");
				
				
			});
			
			

			
			var help = new JLabel(" مساعدة ");
			help.setHorizontalAlignment(JLabel.CENTER);
			help.setVerticalAlignment(JLabel.CENTER);
			help.setBounds(390,320,70,35);
			help.setFont(new Font("Calibri", Font.PLAIN, 18));
			help.setBorder(BorderFactory.createLoweredBevelBorder());
			//help.setOpaque(true);
			help.setBackground(new Color(45,45,85));
			help.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
				var helpFrame = new JFrame( "قائمة للمساعدة");
				helpFrame.setLayout(null);
				helpFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				helpFrame.setLocation(460,180);
				helpFrame.setSize(405,310);
				helpFrame.setIconImage(new ImageIcon("images/info.png").getImage());
				
				var firstlabel = new JLabel(new ImageIcon("images/zakatHelp.jpg"));
				firstlabel.setBounds(-53,1,500,95);
				
				var secondlabel = new JLabel(new ImageIcon("images/zakatHelp2.jpg"));
				secondlabel.setBounds(-55,40,500,300);
				
				
				helpFrame.add(firstlabel);
				helpFrame.add(secondlabel);
				helpFrame.setVisible(true);
				
			}
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				help.setBounds(388,318,70,35 );
				help.setBackground(Color.orange);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				help.setBounds(390,320,70,35);
				help.setBackground(new Color(45,45,85));
			}
		});
						
						
						
						
			Font font = new Font("Andalus", Font.PLAIN, 30);
			Color color = Color.white;
			Border border = BorderFactory.createLoweredBevelBorder();
			Border border2 = BorderFactory.createRaisedBevelBorder();
			
			
			
			
			
			var informationLabel = new JLabel();
			informationLabel.setBounds(10,15,280,440);
			informationLabel.setOpaque(false);
			informationLabel.setBorder(BorderFactory.createTitledBorder(border, "ممتلكات المزكي", 2, 0, font, color));
			//  0-> 6
			informationLabel.add(sheepLabel);
			informationLabel.add(camelLabel);
			informationLabel.add(cowLabel);
			informationLabel.add(sheepText);
			informationLabel.add(cowText);
			informationLabel.add(camelText);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			var affichageLabel = new JLabel();
			affichageLabel.setBounds(550,15,280,440);
			affichageLabel.setOpaque(false);
			affichageLabel.setBorder(BorderFactory.createTitledBorder(border2,"المقدار الواجب إخراجه" , 2, 0, font, color));
			
			affichageLabel.add(sheepTextOut);
			affichageLabel.add(cowTextOut);
			affichageLabel.add(makhadTextOut);
			affichageLabel.add(smallCowTextOut);
			affichageLabel.add(labonTextOut);
			affichageLabel.add(hikaTextOut);
			affichageLabel.add(jid3aTextOut);
			
			affichageLabel.add(sheepLabelOut);
			affichageLabel.add(cowLabelOut);
			affichageLabel.add(makhadLabelOut);
			affichageLabel.add(smallCowLabelOut);
			affichageLabel.add(labonLabelOut);
			affichageLabel.add(hikaLabelOut);
			affichageLabel.add(jid3aLabelOut);
			
						
						
			
			
			
			
			
			
/////////////////////////////////		
			
			var centerPanel = new JPanel(null);
			centerPanel.setBounds(0,90,900,600);
			centerPanel.setOpaque(false);         // TODO panel.setOpaque(false); IMPORTANT.
			
			
			
			centerPanel.add(informationLabel);
			centerPanel.add(affichageLabel);
			
			centerPanel.add(calculateButton);
			centerPanel.add(resetButton);
			centerPanel.add(help);
		

//////////////////////////////////////////////////////////////////////////////////////////////////


			mainPanel.add(upperPanel);
			mainPanel.add(centerPanel);
			mainPanel.add(bgLabel);
		mainFrame.setContentPane(mainPanel);
		
		
	
	
	}

}
