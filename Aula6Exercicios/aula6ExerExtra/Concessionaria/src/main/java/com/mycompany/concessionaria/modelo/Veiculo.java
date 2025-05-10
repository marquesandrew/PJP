/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private Year anoFabricacao;
    private int km;
    private BigDecimal preco;
    private String chassi;
    private boolean disponivel;
    private List<EquipamentoDeSerie> equipamentosDeSerie;
    private List<EquipamentoOpcional> equipamentosOpcional;
        

     public Veiculo(String marca, String modelo, Year anoFabricacao, int km, BigDecimal preco, String chassi, boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.km = km;
        this.preco = preco;
        this.chassi = chassi;
        this.disponivel = disponivel;
    }
    
    public Veiculo(String marca, String modelo, Year anoFabricacao, int km, BigDecimal preco, String chassi, boolean disponivel, List<EquipamentoDeSerie> equipamentosDeSerie, List<EquipamentoOpcional> equipamentosOpcional) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.km = km;
        this.preco = preco;
        this.chassi = chassi;
        this.disponivel = disponivel;
        this.equipamentosDeSerie = equipamentosDeSerie;
        this.equipamentosOpcional = equipamentosOpcional;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Year getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getKm() {
        return km;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getChassi() {
        return chassi;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public List<EquipamentoDeSerie> getEquipamentosDeSerie() {
        return equipamentosDeSerie;
    }

    public List<EquipamentoOpcional> getEquipamentosOpcional() {
        return equipamentosOpcional;
    }

    public void adicionarEquipamentoDeSerie(EquipamentoDeSerie equipamentoDeSerie){
        equipamentosDeSerie.add(equipamentoDeSerie);
    }       
    
    public void adicionarEquipamentoOpcional(EquipamentoOpcional equipamentoOpcional){
        equipamentosOpcional.add(equipamentoOpcional);
    }
    
    @Override
    public String toString(){
        String eqSeries="";
        for (EquipamentoDeSerie eqSerie : equipamentosDeSerie){
            eqSeries += "\n" + eqSerie.toString();
        }
        String eqOpcionais="";
        for (EquipamentoOpcional eqOpcional: equipamentosOpcional){
            eqOpcionais += "\n " + eqOpcional.toString();
        }
        return
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano Fabricação: " + anoFabricacao + "\n" +
                "Kilometragem: " + km + "\n" +
                "Preço: " + preco + "\n" +
                "Chassi: " + chassi + "\n" +
                "Disponível para venda? " + disponivel + "\n" +
                "Equipamentos de série: " + "\n" +
                eqSeries + 
                "Equipamentos Opcionais: " + "\n" +
                eqOpcionais;
    }   
    
    public BigDecimal calcularValorComOpcionais(List<EquipamentoOpcional> opcionaisSelecionados){
        BigDecimal valorTotalVeiculoMaisOpcionais= BigDecimal.ZERO;
        
        for (EquipamentoOpcional equipamentoopcional: opcionaisSelecionados){
            valorTotalVeiculoMaisOpcionais = valorTotalVeiculoMaisOpcionais.add(equipamentoopcional.getPreco());
        }
        return valorTotalVeiculoMaisOpcionais;
    }
}
