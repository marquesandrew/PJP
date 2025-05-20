/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.model;

import java.math.BigDecimal;

/**
 *
 * @author Usuario
 */
public class EquipamentoDeSerie extends Equipamento{
    private String categoria; // exemplo: "Conforto", "Segurança", "Tecnologia"
    private boolean essencial; // indica se é considerado obrigatório (ex: airbag)

    public EquipamentoDeSerie(String categoria, boolean essencial, String nome, String descricao, boolean instaladoDeFabrica) {
        super(nome, descricao, instaladoDeFabrica);
        this.categoria = categoria;
        this.essencial = essencial;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isEssencial() {
        return essencial;
    }
    
    @Override
    public BigDecimal getPreco(){
        return BigDecimal.ZERO;
    }
    
    @Override
    public String toString(){
        return super.toString() + " [Série - Categoria: " + categoria + ", Essencial: " + essencial + "]";
    }
}
