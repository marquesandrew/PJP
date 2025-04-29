package org.example.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private List<PacoteViagem> pacotesAdiquiridos;

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.pacotesAdiquiridos = new ArrayList<>();
    }

    public void getDadosCliente(){
        System.out.println("Cliente: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
    }

    public void adicionarPacotes(PacoteViagem pacote){
        pacotesAdiquiridos.add(pacote);
    }

    public void listarPacotes(){
        System.out.println("Pacotes adquiridos por: " + this.nome + ": ");
        for (PacoteViagem pacoteViagem: pacotesAdiquiridos){
            pacoteViagem.getDetalhesPacote();
        }
    }
}
