package org.example.modelo;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises = new ArrayList<>();

    public Continente(String nome) {
        this.nome = nome;
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
        DecimalFormat formatoDecimal = new DecimalFormat("#,###");
        Double dimensaoTotal=0.0;
        for (Pais pais: paises){
            dimensaoTotal += pais.getDimensao();
        }
        System.out.println("A dimensão total do continente " + this.nome + "é aproximadamente: " + formatoDecimal.format(dimensaoTotal) + " km²");
    }

    public void getPopulacaoTotalContinente(){
        int populaçãoTotal = 0;
        for (Pais pais: paises){
            populaçãoTotal += pais.getPopulacao();
        }
        System.out.printf("A população total do continente " + this.nome + "é aproximadamente: %,2d", populaçãoTotal);
    }
}
