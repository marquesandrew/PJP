package org.example.modelo;

public class Pais {
    private String nome;
    private int dimensao;
    private int populacao;

    public Pais(String nome, int dimensao, int populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public int getDimensao() {
        return dimensao;
    }

    public int getPopulacao() {
        return populacao;
    }
}
