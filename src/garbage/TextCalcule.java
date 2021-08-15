package garbage;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextCalcule {
	
//	static boolean found = false;
//	static int T = 0, Mo = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	/*	int mySheeps =0;
		int zakatSheep = 0;
		
		System.out.println("How many sheeps do you have ?");
		mySheeps = sc.nextInt();
		
		if( mySheeps < 40 )		zakatSheep  = 0;
		else if( mySheeps < 121 )		zakatSheep = 1;
		else if( mySheeps < 201 )		zakatSheep = 2;
		else if ( mySheeps < 400)		zakatSheep = 3;
		else {
			zakatSheep =4;
			int temp = mySheeps - 400;
			
			while( temp -100 >= 0 ) {
				zakatSheep++;
				temp -= 100 ;
			}
			
		}
			
		System.out.println("You should give " + zakatSheep + " sheeps for zakat of health");
	*/
		
/////////////////////////////////////////////////////////////////////////////////////////////
	/*	int myCows; // user cows
		int T = 0; // cow kids
		int Mo = 0; // adult cow
		boolean both = false; // test if the user should give only T or Mo, or both of them
		
		System.out.println("How many cows do you have ?");
		myCows = sc.nextInt();
		
		
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
			
			if(  convertedNb % 30 ==0 &&  convertedNb % 40 ==0 ) { // ex : 120
				// TODO not both of them , just one, check it out later!!!
				T = convertedNb / 30;
				Mo = convertedNb / 40;
			}
			else if( convertedNb % 30 ==0 ) { //ex : 120, 150..
				T = convertedNb / 30;
			}
			else if( convertedNb % 40 ==0 ) { //ex : 120, 160..
				Mo = convertedNb / 40;
			}
			else { // Mo + T 
				both = true;
				
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

		if( T==0 && Mo==0 ) 
			System.out.println("There is no Zakat for you");
		else if( both  ) {
			System.out.println("You should give " + T + " cows kids, ");
			System.out.print("AND " + Mo + " adult cows for Zakat of health");
		}
		else {
//			if ( T == 0)
//				System.out.print("You should give " + Mo + " adult cows.");
//			if ( Mo == 0 )
//				System.out.println("You should give " + T + " cows kids. ");
//			else
			System.out.println("You should give " + T + " cows kids, "
							+"OR " + Mo + " adult cows for Zakat of health");
		}
	*/
/////////////////////////////////////////////////////////////////////////////////////////////
		
		
		int myCamels; // user camels
		int C = 0; // sheeps
		int M = 0; // camel girl Makhad
		int L = 0; // camel girl Labon
		int H = 0; // camel Hika
		int J = 0; // camel Jid3a
		boolean both = false; // test if the user should give only T or Mo, or both of them
		
		System.out.println("How many camels do you have ?");
		myCamels = sc.nextInt();
		
		
		
		
		
		
		
		// TODO  maybe we don't need to initialize all of them to 0 every time it's IF ELSE system !!
		
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
			
			if(  convertedNb % 50 ==0 &&  convertedNb % 40 ==0 ) { 
				// just one.
				H = convertedNb / 50;
				// 	OR :
				L = convertedNb / 40;
			}
			else if( convertedNb % 50 ==0 ) {
				H = convertedNb / 50;
			}
			else if( convertedNb % 40 ==0 ) { 
				L = convertedNb / 40;
			}
			else { // Mo + T 
				both = true;
				
				
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
		
		
		
		
		
	
		
		System.out.println(C + " sheeps + "+ M + " Makhad + " + L + " Labon + " + H + " Hika + " + J + " Jid3a." );
		
		
		
		sc.close();
	}
	
	
	

}
