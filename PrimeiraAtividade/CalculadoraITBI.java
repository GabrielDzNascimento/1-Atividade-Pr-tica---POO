package PrimeiraAtividade;

import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args){
      // Guardar valores
    String valorTransacaoString = JOptionPane.showInputDialog("Digite o valor de transação do imóvel");
    double valorTransacao = Double.parseDouble(valorTransacaoString);

    String valorVenalString = JOptionPane.showInputDialog("Digite o valor de venal");
    double valorVenal = Double.parseDouble(valorVenalString);

    String porcentagemITBIString = JOptionPane.showInputDialog("Digite a porcentagem do ITBI");
    double porcentagemITBI = Double.parseDouble(porcentagemITBIString);

    double valorITBI;
      // Cálculo do ITBI com base nos dados e condição
    if ( valorTransacao > valorVenal){
      valorITBI = valorTransacao * (porcentagemITBI / 100);
    } else {
      valorITBI = valorVenal * (porcentagemITBI / 100);
    }

    JOptionPane.showMessageDialog (null,"O valor do ITBI é: R$" + valorITBI);
    }
}

