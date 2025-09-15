package PrimeiraAtividade;

import javax.swing.JOptionPane;

public class AvaliacaoEscolar {
    public static void main(String[] args){
        // Guardando os valores sobre as notas
        String notaProva1String = JOptionPane.showInputDialog("Digite a nota da sua primeira prova");
        double notaProva1 = Double.parseDouble(notaProva1String);

        String notaProva2String = JOptionPane.showInputDialog("Digite a nota da sua segunda prova");
        double notaProva2 = Double.parseDouble(notaProva2String);  
        
        String notaTrabalhoString = JOptionPane.showInputDialog("Digite a nota do seu trabalho");
        double notaTrabalho = Double.parseDouble(notaTrabalhoString);        

        double media;
        // cálculo da média e condicional para caso for aprovado/reprovado
        media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        if (media >= 6) {
            JOptionPane.showMessageDialog (null,"O valor da sua média é: " + media);
            JOptionPane.showMessageDialog (null,"Parabéns você foi aprovado!");  
        } else {
            JOptionPane.showMessageDialog (null,"O valor da sua média é: " + media);
            JOptionPane.showMessageDialog (null,"Sinto muito, você foi reprovado.");              
        }
    }
}
