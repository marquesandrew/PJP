package org.example.modelo;

import java.util.ArrayList;
import java.util.List;

public class PacoteViagem {
    private String destino;
    private String duracao;
    private double preco;
    private List<String> atividades;

    public PacoteViagem(String destino, String duracao, double preco, List<String> atividades) {
        this.destino = destino;
        this.duracao = duracao;
        this.preco = preco;
        this.atividades = new ArrayList<>();
    }

    public void getDetalhesPacoteViagem{
        System.out.println("Pacote de Viagem:");
        System.out.println("Destino: " + this.destino + " - Duração: " + " - Valor: " + this.preco);
        System.out.println("Atividades durante a viagem: " + this.atividades);
    }

    public String getTipoPacote(){

    }
}