package org.example.modelo;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Continente {
    private String nome;
    private List<Pais> paises = new ArrayList<>();

    DecimalFormat formatoDecimal = new DecimalFormat("#,###");
    int populacaoTotal = 0;
    Double dimensaoTotal=0.0;

    public Continente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addPaises(Pais pais){
        this.paises.add(pais);
    }

    public void showPaises(){
        System.out.println("O continente " + this.nome + " possui os seguintes países: ");
        for (Pais pais: paises){
            System.out.print((pais.getNome())+"\t");
        }
        System.out.println();
    }

    public void getDimensaoTotalContinente(){
        for (Pais pais: paises){
            dimensaoTotal += pais.getDimensao();
        }
        System.out.println("A dimensão total do continente " + this.nome + " é aproximadamente: " + formatoDecimal.format(dimensaoTotal) + " km²");
    }

    public void getPopulacaoTotalContinente(){
        for (Pais pais: paises){
            populacaoTotal += pais.getPopulacao();
        }
        System.out.printf("A população total do continente " + this.nome + " é aproximadamente: %,2d", populacaoTotal);
    }

    public void getDensidadePopulacional(){
        for (Pais pais: paises){
            dimensaoTotal += pais.getDimensao();
            populacaoTotal += pais.getPopulacao();
        }
        Double densidadePopulacionalContinente = this.populacaoTotal/this.dimensaoTotal;
        System.out.println("A densidade populacional do continente: " + this.nome + " é de: " + formatoDecimal.format(densidadePopulacionalContinente) + "habitantes por km²");
    }

    public void getPaisMaiorPopulacao(){
        int maiorPopulacao = 0;
        String paisMaiorPopulacao = null;
        for (Pais pais: paises){
            if (maiorPopulacao < pais.getPopulacao()){
                maiorPopulacao = pais.getPopulacao();
                paisMaiorPopulacao = pais.getNome();
            }
        }
        System.out.println("O país com maior população do continente " + this.nome + " é: " + paisMaiorPopulacao);
    }

    public void getPaisMenorPopulacao(){
        int menorPopulacao = Integer.MAX_VALUE;
        String paisMenorPopulacao = null;
        for (Pais pais: paises){
            if (menorPopulacao > pais.getPopulacao()){
                menorPopulacao = pais.getPopulacao();
                paisMenorPopulacao = pais.getNome();
            }
        }
        System.out.println("O país com menor população do continente " + this.nome + " é: " + paisMenorPopulacao);
    }

    public void getPaisMaiorDimensao(){
        double maiorDimensao=0.0;
        String paisMaiorDimensao = null;
        for (Pais pais: paises){
            if (maiorDimensao < pais.getDimensao()){
                maiorDimensao = pais.getDimensao();
                paisMaiorDimensao=pais.getNome();
            }
        }
        System.out.println("O país com maior dimensão do continente " + this.nome + " é: " + paisMaiorDimensao);
    }

    public void getPaisMenorDimensao(){
        double menorDimensao = Double.MAX_VALUE;
        String paisMenorDimensao = null;
        for (Pais pais: paises){
            if (menorDimensao > pais.getDimensao()){
                menorDimensao = pais.getDimensao();
                paisMenorDimensao=pais.getNome();
            }
        }
        System.out.println("O país com menor dimensão do continente " + this.nome + " é: " + paisMenorDimensao);
    }

    public void getRazao(){
        double maiorPaisDimensao=0.0;
        double menorPaisDimensao= Double.MAX_VALUE;
        double razao =0.0;
        String maiorNome = null;
        String menorNome = null;
        for (Pais pais: paises){
            if (maiorPaisDimensao < pais.getDimensao()){
                maiorNome = pais.getNome();
                maiorPaisDimensao = pais.getDimensao();
            }
            if (menorPaisDimensao > pais.getDimensao()){
                menorNome = pais.getNome();
                menorPaisDimensao = pais.getDimensao();
            }
        }
        razao = maiorPaisDimensao/menorPaisDimensao;
        System.out.println("A razão é: " + razao + " entre o pais " + maiorNome + " que é o maior e" + " o país " + menorNome + " que é o menor país.");
    }
}