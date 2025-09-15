package PrimeiraAtividade;

import javax.swing.JOptionPane;

public class Tabuada {

    public static void main(String[] args) {
        // Guardar Valor
        String numeroString = JOptionPane.showInputDialog("Escolha um número de 1 a 10 para ver sua tabuada");
       int numero = Integer.parseInt(numeroString);
        String resultado = "Tabuada do " + numero + ":\n";

        // Condicional e Tabuada gerada e adicionada ao resultado final
        for (int i = 1; i <= 10; i++){
            int multiplicacao = numero * i;
            resultado += numero + " x " + i + " = " + multiplicacao + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);

    }
}