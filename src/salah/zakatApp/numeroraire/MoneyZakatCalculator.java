package salah.zakatApp.numeroraire;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MoneyZakatCalculator {

	private Float numberDA, gold1Gram;
	
	public MoneyZakatCalculator(JTextField input1, JTextField input2) {
		

		if(input1.getText().isEmpty()  ){
			
			JOptionPane.showMessageDialog(null, " الرجاء إدخال قيمة الأموال الخاصة بك", "Message",
									JOptionPane.INFORMATION_MESSAGE);
			
			input1.requestFocus();
			numberDA = 0.0f;
			gold1Gram = 8300.00f;
		}
		else if( input2.getText().isEmpty() ){
			
			JOptionPane.showMessageDialog(null, " من فضلك إقرأ الملاحظة اسفل الشاشة ", "Message",
									JOptionPane.INFORMATION_MESSAGE);
			
			input2.requestFocus();
			input2.setText(String.valueOf(8300.00));
			
			if(  isNumeric(input1) ) numberDA  =Float.valueOf(input1.getText());
			else 					 numberDA = 0.0f;
			gold1Gram = 8300.00f;
		}
		else if(isNumeric(input1)==false) {

				JOptionPane.showMessageDialog(null, 
						"الرجاء إدخال أرقام صحيحة", "Typing Error", 
						JOptionPane.ERROR_MESSAGE);
				input1.setText("");
				input1.requestFocus(); // TODO  textFiled.requestFocus();
				
				numberDA = 0.0f;
				gold1Gram = 8300.00f;
				
			}
			else if(isNumeric(input2)==false){
					
					JOptionPane.showMessageDialog(null,
							"الرجاء إدخال أرقام صحيحة", "Typing Error",
							JOptionPane.ERROR_MESSAGE);
					input2.setText("8300.00");
					input2.requestFocus();
					
					numberDA = 0.0f;
					gold1Gram = 8300.00f;
					
				}
				else //if(input1.getText().isEmpty()==false && input2.getText().isEmpty()==false)
					{
						numberDA  =Float.valueOf(input1.getText());
						gold1Gram =Float.valueOf(input2.getText());
						
					}
		
	}
	
	private boolean isNumeric(JTextField e1){
		try		{ 
			Float.valueOf(e1.getText()); 
		}
		catch (NumberFormatException e)	{return false;}
		
		return true; 
	}


	public void calcule(JTextField text) {

		Float quorum = gold1Gram*85;
		Float zakat = 0f;
		
		if( numberDA < quorum ) zakat = 0f;
		else {
			zakat = numberDA / 40;
		}
		
		
		text.setText(String.valueOf(zakat) + " DA");
		
		
	}

}
