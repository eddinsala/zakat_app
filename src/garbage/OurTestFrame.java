package garbage;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class OurTestFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OurTestFrame window = new OurTestFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OurTestFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 80, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel(null);
		
		frame.getContentPane().add(mainPanel);
		
		
		
		
		var bgLabel = new JLabel( new ImageIcon("images/BG2.png") );
		bgLabel.setBounds(0,0,900,600);
		
		JLabel label = new JLabel(new ImageIcon("images/home.png"));
		label.setBounds(10,10,70,70);
		label.setCursor(Cursor.getPredefinedCursor(12));
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			//	new FirstPanel(mainFrame, mainPanel);
			}
		});
		
		
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
		textOne.setBorder(null);
		textOne.setFont(new Font("Calibri", Font.PLAIN, 20));
		textOne.setBorder(BorderFactory.createTitledBorder(bord, "طريقة حساب مختلف أنواع الزكاة:", 2, 0, font, color));
		

		
		mainPanel.add(textOne);
		mainPanel.add(label);
		mainPanel.add(bgLabel);
	
	}
}
