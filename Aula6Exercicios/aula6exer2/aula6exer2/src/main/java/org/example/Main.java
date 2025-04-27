package org.example;

import org.example.modelo.Continente;
import org.example.modelo.Pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Continente> continentes = new ArrayList<>();
        List<Pais> paises = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("====MENU====");
            System.out.println("1.  Adicionar Continente.");
            System.out.println("2.  Exibir Continentes.");
            System.out.println("3.  Adicionar País.");
            System.out.println("4.  Exibir Países.");
            System.out.println("5.  Exibir Continentes e seus respectivos países.");
            System.out.println("6.  Adicionar País ao Continente.");
            System.out.println("7.  Dimensão total do Continente.");
            System.out.println("8.  População total do Continente.");
            System.out.println("9.  Densidade populacional do Continente ");
            System.out.println("10.  País com maior população do Continente");
            System.out.println("11.  País com menor população do Continente");
            System.out.println("12.  País com maior dimensão do Continente");
            System.out.println("13.  País com menor dimensão do Continente");
            System.out.println("14.  Razão territorial do maior país em relação ao menor país do Continente.");
            System.out.println("0.  Sair do programa.");

            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("1.  Adicionar Continente.");
                    System.out.println("Quantos continentes você deseja adicionar: ");
                    int quantidadeContinente = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < quantidadeContinente; i++) {
                        System.out.println("Digite o nome do continente que deseja adicionar: ");
                        String nomeContinenteAdicionar = scanner.nextLine();
                        continentes.add(new Continente(nomeContinenteAdicionar));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("2.  Exibir Continente.");
                    System.out.println("Exibindo todos os continentes cadastrados: ");
                    for (Continente continente : continentes) {
                        System.out.println(continente.getNome());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3.  Adicionar País.");
                    System.out.println("Quantos países você deseja adicionar: ");
                    int quantidadePais = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < quantidadePais; i++){
                        System.out.println("Digite o nome do país: ");
                        String nomePaisAdicionar = scanner.nextLine();

                        System.out.println("Digite a dimensão do país: ");
                        double dimensaoPaisAdicionar = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("Digite a população do país: ");
                        int populacaoPaisAdicionar = scanner.nextInt();
                        scanner.nextLine();

                        paises.add(new Pais(nomePaisAdicionar,dimensaoPaisAdicionar,populacaoPaisAdicionar));
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("4.  Exibindo países:");
                    for (Pais pais: paises){
                        System.out.println("País: " + pais.getNome());
                        System.out.println("Dimensão: " + pais.getDimensao());
                        System.out.println("População: " + pais.getPopulacao());
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("5.  Exibindo Continentes e seus respectivos países.");
                    for (Continente continente: continentes){
                        continente.showPaises();
                    }
                    break;
                case 6:
                    System.out.println("6.  Adicionar País ao Continente.");
                    System.out.println("Digite o nome do Continente ao qual deseja adicionar países: ");
                    String continenteDigitado = scanner.nextLine();

                    Continente continenteAlvo = null;
                    Pais paisAlvo = null;

                    boolean continenteEncontrado=false;
                    boolean paisEncontrado=false;
                    for (Continente continente: continentes){
                        if(continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo = continente;
                            continenteEncontrado=true;
                        }
                    }
                    if(continenteEncontrado){
                        System.out.println("Digite o nome do País que deseja adicionar: ");
                        String nomePaisAddContinente = scanner.nextLine();
                        for(Pais pais: paises) {
                            if (pais.getNome().equalsIgnoreCase(nomePaisAddContinente)) {
                                paisAlvo = pais;
                                paisEncontrado = true;
                            }
                        }
                        if (paisEncontrado){
                            continenteAlvo.addPaises(paisAlvo);
                        } else {
                            System.out.println("O país informado não foi encontrado.");
                        }
                    } else {
                        System.out.println("O continente informado não foi encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    System.out.println();
                    System.out.println();
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();


        /*Continente americaDoSul = new Continente("Americano");

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
        americaDoSul.getPopulacaoTotalContinente();*/
    }
}