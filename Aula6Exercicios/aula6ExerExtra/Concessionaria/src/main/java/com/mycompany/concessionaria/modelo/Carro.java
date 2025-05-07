/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.modelo;

/**
 *
 * @author Usuario
 */
public class Carro {
    private String marca;
    private String modelo;
    private Date anoFabricacao;
    private double precoBase;
    private List<Equipamento> equipamentos;

    public Carro(String marca, String modelo, Date anoFabricacao, double precoBase, List equipamentos) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.precoBase = precoBase;
        this.equipamentos = equipamentos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public List getEquipamentos() {
        return equipamentos;
    }
        
}
