package PrimeiraAtividade;

import javax.swing.JOptionPane;

public class CalculadoraResistencias {

    public static void main(String[] args) {
        // Guardar valores
        String resistencia1String = JOptionPane.showInputDialog("Digite o valor da primeira resistência:");
        double resistencia1 = Double.parseDouble(resistencia1String);

        String resistencia2String = JOptionPane.showInputDialog("Digite o valor da segunda resistência:");
        double resistencia2 = Double.parseDouble(resistencia2String);

        String resistencia3String = JOptionPane.showInputDialog("Digite o valor da terceira resistência:");
        double resistencia3 = Double.parseDouble(resistencia3String);

        String resistencia4String = JOptionPane.showInputDialog("Digite o valor da quarta resistência:");
        double resistencia4 = Double.parseDouble(resistencia4String);

        double resistenciaEquivalente = resistencia1 + resistencia2 + resistencia3 + resistencia4;

        double maiorResistencia = resistencia1;
        double menorResistencia = resistencia1;

        // Condicionarl, cálculo e relatório das resistências
        if (resistencia2 > maiorResistencia) {
            maiorResistencia = resistencia2;
        }
        if (resistencia2 < menorResistencia) {
            menorResistencia = resistencia2;
        }
        if (resistencia3 > maiorResistencia) {
            maiorResistencia = resistencia3;
        }
        if (resistencia3 < menorResistencia) {
            menorResistencia = resistencia3;
        }
        if (resistencia4 > maiorResistencia) {
            maiorResistencia = resistencia4;
        }
        if (resistencia4 < menorResistencia) {
            menorResistencia = resistencia4;
        }
        JOptionPane.showMessageDialog(null, 
            "Resistência Equivalente: " + resistenciaEquivalente + " Ohms\n" +
            "Maior Resistência: " + maiorResistencia + " Ohms\n" +
            "Menor Resistência: " + menorResistencia + " Ohms"
        );
    }
}