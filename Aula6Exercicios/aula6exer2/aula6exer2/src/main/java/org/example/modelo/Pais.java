package org.example.modelo;



public class Pais {
    private String nome;
    private Double dimensao;
    private int populacao;


    public Pais(String nome, Double dimensao, int populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public int getPopulacao() {
        return populacao;
    }
}
