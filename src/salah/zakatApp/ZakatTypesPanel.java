package salah.zakatApp;

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
import javax.swing.border.Border;

import salah.zakatApp.agriculture.ArgrcultureZakatPanel;
import salah.zakatApp.betail.CattleZakatPanel;
import salah.zakatApp.lorArgent.SilverZakatPanel;
import salah.zakatApp.numeroraire.MoneyZakatPanel;

public class ZakatTypesPanel {

	public ZakatTypesPanel(JFrame mainFrame, JPanel mainPanel) {

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
			JLabel upperLabel = new JLabel("الأنواع التي تجب فيها الزكاة:");
			//upperLabel.setPreferredSize(new Dimension(0,80));
			upperLabel.setBounds(200,10,500,90);
			upperLabel.setHorizontalAlignment(JLabel.CENTER);
			upperLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
			upperLabel.setBackground( Color.orange); // 1055,105,95
			upperLabel.setForeground(new Color(0,0,0));
			upperLabel.setOpaque(false);
			//upperLabel.setBorder(BorderFactory.createLoweredBevelBorder());
			upperLabel.setBorder(BorderFactory.createBevelBorder(0));
			
/////////////////////////////////
			
			Border bord1 = BorderFactory.createLoweredBevelBorder();
			Border bord2 = BorderFactory.createBevelBorder(0);
			Font font1 = new Font("Calibri", Font.PLAIN, 24);
			
			
			
			JLabel moneyLabel = new JLabel(new ImageIcon("images/money.png"));
//			moneyLabel.setText("زكاة الأموال");
//			moneyLabel.setForeground(Color.white);
//			moneyLabel.setFont(new Font("Calibri", Font.PLAIN, 28));
//			moneyLabel.setHorizontalTextPosition(JLabel.CENTER);
//			moneyLabel.setVerticalTextPosition(JLabel.TOP);
//			moneyLabel.setIconTextGap(10);
			moneyLabel.setBounds(220, 130,150,180 ); //220, 140,150,150
			moneyLabel.setBorder(BorderFactory.createTitledBorder(bord2, "زكـاة الأمـوال", 2, 1, font1, Color.black));
			moneyLabel.setFocusable(false);
			moneyLabel.setCursor(Cursor.getPredefinedCursor(12));
			moneyLabel.setBackground(Color.orange);
			
			JLabel agriculturalLabel = new JLabel(new ImageIcon("images/agriculture.png"));
			agriculturalLabel.setBounds(220, 340,150,180 );
			agriculturalLabel.setFocusable(false);
			agriculturalLabel.setCursor(Cursor.getPredefinedCursor(12));
			agriculturalLabel.setBorder(BorderFactory.createTitledBorder(bord2, "زكـاة المـحـاصيـل", 2, 1, font1, Color.black));
			agriculturalLabel.setBackground(Color.orange);
			
			JLabel cattleLabel = new JLabel(new ImageIcon("images/ram.png"));
			cattleLabel.setBounds(520, 130,150,180 );
			cattleLabel.setFocusable(false);
			cattleLabel.setCursor(Cursor.getPredefinedCursor(12));
			cattleLabel.setBorder(BorderFactory.createTitledBorder(bord2, "زكـاة الأنـعام", 2, 1, font1, Color.black));
			cattleLabel.setBackground(Color.orange);
			
			JLabel silverLabel = new JLabel(new ImageIcon("images/silvermetal.png"));
			silverLabel.setBounds(520, 340,150,180 );
			silverLabel.setFocusable(false);
			silverLabel.setCursor(Cursor.getPredefinedCursor(12));
			silverLabel.setBorder(BorderFactory.createTitledBorder(bord2, "زكـاة النـقـديـن", 2, 1, font1, Color.black));
			silverLabel.setBackground(Color.orange);
			
/////////////////////////////////				
			JPanel panel = new JPanel(null);
			panel.add(upperLabel);
			panel.add(label);
			panel.add(cattleLabel);
			panel.add(agriculturalLabel);
			panel.add(moneyLabel);
			panel.add(silverLabel);
			panel.add(bgLabel);
			
/////////////////////////////////

				silverLabel.addMouseListener(new MouseListener() {
					public void mouseClicked(MouseEvent e) {
						new SilverZakatPanel(mainFrame, mainPanel);
					}
					@Override
					public void mousePressed(MouseEvent e) {
						silverLabel.setBackground(Color.cyan);
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						silverLabel.setBackground(Color.orange);
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						silverLabel.setBounds(518, 338,150,180 );
					}
					@Override
					public void mouseExited(MouseEvent e) {
						silverLabel.setBounds(520, 340,150,180 );
					}
				});
				
				cattleLabel.addMouseListener(new MouseListener() {
					public void mouseClicked(MouseEvent e) {
						new CattleZakatPanel(mainFrame, mainPanel);
					}
					@Override
					public void mousePressed(MouseEvent e) {
						cattleLabel.setBackground(Color.cyan);
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						cattleLabel.setBackground(Color.orange);
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						cattleLabel.setBounds(518, 128,150,180 );
					}
					@Override
					public void mouseExited(MouseEvent e) {
						cattleLabel.setBounds(520, 130,150,180 );
					}
				});
			
				moneyLabel.addMouseListener(new MouseListener() {
					public void mouseClicked(MouseEvent e) {
						new MoneyZakatPanel(mainFrame, mainPanel);
					}
					@Override
					public void mousePressed(MouseEvent e) {
						moneyLabel.setBackground(Color.cyan);
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						moneyLabel.setBackground(Color.orange);
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						moneyLabel.setBounds(218, 128,150,180 );
					}
					@Override
					public void mouseExited(MouseEvent e) {
						moneyLabel.setBounds(220, 130,150,180 );
					}
				});
			
				agriculturalLabel.addMouseListener(new MouseListener() {
					public void mouseClicked(MouseEvent e) {
						new ArgrcultureZakatPanel(mainFrame, mainPanel);
					}
					@Override
					public void mousePressed(MouseEvent e) {
						agriculturalLabel.setBackground(Color.cyan);
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						agriculturalLabel.setBackground(Color.orange);
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						agriculturalLabel.setBounds(218, 338,150,180 );
					}
					@Override
					public void mouseExited(MouseEvent e) {
						agriculturalLabel.setBounds(220, 340,150,180 );
					}
				});
				
		
//////////////////////////////////////////////////////////////////////////////////////////////////


		mainPanel.add(panel);
		mainFrame.setContentPane(mainPanel);
	
	}

}
