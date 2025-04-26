package org.example.modelo;

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
        System.out.println("Continente: "+this.nome);
        for (Pais pais: paises){
            System.out.println((pais.getNome()));
        }
    }

    public void getDimensaoTotalContinente(){
        int dimensaoTotal=0;
        for (Pais pais: paises){
            dimensaoTotal += pais.getDimensao();
        }
        System.out.println("A dimensão total do continente "+this.nome+"é: "+ dimensaoTotal);
    }
}
