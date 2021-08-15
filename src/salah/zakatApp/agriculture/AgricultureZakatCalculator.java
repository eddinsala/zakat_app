package salah.zakatApp.agriculture;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AgricultureZakatCalculator {
	
	private Float grain, others;

	public AgricultureZakatCalculator(JTextField input1, JTextField input2) {

		
		if(input1.getText().isEmpty() || input2.getText().isEmpty() ){
			
			JOptionPane.showMessageDialog(null, " الرجاء ملأ خانات ممتلكات المزكي أو وضع 0", "Message",
									JOptionPane.INFORMATION_MESSAGE);
			grain = 0.0f;
			others = 0.0f;
		}
		else if(isNumeric(input1)==false) {

				JOptionPane.showMessageDialog(null, 
						"الرجاء إدخال أرقام صحيحة", "Typing Error", 
						JOptionPane.ERROR_MESSAGE);
				input1.setText("");
				input1.requestFocus(); // TODO  textFiled.requestFocus();
				
				grain = 0.0f;
				others = 0.0f;
				
			}
			else if(isNumeric(input2)==false){
					
					JOptionPane.showMessageDialog(null,
							"الرجاء إدخال أرقام صحيحة", "Typing Error",
							JOptionPane.ERROR_MESSAGE);
					input2.setText("");
					input2.requestFocus();
					
					grain = 0.0f;
					others = 0.0f;
					
				}
				else //if(input1.getText().isEmpty()==false && input2.getText().isEmpty()==false)
					{
						grain  =Float.valueOf(input1.getText());
						others =Float.valueOf(input2.getText());
						
					}
		
		
	}
	
	private boolean isNumeric(JTextField e1){
		try		{ 
			Float.valueOf(e1.getText()); 
		}
		catch (NumberFormatException e)	{return false;}
		
		return true; 
	}
	
	public void calcule(JTextField textG, JTextField textV,  char c) {
		
		Float zakatGrain = 0f;
		Float zakatOthers = 0f;
		
		if( c =='n' ) {
			
			if( grain < 675 ) zakatGrain = 0f;
			else {
				zakatGrain = grain /10;
			}
			
			zakatOthers = others /10;
			
		}
		else if( c == 'a') {
			
			if( grain < 675 ) zakatGrain = 0f;
			else {
				zakatGrain = grain /20;
			}
			
			zakatOthers = others /20;
			
		}
		
		textG.setText( String.valueOf(zakatGrain)+ " Kg" );
		textV.setText( String.valueOf(zakatOthers)+ " Kg" );
		
		//JOptionPane.showMessageDialog(null, "grain = "+ zakatGrain + " Kg" +
			//							" || others = " + zakatOthers+ " kg");
		
	}

}
