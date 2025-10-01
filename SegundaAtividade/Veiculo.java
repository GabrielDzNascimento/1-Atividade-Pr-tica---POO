package SegundaAtividade;

public abstract class Veiculo {
    public String Marca;
    public String Modelo;
    private int ano;
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public abstract String informacoesVeiculo(); 

}
