/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.modelo;

import java.math.BigDecimal;

/**
 *
 * @author Usuario
 */
public abstract class Equipamento {
    private String nome;
    private String descricao;
    private boolean instaladoDeFabrica;

    public Equipamento(String nome, String descricao, boolean instaladoDeFabrica) {
        this.nome = nome;
        this.descricao = descricao;
        this.instaladoDeFabrica = instaladoDeFabrica;
    }

    
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isInstaladoDeFabrica() {
        return instaladoDeFabrica;
    }
    
    public abstract BigDecimal getPreco();
    
    @Override
    public String toString(){
        return nome + " - " + descricao;
    }
}
