/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    List<Venda> compras;

    public Cliente(String nome, String cpf, String telefone, String email, List<Venda> compras) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.compras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public List<Venda> getCompras() {
        return compras;
    }
    
    public void listarCompras(){
        for (Venda venda:compras){
            venda.toString();
        }
    }
    public void adicionarCompra(Venda venda){
        compras.add(venda);
    }
    
    public String quantidadeCompras(){
        return nome + "(" + cpf + ") - Compras: " + compras.size();
    }
   
}
