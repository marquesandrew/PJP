/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author Usuario
 */
public class Venda {
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate data;
    private BigDecimal valorTotal;
    List<EquipamentoOpcional> opcionaisEscolhidos;

    public Venda(Cliente cliente, Veiculo veiculo, LocalDate data, BigDecimal valorTotal,List<EquipamentoOpcional> opcionaisEscolhidos) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.data = data;
        this.valorTotal = calcularTotal();
        this.opcionaisEscolhidos = opcionaisEscolhidos;
    }
    
    @Override
    public String toString(){
        String opEscolhidos="";
        for (EquipamentoOpcional epEscolhidos: opcionaisEscolhidos){
            opEscolhidos += epEscolhidos.toString();                    
        }
        return 
                "Cliente: " + cliente + "\n" +
                "Veiculo: " + veiculo + "\n" +
                "Data: " + data + "\n" +
                opEscolhidos +
                "Valor: " + valorTotal + "\n";                
    }
    
    public BigDecimal calcularTotal(){
        return veiculo.calcularValorComOpcionais(opcionaisEscolhidos);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LocalDate getData() {
        return data;
    }

    public List<EquipamentoOpcional> getOpcionaisEscolhidos() {
        return opcionaisEscolhidos;
    }
    
}
