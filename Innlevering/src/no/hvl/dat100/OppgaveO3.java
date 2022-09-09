package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		 int tall = Integer.parseInt(showInputDialog("N!: "));
	        int resultat = 1;
	    
	        while(tall >= 1){
	            resultat = tall * resultat;
	            tall--;
	        }
	        showMessageDialog(null, resultat);

	}

}
