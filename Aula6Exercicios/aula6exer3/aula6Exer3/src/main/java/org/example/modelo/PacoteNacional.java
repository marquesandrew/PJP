package org.example.modelo;

import java.util.List;

public class PacoteNacional extends PacoteViagem{
    private boolean transporteRodoviario;

    public PacoteNacional(String destino, int duracao, double preco, List<String> atividades) {
        super(destino, duracao, preco, atividades);
    }

    @Override
    public String getTipoPacote(){
        return "Nacinoal";

    }
}
