package jOptionPane;

import javax.swing.JOptionPane;

public class JOptionPane2 {

	public static void main(String[] args) {
		
		
		int pregunta=JOptionPane.showConfirmDialog(null, "¿Quieres 50 euro o no");
		
		if(pregunta==JOptionPane.YES_OPTION) {
			
			JOptionPane.showMessageDialog(null, "Aqui tienes ---50€");
			
		}else if(pregunta==JOptionPane.NO_OPTION) {
			
			JOptionPane.showMessageDialog(null, "OK... de todos modos eran falsos  ");
			
		}else {
			JOptionPane.showMessageDialog(null, "Si,damelo ahora");
		}
		
		
		// TODO Auto-generated method stub

	}

}
