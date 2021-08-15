package salah.zakatApp;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class FirstPanel {
	
	
	public FirstPanel(JFrame mainFrame, JPanel mainPanel) {
		
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

		//////////////////
		
		var fbLabel = new JLabel(new ImageIcon("images/facebook.png"));
		fbLabel.setBounds(10,10,70,70);
		fbLabel.setCursor(Cursor.getPredefinedCursor(12));
		fbLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {

				// TODO how to go to link !
				 try {
				        Desktop.getDesktop().browse(new URL("https://web.facebook.com/Salah.mrz19/").toURI());
				    } catch (Exception e1) {
				        e1.printStackTrace();
				    }
			}
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {
				fbLabel.setBounds(8,8,70,70);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				fbLabel.setBounds(10,10,70,70);
			}
		});
		
		var gmailLabel = new JLabel(new ImageIcon("images/email.png"));
		gmailLabel.setBounds(10,60,70,70); //10,70,70,70
		gmailLabel.setCursor(Cursor.getPredefinedCursor(12));
		gmailLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {

				
				//JOptionPane.showMessageDialog(mainFrame, "Contact us : salahexe3@gmail.com  ");
				JOptionPane.showMessageDialog(mainFrame, "Contact us : salahexe3@gmail.com  ",
											"Message :p",
					                    	JOptionPane.INFORMATION_MESSAGE, 
					                    	new ImageIcon("images/web.ico"));

			}
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {
				gmailLabel.setBounds(8,58,70,70);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gmailLabel.setBounds(10,60,70,70);
			}
		});
		
		var instaLabel = new JLabel(new ImageIcon("images/instagram.png"));
		instaLabel.setBounds(10,110,70,70);
		instaLabel.setCursor(Cursor.getPredefinedCursor(12));
		instaLabel.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {

				try {
			        Desktop.getDesktop().browse(new URL("https://www.instagram.com/").toURI());
			    } catch (Exception e1) {
			        e1.printStackTrace();
			    }
				
			}
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {
				instaLabel.setBounds(8,108,70,70);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				instaLabel.setBounds(10,110,70,70);
			}
		});
		
		
	/*	var contactLabel = new JLabel();
		contactLabel.setBounds(10,170,100,200);
		contactLabel.setBackground(Color.white);
		contactLabel.setBorder(BorderFactory.createTitledBorder(
							BorderFactory.createLoweredBevelBorder(),
							"تواصل معي:", 2, 0, 
							new Font("Calibri", Font.PLAIN, 16),
							Color.black));
		
		contactLabel.add(fbLabel);
		contactLabel.add(instaLabel);
		contactLabel.add(gmailLabel);
	*/	
		//////////////////
		
		
		Border bord1 = BorderFactory.createLoweredBevelBorder();
		
		//TODO  I want to make the buttons with mouseLis
		
		
		var startButton = new JLabel("حسـاب الزكــاة");
		startButton.setCursor(Cursor.getPredefinedCursor(12));
		startButton.setBounds(301,50,280,80);
//		startButton.setVerticalTextPosition(JLabel.CENTER);
//		startButton.setHorizontalTextPosition(JLabel.CENTER);
		startButton.setHorizontalAlignment(JLabel.CENTER);
		startButton.setBorder(bord1);
		startButton.setBackground(Color.orange);
		startButton.setFont(new Font("Andalus", Font.PLAIN,35));
		
		startButton.setForeground(Color.black);
		startButton.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				new ZakatTypesPanel(mainFrame, mainPanel);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				startButton.setBackground(Color.cyan);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				startButton.setBackground(Color.orange);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setBounds(299,48,280,80);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setBounds(301,50,280,80);
			}
		});
		
		
		
		var nisabButton = new JLabel("ما هو النصـاب؟");
		nisabButton.setCursor(Cursor.getPredefinedCursor(12));
		nisabButton.setBounds(20,40,280,50);
		nisabButton.setBorder(bord1);
		nisabButton.setBackground(Color.DARK_GRAY);
		nisabButton.setFont(new Font("Andalus", Font.PLAIN,28));
		nisabButton.setForeground(new Color(30,30,30));
		
		nisabButton.setHorizontalAlignment(JLabel.CENTER);
		nisabButton.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {

				
				mainPanel.removeAll();
				mainPanel.validate();
				mainPanel.repaint();

				
				Border bord = BorderFactory.createLoweredBevelBorder();
				Font font = new Font("Calibri", Font.BOLD, 22);
				Color color = new Color(51, 0, 102);


				var textOne = new JTextArea("         نصاب الزكاة هو مقدارٌ من المال لا تجب الزكاة في أقلّ منه، وهو شرطٌ من شروط وجوب الزكاة، \r\n"
											+ "         إلّا أنّه يختلف باختلاف أجناس الأموال.");
				textOne.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
				textOne.setEditable(false);
				textOne.setBounds(20, 91, 838, 102);
				textOne.setForeground(new Color(0, 0, 0));
				textOne.setOpaque(false);
				textOne.setFont(new Font("Calibri", Font.PLAIN, 21));
				textOne.setBorder(BorderFactory.createTitledBorder(bord, "تعريف النِّصاب:", 2, 0, font, color));

				
				JTextArea textTwo = new JTextArea(
						  "     ذكر الإمام البخاريّ في صحيحه عن أبي سعيد الخُدريّ -رضي الله عنه-، عن رسول الله -صلّى الله عليه وسلّم-،\r\n"
						+ "     أنّه قال: (ليسَ فِيما دُونَ خَمْسِ أواقٍ صَدَقَةٌ، وليسَ فِيما دُونَ خَمْسِ ذَوْدٍ صَدَقَةٌ، وليسَ فِيما دُونَ خَمْسِ أوْسُقٍ صَدَقَةٌ)،\r\n"
						+ "     بالإضافة إلى إجماع العلماء على ذلك في غير الزروع، والثمار، والمعادن، كما نقل ابن قدامة الإجماع في كتابه المُغني؛ \r\n"
						+ "     إذ قال: \"ولا يجوز تعجيلُ الزَّكاةِ قبل مِلْك النِّصَاب، بغير خلافٍ عَلِمْناه\"، ونقله ابن حزم أيضاً في كتابه مراتب الإجماع؛\r\n"
						+ "     فقال: \"واتَّفقوا على أنَّ من كان عنده أقلُّ من النِّصاب من كلِّ شيء يُزكَّى،  فإنَّه لا زكاةَ عليه ما لم يكن خليطاً، على\r\n"
						+ "     اختلافِهم في النِّصاب\"، ونقل النوويّ الإجماع أيضاً في كتابه المجموع؛ فقال: \"زكاةُ الماشية والنَّقْد والتِّجارة، فلا يجوز\r\n"
						+ "     تعجيلُ الزَّكاة فيه قبل مِلْك النِّصاب، بلا خلافٍ\".");
				textTwo.setOpaque(false);
				textTwo.setForeground(Color.BLACK);
				textTwo.setFont(new Font("Calibri", Font.PLAIN, 21));
				textTwo.setEditable(false);
				textTwo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
				textTwo.setBounds(20, 235, 838, 236);
				textTwo.setBorder(BorderFactory.createTitledBorder(bord, "اشتراط بلوغ النِّصاب:", 2, 0, font, color));
				

				mainPanel.add(textOne);
				mainPanel.add(textTwo);
				mainPanel.add(label);
				mainPanel.add(bgLabel);
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				nisabButton.setBackground(Color.black);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				nisabButton.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				nisabButton.setBounds(18,38,280,50);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nisabButton.setBounds(20,40,280,50);
			}
		});
		
		var chorotButton = new JLabel("الشـروط الواجـب توفـرها");
		chorotButton.setCursor(Cursor.getPredefinedCursor(12));
		chorotButton.setBounds(20,100,280,50);
		chorotButton.setBorder(bord1);
		chorotButton.setBackground(Color.DARK_GRAY);
		chorotButton.setFont(new Font("Andalus", Font.PLAIN,28));
		chorotButton.setForeground(new Color(30,30,30));
		chorotButton.setHorizontalAlignment(JLabel.CENTER);
		chorotButton.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {

				
				mainPanel.removeAll();
				mainPanel.validate();
				mainPanel.repaint();

				
				Border bord = BorderFactory.createLoweredBevelBorder();
				Font font = new Font("Calibri", Font.BOLD, 22);
				Color color = new Color(51, 0, 102);


				
				var textOne = new JTextArea(
						"     من أهم هذه الشروط ما يلي :\r\n\n"
						+ "         – أن يكون المال مملوكاً ملكية تامة للمكلف بأداء الزكاة .\r\n"
						+ "         – أن يكون المال نامياً أو قابلاً للنماء حكماً .\r\n"
						+ "         – أن يصل المال نصاباً معيناً .\r\n"
						+ "         – أن يكون المال فائضاً عن الحاجات الأصلية للمزكى ولمن يعول بدون إسراف أو ترف أو تبذير .\r\n"
						+ "         – أن يكون المال خالياً من الديَّن أي تطرح منه الديون الحالَّة .\r\n"
						+ "         – أن يمر على ملكية المال حولاً كاملاً من وقت وصوله النصاب ما عدا زكاة الزروع والثمار والركاز  .\r\n"
						+ "         – أن يكون المال حلالاً طيباً ، لأن الله طيب لا يقبل إلا طيبا ، وأن المال الحرام الخبيث يفقد شرط التملك .\n\n"
						+ "     تجب الزكاة على كلّ ممّا يأتي: \r\n\n"
						+ "         – المسلم: فلا تجب على غير المسلم بالإجماع.\r\n"
						+ "         – الحرّ: فلا تجب الزكاة على العبد.\r\n"
						+ "         – البالغ العاقل: حيث يُشترط ذلك عند الحنفية، أمّا الجمهور فقالوا بأنّ البلوغ والعقل لا يُشترطان، \r\n"
						+ "           فالمجنون والصّبي يُخرج وليّهما زكاة أموالهما." );
		
				textOne.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
				textOne.setEditable(false);
				textOne.setBounds(20, 70, 838, 460);
				textOne.setForeground(new Color(0, 0, 0));
				textOne.setOpaque(false);
				textOne.setFont(new Font("Calibri", Font.PLAIN, 21));
				textOne.setBorder(BorderFactory.createTitledBorder(bord, "شروط الزكاة:", 2, 0, font, color));
				
		
				
				mainPanel.add(textOne);
				mainPanel.add(label);
				mainPanel.add(bgLabel);
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				chorotButton.setBackground(Color.black);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				chorotButton.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				chorotButton.setBounds(18,98,280,50);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				chorotButton.setBounds(20,100,280,50);
			}
		});
		
		var hsiabButton = new JLabel("طـريقـة الحســاب");
		hsiabButton.setCursor(Cursor.getPredefinedCursor(12));
		hsiabButton.setBounds(20,160,280,50);
		hsiabButton.setBorder(bord1);
		hsiabButton.setBackground(Color.DARK_GRAY);
		hsiabButton.setFont(new Font("Andalus", Font.PLAIN,28));
		hsiabButton.setForeground(new Color(30,30,30));
		
		hsiabButton.setHorizontalAlignment(JLabel.CENTER);
		
		hsiabButton.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {

				mainPanel.removeAll();
				mainPanel.validate();
				mainPanel.repaint();

				
				Border bord = BorderFactory.createLoweredBevelBorder();
				Font font = new Font("Calibri", Font.BOLD, 22);
				Color color = new Color(51, 0, 102);

				
				var textOne = new JTextArea(
						 "  - الأوراق النقديّة: نسبة الزكاة من المال هي  2.5% ويمكن أن تستخرج قيمتها بقسمة المال على 40، والمال الذي يجب \r\n"
						 + "           فيه الزكاة هو ما بلغ النصاب وحال عليه الحول أي مرت عليه سنة هجرية. والنصاب هو 85غراما من الذهب أو ما \r\n"
						 + "           يعادلها من العملات الأخرى وقت وجوب الزكاة. \n"
						 
						 +"  - زكاة الغنم: إذا بلغت 40 تخرج شاة واحدة، عند 121 تخرج شاتان، وإذا بلغت 201 تخرج  3 شياه،\r\n"
						 + "           وبداية من 400 تخرج لكل 100 رأس شاتا واحدة.\n"
						 +"  - زكاة البقر: إذا بلغت 30 بقرة تخرج عجلا واحدا، إذا بلغت 40 تخرج بقرة واحدة، ثم بداية من 60: لكل 40 رأسا\r\n"
						 + "           تخرج بقرة ولكل 30 رأسا تخرج عجلا،  مثلا: من أجل 110رأس تخرج عجلين وبقرة لأن 110 = 2*40 + 30 \n"
						 
						 +"  - زكاة الإبل: إذا بلغت 5 إبل تخرج شاة واحدة، 10 إبل تخرج شاتان، 15 تخرج 3 شياه، 20 تخرج 4 شياه،\r\n"
						 + "           ثم إذا بلغت الإبل 25 تخرج بنتا مخاضا واحدة، من أجل 36 تخرج بنتا لبونا واحدة، من أجل 46 تخرج حقة، \r\n"
						 + "           من أجل 61 تخرج جذعة، إذا بلغت 76 تخرج بنتا لبون 2، إذا بلغ العدد 91 تخرج بنتان مخوض 2، \r\n"
						 + "           بداية من 120 يتم الحساب كالآتي: من أجل كل 50 ناقة تخرج حقة، ومن أجل كل 40 رأسا تخرج لبونا، \r\n"
						 + "           مثلا: 150 ابلا تخرج منها 3 حقات لأن 150= 3*50+ 0*40 \n"
						 
						 +"  - زكاة الذهب والفضة: تقدر قيمة الزكاة ب 2.5% أو بالقسمة على 40، فيما يخص الفضة النصاب هو 595 جرام، \r\n"
						 + "           أما الذهب فيوجد 3 أنواع: نصاب الذهب عيار 18 هو 113 جرام، و 97جرام من اجل الذهب من عيار 21،\r\n"
						 + "           أما عيار 24 وهو الأشهر بين الثلاثة فنصابه هو 85 جرام. \n"
						 
						 +"  - زكاة المحاصيل الزراعية:  تجب على كل ما يكال ويدخر من الثمار او الزروع كالقمح والتمر وغيره، ووقت الإخراج\r\n"
						 + "           هو عند الحصاد، تختلف النسبة حسب نوع السقاية  فإذا سقت الأمطار الثمار تخرج 10% منها، وإذا سقيت بالري\r\n"
						 + "           الاصطناعي فتخرج 5% فقط منها، وجب الذكر أن نصاب القمح هو 675kg أما باقي المحاصيل فلا نصاب فيها."
						);
					
				textOne.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
				textOne.setEditable(false);
				textOne.setBounds(20, 65, 854, 485);
				textOne.setForeground(new Color(0, 0, 0));
				textOne.setOpaque(false);
				textOne.setFont(new Font("Calibri", Font.PLAIN, 20));
				textOne.setBorder(BorderFactory.createTitledBorder(bord, "طريقة حساب مختلف أنواع الزكاة:", 2, 0, font, color));
				
		
				
				mainPanel.add(textOne);
				mainPanel.add(label);
				mainPanel.add(bgLabel);
				
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				hsiabButton.setBackground(Color.black);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				hsiabButton.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				hsiabButton.setBounds(18,158,280,50);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hsiabButton.setBounds(20,160,280,50);
			}
		});
			
//		hsiabButton.setBackground(Color.orange);
//		nisabButton.setBackground(Color.orange);
//		chorotButton.setBackground(Color.orange);
		
		
		var exitButton = new JLabel("خــروج");
		exitButton.setCursor(Cursor.getPredefinedCursor(12));
		exitButton.setBounds(340,420,200,80); //310,420,280,80
		exitButton.setBorder(bord1);
		exitButton.setHorizontalAlignment(JLabel.CENTER);
		exitButton.setFont(new Font("Andalus", Font.PLAIN,35));
		exitButton.setForeground(Color.black);
		exitButton.setBackground(Color.orange);
		exitButton.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);	
			}
			@Override
			public void mousePressed(MouseEvent e) {
				exitButton.setBackground(Color.cyan);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				exitButton.setBackground(Color.orange);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setBounds(338,418,200,80);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setBounds(340,420,200,80);
			}
		});
		
//////////////////////////////////////////////////
		
		Border bord2 = BorderFactory.createLoweredBevelBorder();
		Font font2 = new Font("Calibri", Font.PLAIN, 26);
		
		var helpLabel = new JLabel();
		helpLabel.setBounds(282,150,320,240); // 290 $ * $
		helpLabel.add(nisabButton);
		helpLabel.add(chorotButton);
		helpLabel.add(hsiabButton);
		helpLabel.setBorder(BorderFactory.createTitledBorder(bord2,"  مساعدة:  ",2,0,font2, Color.black));
		helpLabel.setBackground(Color.orange);
		
//////////////////////////////////////////////////////////////////////////////////////////////////
		
		mainPanel.add(startButton);
		mainPanel.add(exitButton);
		mainPanel.add(helpLabel);
		//mainPanel.add(contactLabel);
		
		mainPanel.add(fbLabel);
		mainPanel.add(instaLabel);
		mainPanel.add(gmailLabel);
		
		mainPanel.add(bgLabel);
		mainFrame.setContentPane(mainPanel);
	}
	
	

}
