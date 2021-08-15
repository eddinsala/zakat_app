package salah.zakatApp.betail;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CattleZakatCalculator {
	
	private int mySheeps, myCamels, myCows;
	
	public CattleZakatCalculator(JTextField input1, JTextField input2 , JTextField input3) {

		if(input1.getText().isEmpty() || input2.getText().isEmpty() || input3.getText().isEmpty()){
			
			JOptionPane.showMessageDialog(null, " الرجاء ملأ خانات ممتلكات المزكي أو وضع 0", "Message",
									JOptionPane.INFORMATION_MESSAGE);
			mySheeps = 0;
			myCamels = 0;
			myCows   = 0;
		}
		else if(isNumeric(input1)==false) {

				JOptionPane.showMessageDialog(null, 
						"الرجاء إدخال أرقام صحيحة", "Typing Error", 
						JOptionPane.ERROR_MESSAGE);
				input1.setText("");
				input1.requestFocus(); // TODO  textFiled.requestFocus();
				
				mySheeps = 0;
				myCamels = 0;
				myCows   = 0;
				
			}
			else if(isNumeric(input2)==false){
					
					JOptionPane.showMessageDialog(null,
							"الرجاء إدخال أرقام صحيحة", "Typing Error",
							JOptionPane.ERROR_MESSAGE);
					input2.setText("");
					input2.requestFocus();
					
					mySheeps = 0;
					myCamels = 0;
					myCows   = 0;
					
				}
			else if(isNumeric(input3)==false){
				
				JOptionPane.showMessageDialog(null,
						"الرجاء إدخال أرقام صحيحة", "Typing Error",
						JOptionPane.ERROR_MESSAGE);
				input3.setText("");
				input3.requestFocus();
				
				mySheeps = 0;
				myCamels = 0;
				myCows   = 0;
				
			}
			else //if(input1.getText().isEmpty()==false && input2.getText().isEmpty()==false)
				{
						mySheeps = Integer.valueOf(input1.getText());
						myCamels = Integer.valueOf(input2.getText());
						myCows   = Integer.valueOf(input3.getText());
						
				}

		
		
		
		
	}

	private boolean isNumeric(JTextField e1){
		try		{ 
			Integer.valueOf(e1.getText()); 
		}
		catch (NumberFormatException e)	{return false;}
		
		return true; 
	}
	
	public void calculeSheeps(JTextField TextOut) {
		
		int zakat = 0;
		
		if( mySheeps < 40 )		zakat  = 0;
		else if( mySheeps < 121 )		zakat = 1;
		else if( mySheeps < 201 )		zakat = 2;
		else if ( mySheeps < 400)		zakat = 3;
		else {
//			zakat =4;
//			int temp = mySheeps - 400;
//			// TODO  need to check it
//			while( temp -100 >= 0 ) {
//				zakat++;
//				temp -= 100 ;
//			}

			zakat = mySheeps/100;
			
		}
		
		
		TextOut.setText(String.valueOf( zakat ));
		
	}
	
	
	public void calculeCows(JTextField cowTextOut, JTextField smallCowTextOut ) {

		int T = 0; // cow kids
		int Mo = 0; // adult cow
//		boolean orCase = false;
		
		if( myCows < 30 )		T = Mo  = 0;
		else if( myCows < 40 )		T = 1;
		else if( myCows < 60 )		Mo  = 1;
//		else if( myCows < 70 )		T = 2;
//		else if( myCows < 80 )		T = Mo  = 1;
//		else if( myCows < 90 )		Mo  = 2;
//		else if( myCows < 100 )		T = 3;
//		else if( myCows < 120 )	{	Mo = 1;  T = 2;	 }  //or Mo = 2, T = 1 
//		else if ( myCows < 130)		T = 4; 				// or Mo  = 3
		else {
			
			// now: for every 30 -> 1T
			// 	    for every 40 -> 1Mo
			
			
			int convertedNb =  (myCows/10 )*10; // convert: 68, 62 -> 60 ...
			
			// TODO  for now we're not interested in this:
//			if(  convertedNb % 30 ==0 &&  convertedNb % 40 ==0 ) { // ex : 120
//				// not both of them , just one.
//				T = convertedNb / 30;
//				// OR : 
//				Mo = convertedNb / 40;
//				orCase = true;
//			}
//			else
			if( convertedNb % 30 ==0 ) { //ex : 120, 150..
				T = convertedNb / 30;
			}
			else if( convertedNb % 40 ==0 ) { //ex : 120, 160..
				Mo = convertedNb / 40;
			}
			else { // Mo + T 
//				both = true;
				
				int i = 1, j = 1;
				boolean found = false;
				
				while(! found) {
					
					j = 1;
					while( (i*30 + j*40) <= convertedNb ) {
						if( (i*30 + j*40) == convertedNb ) {
							found = true;
							T = i;
							Mo = j;
							//System.out.println("I am insed the test of the loop");
						}
						j++;
						//System.out.println("I am insed  the loop");
					}
					i++;
					//System.out.println("I am outside the loop");
				}
			}
		}

		
		// TODO take care of OR CASE
		
		
		smallCowTextOut.setText(String.valueOf(T));
		cowTextOut.setText(String.valueOf(Mo));
		
//		return orCase;
		
	}
	
	
	public void calculeCamels(JTextField sheepTextOut, JTextField makhadTextOut, JTextField labonTextOut,
							JTextField  hikaTextOut, JTextField jid3aTextOut ) {

		
		int C = 0; // sheeps
		int M = 0; // camel girl Makhad
		int L = 0; // camel girl Labon
		int H = 0; // camel Hika
		int J = 0; // camel Jid3a
		
		
		
		
		
		
		
		if( myCamels < 5 )		C = M = L = H = J = 0;
		else if( myCamels < 25 )	{
			// for every 5 camels -> 1 sheep
			C = myCamels / 5;
		}
		else if( myCamels < 36 )	{
			M  = 1;
		}
		else if( myCamels < 46 )	{
			L = 1;
		}
		else if( myCamels < 61 )	{
			H = 1;
		}
		else if( myCamels < 76 )	{
			J = 1;
		}
		else if( myCamels < 91 )	{
			L = 2;
		}
		else if( myCamels < 121 )	{
			H = 2;
		}
		else {
			
			// pour 50 -> H
			// pour 40 -> L
			
			int convertedNb =  (myCamels/10 )*10; 
			
//			if(  convertedNb % 50 ==0 &&  convertedNb % 40 ==0 ) { 
//				// just one.
//				H = convertedNb / 50;
//				// 	OR :
//				L = convertedNb / 40;
//			}
//			else 
			if( convertedNb % 50 ==0 ) {
				H = convertedNb / 50;
			}
			else if( convertedNb % 40 ==0 ) { 
				L = convertedNb / 40;
			}
			else { // Mo + T 
//				both = true;
				
				
				int i = 1, j = 1;
				boolean found = false;
				
				while(! found) {
					
					j = 1;
					while( (i*50 + j*40) <= convertedNb ) {
						if( (i*50 + j*40) == convertedNb ) {
							found = true;
							H = i;
							L = j;
							//System.out.println("I am insed the test of the loop");
						}
						j++;
						//System.out.println("I am insed  the loop");
					}
					i++;
					//System.out.println("I am outside the loop");
				}
				
				
				
			}
			
			
		}
		
		
		
		
		//sheepTextOut, makhadTextOut ,labonTextOut ,hikaTextOut , jid3aTextOut
		
		int s = Integer.parseInt( sheepTextOut.getText() ) + C;
		
		sheepTextOut.setText( String.valueOf(s) );
		makhadTextOut.setText(String.valueOf(M));
		labonTextOut.setText(String.valueOf(L));
		hikaTextOut.setText(String.valueOf(H));
		jid3aTextOut.setText(String.valueOf(J));
		 
		

		
		
	}
	
}
