package org.example.modelo;

import java.util.List;

public class PacoteNacional extends PacoteViagem{
    private boolean transporteRodoviario;


    public PacoteNacional(String destino, int duracao, double preco, List<String> atividades,boolean transporteRodoviario) {
        super(destino, duracao, preco, atividades);
        this.transporteRodoviario = transporteRodoviario;
    }

    @Override
    public String getTipoPacote(){
        return "Nacinoal";

    }

    public boolean isTransporteRodoviario() {
        return transporteRodoviario;
    }

    @Override
    public void getDetalhesPacote(){
        super.getDetalhesPacote();
        System.out.println("Transporte rodoviario? " + (transporteRodoviario ? "Sim" : "Não"));
        System.out.println();
    }
}
