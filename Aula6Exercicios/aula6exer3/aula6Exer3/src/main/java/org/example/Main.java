package org.example;

import org.example.modelo.Cliente;
import org.example.modelo.PacoteInternacional;
import org.example.modelo.PacoteNacional;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente joaozinho = new Cliente("joaozinho","65432156212","12121211212","joaozinho@gmail.com");

        PacoteNacional gramado = new PacoteNacional("Gramado",5,100.00,Arrays.asList("Passeio nas cataratas", "Visita à usina de Itaipu"),true,"RS");

        PacoteInternacional espanha = new PacoteInternacional("Barcelona",8,15000.00, Arrays.asList("Camp Nou","Sagrada famiulia","Barzinho"),true,false,false,"Euro");

        joaozinho.adicionarPacotes(gramado);

        joaozinho.listarPacotes();

    }
}