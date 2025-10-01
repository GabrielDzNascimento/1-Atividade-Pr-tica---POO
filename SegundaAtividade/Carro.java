package SegundaAtividade;

public class Carro extends Veiculo {
    public int numeroPortas;

    @Override
    public String informacoesVeiculo(){
            return "Tipo: Carro" + 
                   "\nMarca: " + Marca + 
                   "\nModelo " + Modelo +
                   "\nAno " + getAno() +
                   "\nNumero de Portas " + numeroPortas;
    }
}
