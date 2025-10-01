package SegundaAtividade;

public class Main {
    public static void main(String[] args) {
        Moto minhaMoto = new Moto();
        minhaMoto.Marca = "Honda";
        minhaMoto.Modelo = "CBR 600";
        minhaMoto.setAno(2023);
        minhaMoto.setCilindrada(600);

        System.out.println("---INFORMAÇÕES DA MOTO---");
        System.out.println(minhaMoto.informacoesVeiculo());

        Carro meuCarro = new Carro();
        meuCarro.Marca = "Volkswagen";
        meuCarro.Modelo = "Golf";
        meuCarro.numeroPortas = 4;

        meuCarro.setAno(2021);

        System.out.println("\n---INFORMAÇÕES DO CARRO---");
        System.out.println(meuCarro.informacoesVeiculo());
    }
}
