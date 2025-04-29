package org.example.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class PacoteViagem {
    private String destino;
    private int duracao;
    private double preco;
    private List<String> atividades;

    public PacoteViagem(String destino, int duracao, double preco, List<String> atividades) {
        this.destino = destino;
        this.duracao = duracao;
        this.preco = preco;
        this.atividades = atividades;
    }

    public void getDetalhesPacote(){
        System.out.println("Pacote de Viagem:");
        System.out.println("Destino: " + this.destino + " - Duração: " + this.duracao + " dia(s) - Valor: " + this.preco);
        System.out.println("Atividades durante a viagem: " + this.atividades);
    }

    public abstract String getTipoPacote();
}