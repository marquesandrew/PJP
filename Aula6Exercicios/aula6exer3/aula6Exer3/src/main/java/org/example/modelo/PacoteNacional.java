package org.example.modelo;

import java.util.List;

public class PacoteNacional extends PacoteViagem{
    private boolean transporteRodoviario;
    private String estadoDestino;

    public PacoteNacional(String destino, int duracao, double preco, List<String> atividades,boolean transporteRodoviario,String estadoDestino) {
        super(destino, duracao, preco, atividades);
        this.transporteRodoviario = transporteRodoviario;
        this.estadoDestino = estadoDestino;
    }

    @Override
    public String getTipoPacote(){
        return "Nacinoal";

    }

    public boolean isTransporteRodoviario() {
        return transporteRodoviario;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }

    @Override
    public void getDetalhesPacote(){
        super.getDetalhesPacote();
        System.out.println("Transporte rodoviario? " + (transporteRodoviario ? "Sim" : "Não"));
    }
}
