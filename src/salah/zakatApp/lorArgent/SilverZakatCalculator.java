package salah.zakatApp.lorArgent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SilverZakatCalculator {
	
	private Float gold, silver;
	
	public SilverZakatCalculator(JTextField input1,JTextField input2) {



		if(input1.getText().isEmpty() || input2.getText().isEmpty() ){
			
			JOptionPane.showMessageDialog(null, " الرجاء ملأ خانات ممتلكات المزكي أو وضع 0", "Message",
									JOptionPane.INFORMATION_MESSAGE);
			gold = 0.0f;
			silver = 0.0f;
		}
		else if(isNumeric(input1)==false) {

				JOptionPane.showMessageDialog(null, 
						"الرجاء إدخال أرقام صحيحة", "Typing Error", 
						JOptionPane.ERROR_MESSAGE);
				input1.setText("");
				input1.requestFocus(); // TODO  textFiled.requestFocus();
				
				gold = 0.0f;
				silver = 0.0f;
				
			}
			else if(isNumeric(input2)==false){
					
					JOptionPane.showMessageDialog(null,
							"الرجاء إدخال أرقام صحيحة", "Typing Error",
							JOptionPane.ERROR_MESSAGE);
					input2.setText("");
					input2.requestFocus();
					
					gold = 0.0f;
					silver = 0.0f;
					
				}
				else //if(input1.getText().isEmpty()==false && input2.getText().isEmpty()==false)
					{
						gold  =Float.valueOf(input1.getText());
						silver =Float.valueOf(input2.getText());
						
					}
		
		
	}
	
	private boolean isNumeric(JTextField e1){
		try		{ 
			Float.valueOf(e1.getText()); 
		}
		catch (NumberFormatException e)	{return false;}
		
		return true; 
	}
	
	public void calculeGold( JTextField text,  int type) {
		
		Float zakat = 0.0f;
		
		if( type == 24) {
			if(gold< 85)	zakat = 0.0f;
			else {
				zakat = gold / 40;
			}
		}
		else if( type == 21) {
			if(gold< 97)	zakat = 0.0f;
			else {
				zakat = gold / 40;
			}
		}
		else if( type == 18) {
			if(gold< 113)	zakat = 0.0f;
			else {
				zakat = gold / 40;
			}
		}
		
		
		
		
		text.setText(String.valueOf(zakat) + " g");
		
	}
	
	public void calculeSilver(JTextField text) {
		
		Float zakat = 0f;
		
		if( silver< 595	 ) zakat = 0f;
		else {
			zakat = silver /40;
		}
		
		//TODO  we should tell him the Nisab when it's O g
		
		text.setText(String.valueOf(zakat) + " g");
		
//		JOptionPane.showMessageDialog(null, zakat+"g");
		
	}

}
