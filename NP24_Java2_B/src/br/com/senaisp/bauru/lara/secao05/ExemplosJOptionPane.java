package br.com.senaisp.bauru.lara.secao05;

import javax.swing.JOptionPane;

public class ExemplosJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para sim ou não
        boolean resp = JOptionPane
        		.showConfirmDialog(null, 
        				           "Você quer mesmo participar?",
        				           "Participação",
        				           JOptionPane.YES_NO_CANCEL_OPTION,
        				           JOptionPane.QUESTION_MESSAGE)
         	 == JOptionPane.YES_OPTION;
        //Para entrada de texto com valor padrão
        String msg01 = (String) JOptionPane.showInputDialog(null,
        		       "Esta é uma pergunta?",
        		       "Título da Caixa de Diálogo",
        		       JOptionPane.INFORMATION_MESSAGE,
        		       null,
        		       null,
        		       "Digite algo aqui.");
	}

}
