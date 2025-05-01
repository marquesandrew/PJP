package org.example.modelo;

import java.util.List;

public class PacoteInternacional extends PacoteViagem{
    private boolean necessitaPassaporte;
    private boolean necessitaVisto;
    private boolean assistenciaInternacional;
    private String moedaLocal;


    public PacoteInternacional(String destino, int duracao, double preco, List<String> atividades,
                               boolean necessitaPassaporte, boolean necessitaVisto, boolean assistenciaInternacional,String moedaLocal) {
        super(destino, duracao, preco, atividades);
        this.necessitaPassaporte = necessitaPassaporte;
        this.necessitaVisto = necessitaVisto;
        this.assistenciaInternacional = assistenciaInternacional;
        this.moedaLocal = moedaLocal;
    }

    public boolean isNecessitaPassaporte() {
        return necessitaPassaporte;
    }

    public boolean isNecessitaVisto() {
        return necessitaVisto;
    }

    public boolean isAssistenciaInternacional() {
        return assistenciaInternacional;
    }

    @Override
    public String getTipoPacote(){
        return "Internacional";
    }

    @Override
    public void getDetalhesPacote(){
        super.getDetalhesPacote();
        System.out.println("Tipo: " + getTipoPacote());
        System.out.println("Necessita Passaporte? " + (necessitaPassaporte ? "Sim" : "Não"));
        System.out.println("Necessita Visto? " + (necessitaVisto ? "Sim" : "Não"));
        System.out.println("Assistencia Internacional? " + (assistenciaInternacional ? "Sim" : "Não"));
        System.out.println("Moeda Local: " + moedaLocal);
        System.out.println();
    }
}
