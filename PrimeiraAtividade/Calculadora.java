
package PrimeiraAtividade;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        // guardando valores
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        double valorProduto = leitor.nextDouble();
        System.out.println("Digite a porcentagem de desconto ( ex 15 ):");
        double porcentagemDesconto = leitor.nextDouble();
        double valorDesconto = valorProduto * (porcentagemDesconto / 100);
        // cálculo do preço e representação final com resultado
        double precoFinal = valorProduto - valorDesconto;
        System.out.println("O valor do desconto é " + valorDesconto);
        System.out.println("O preço final é " + precoFinal);
        leitor.close();
    }
}

