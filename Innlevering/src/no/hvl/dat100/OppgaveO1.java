package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		{
			
			double tax = 0;
			int income = Integer.parseInt(showInputDialog("Income"));
			
			if (income<=190349) {
				tax = 0;
			}
			 
			else if (income>=190350 && income <=267899) {
				tax = income*(1-0.017);
			}
			
			else if (income>=267900 && income<=643799) {
				tax = income*(1-0.04);
			}
			
			else if (income>=643800 && income<=969199) {
				tax = income*(1-0.134);
			}
			
			else if (income>=969200 && income<=1999999) {
				tax = income*(1-0.164);
			}
			
			else {
				tax = income*(1-0.174);
			}
			
			showMessageDialog(null,"Income after tax: " + tax);
			
			}

	} 
		
		
	
	}


