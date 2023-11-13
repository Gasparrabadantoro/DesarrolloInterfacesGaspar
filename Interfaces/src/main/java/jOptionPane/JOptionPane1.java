package jOptionPane;

import javax.swing.JOptionPane;

public class JOptionPane1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int respuesta=JOptionPane.showConfirmDialog(null, "¿Te gusta comer jamón?");
		
	
		if(respuesta==JOptionPane.YES_OPTION) {
			
			System.out.println("A mi también me gusta comer jamón");
			
		}else if(respuesta==JOptionPane.NO_OPTION) {
			
			System.out.println("No tienes ni idea de la vida ");
		}else {
			
			System.out.println("Podrias haberme contestado al menos antes de irte...");
		}

	}

}
