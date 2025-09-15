package PrimeiraAtividade;

import javax.swing.JOptionPane;

public class Aposentadoria {
    public static void main(String[] args){
        // Declaração de variáveis
        String sexo = JOptionPane.showInputDialog("Digite F para Femino e M para Masculino");
        String idadeString = JOptionPane.showInputDialog("Digite sua idade");
        double idade = Double.parseDouble (idadeString);
        String contribuicaoString = JOptionPane.showInputDialog("Digite quantos anos de contribuição você tem");
        double contribuicao = Double.parseDouble (contribuicaoString);

        // Condicional sobre qual o Sexo da pessoa ( E logo após o cálculo que determina a aposentadoria )
        if (sexo.equalsIgnoreCase("F")){
            if (idade >= 62 && contribuicao >= 15 || contribuicao >= 30) {
                JOptionPane.showMessageDialog(null,"Parabéns, você já pode se aposentar!");
            } else {
            double idademinima = 62 - idade;
            double contribuicaominima = 30 - contribuicao;

                String mensagem = "Falta para você se aposentar:\n";
                if (idademinima > 0){
                    mensagem += idademinima + " ano(s) de idade. \n";
                }
                if (contribuicaominima > 0) {
                    mensagem += contribuicaominima + " ano(s) de contribuição";
                }
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
        else if (sexo.equalsIgnoreCase("M")){
            if (idade >= 65 && contribuicao >= 15 || contribuicao >= 35) {
                JOptionPane.showMessageDialog(null,"Parabéns, você já pode se aposentar!");
            } else {
            double idademinima = 65 - idade;
            double contribuicaominima = 35 - contribuicao;

                String mensagem = "Falta para você se aposentar:\n";
                if (idademinima > 0){
                    mensagem += idademinima + " ano(s) de idade. \n";
                }
                if (contribuicaominima > 0) {
                    mensagem += contribuicaominima + " ano(s) de contribuição";
                }
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
    }
}


    
