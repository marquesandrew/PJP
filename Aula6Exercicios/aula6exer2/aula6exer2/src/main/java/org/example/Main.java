package org.example;

import org.example.modelo.Continente;
import org.example.modelo.Pais;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Continente americaDoSul = new Continente("Americano");

        Pais brasil = new Pais("Brasil", 8515770.0, 212600000);
        Pais argentina = new Pais("Argentina", 2780400.0, 45851378);
        Pais peru = new Pais("Peru", 1285220.0, 32971846);
        Pais colombia = new Pais("Colômbia", 1141748.0, 53425635);
        Pais bolivia = new Pais("Bolívia", 1098581.0, 11673029);
        Pais venezuela = new Pais("Venezuela", 916447.0, 28435943);
        Pais chile = new Pais("Chile", 756102.0, 19116209);
        Pais paraguai = new Pais("Paraguai", 406752.0, 7132530);
        Pais equador = new Pais("Equador", 283561.0, 17643060);
        Pais guiana = new Pais("Guiana", 214969.0, 787971);
        Pais uruguai = new Pais("Uruguai", 176215.0, 3473727);
        Pais suriname = new Pais("Suriname", 163820.0, 614749);

        americaDoSul.addPaises(brasil);
        americaDoSul.addPaises(argentina);
        americaDoSul.addPaises(peru);
        americaDoSul.addPaises(colombia);
        americaDoSul.addPaises(bolivia);
        americaDoSul.addPaises(venezuela);
        americaDoSul.addPaises(chile);
        americaDoSul.addPaises(paraguai);
        americaDoSul.addPaises(equador);
        americaDoSul.addPaises(guiana);
        americaDoSul.addPaises(uruguai);
        americaDoSul.addPaises(suriname);
        americaDoSul.showPaises();
        americaDoSul.getDimensaoTotalContinente();
        americaDoSul.getPopulacaoTotalContinente();
    }
}