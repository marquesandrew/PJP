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
public class EquipamentoOpcional extends Equipamento {
    private BigDecimal preco;
    private boolean disponivelEstoque;

    public EquipamentoOpcional(BigDecimal preco, boolean disponivelEstoque, String nome, String descricao, boolean instaladoDeFabrica) {
        super(nome, descricao, instaladoDeFabrica);
        this.preco = preco;
        this.disponivelEstoque = disponivelEstoque;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public boolean isDisponivelEstoque() {
        return disponivelEstoque;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "[Opcional - Preço: R$ " + preco +
                ", Disponível: " + disponivelEstoque + "]";
    }
}
