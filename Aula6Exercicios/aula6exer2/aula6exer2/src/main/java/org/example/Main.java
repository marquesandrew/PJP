package org.example;

import org.example.modelo.Continente;
import org.example.modelo.Pais;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Continente americano = new Continente("Americano");

        Pais brasil = new Pais("Brasil",8510,21260000);
        Pais argentina = new Pais("Argentina",2780,40091359);

        americano.addPaises(brasil);
        americano.addPaises(argentina);

        americano.showPaises();

        americano.getDimensaoTotalContinente();
    }
}