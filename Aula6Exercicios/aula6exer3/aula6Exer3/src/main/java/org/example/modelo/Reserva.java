package org.example.modelo;

import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private PacoteViagem pacote;
    private Date dataCompra;
    private Date dataViagem;

    public Reserva(Cliente cliente, PacoteViagem pacote, Date dataCompra, Date dataViagem) {
        this.cliente = cliente;
        this.pacote = pacote;
        this.dataCompra = dataCompra;
        this.dataViagem = dataViagem;
    }
/*
    public double calcularValorTotal(){
      System.out.println("Calculo Valor.");
    }

    public String getDetalhes(){

    }*/
}
