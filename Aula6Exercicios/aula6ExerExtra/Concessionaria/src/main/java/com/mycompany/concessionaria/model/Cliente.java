/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.model;

import java.io.Serializable;
import java.time.LocalDate;
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
    private LocalDate nascimento;
    private String sexo;
    List<Venda> compras;

    public Cliente(String nome, String cpf, String telefone, String email, LocalDate nascimento, String sexo,List<Venda> compras) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.compras = new ArrayList<>();
    }
    
    public Cliente(String nome, String cpf, String telefone, String email, LocalDate nascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
        this.sexo = sexo;
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
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
