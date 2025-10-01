package SegundaAtividade;


public class Moto extends Veiculo {
    
    private int cilindrada;
    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String informacoesVeiculo(){
            return "Tipo: Moto" + 
                   "\nMarca: " + Marca + 
                   "\nModelo " + Modelo +
                   "\nAno " + getAno() +
                   "\nCilindrada " + getCilindrada() + "cc"; 
    }
}


