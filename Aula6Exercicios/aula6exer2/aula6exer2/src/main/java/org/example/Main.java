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
            System.out.println("15.  Adicionar automaticamente Continentes e países.");
            System.out.println("0.  Sair do programa.");
            opcao = scanner.nextInt();
            scanner.nextLine();

            //variaveis usadas em varios cases
            String continenteDigitado=null;
            Continente continenteAlvo = null;
            Pais paisAlvo = null;
            boolean continenteEncontrado=false;
            boolean paisEncontrado=false;


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
                    continenteDigitado = scanner.nextLine();
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
                case 7:
                    System.out.println("7.  Dimensão total do Continente.");
                    System.out.println("Digite o nome do continente para ver a dimensão total: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado) {
                        continenteAlvo.getDimensaoTotalContinente();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 8:
                    System.out.println("8.  População total do Continente.");
                    System.out.println("Digite o nome do continente para ver a dimensão total: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado){
                        continenteAlvo.getPopulacaoTotalContinente();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 9:
                    System.out.println("9.  Densidade populacional do Continente ");
                    System.out.println("Digite o nome do continente para ver a densidade populacional: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado){
                        continenteAlvo.getDensidadePopulacional();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 10:
                    System.out.println("10.  País com maior população do Continente");
                    System.out.println("Digite o nome do continente para saber o país com maior população: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado){
                        continenteAlvo.getPaisMaiorPopulacao();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 11:
                    System.out.println("11.  País com menor população do Continente");
                    System.out.println("Digite o nome do continente para saber o país com a menor população: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado){
                        continenteAlvo.getPaisMenorPopulacao();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 12:
                    System.out.println("12.  País com maior dimensão do Continente");
                    System.out.println("Digite o nome do continente para saber o país com a maior Dimensão: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado){
                        continenteAlvo.getPaisMaiorDimensao();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 13:
                    System.out.println("13.  País com menor dimensão do Continente");
                    System.out.println("Digite o nome do continente para saber o país com a menor Dimensão: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado){
                        continenteAlvo.getPaisMenorDimensao();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 14:
                    System.out.println("14.  Razão territorial do maior país em relação ao menor país do Continente.");
                    System.out.println("Digite o nome do continente: ");
                    continenteDigitado = scanner.nextLine();
                    for (Continente continente: continentes){
                        if (continente.getNome().equalsIgnoreCase(continenteDigitado)){
                            continenteAlvo=continente;
                            continenteEncontrado=true;
                        }
                    }
                    if (continenteEncontrado){
                        continenteAlvo.getRazao();
                    } else {
                        System.out.println("Continente não encontrado.");
                    }
                    break;
                case 15:
                    continentes.add(new Continente("africa"));
                    continentes.add(new Continente("antartida"));
                    continentes.add(new Continente("asia"));
                    continentes.add(new Continente("europa"));
                    continentes.add(new Continente("americadonorte"));
                    continentes.add(new Continente("americadosul"));
                    continentes.add(new Continente("oceania"));

                    //americadosul
                    paises.add(new Pais("Brasil", 8510000.0, 216000000));
                    paises.add(new Pais("Argentina", 2780000.0, 46000000));
                    paises.add(new Pais("Colombia", 1140000.0, 52000000));
                    paises.add(new Pais("Peru", 1280000.0, 34000000));
                    paises.add(new Pais("Chile", 756000.0, 19600000));
                    //americadonorte
                    paises.add(new Pais("EstadosUnidos", 9834000.0, 335000000));
                    paises.add(new Pais("Canada", 9985000.0, 38000000));
                    paises.add(new Pais("Mexico", 1964000.0, 128000000));
                    paises.add(new Pais("Cuba", 109800.0, 11000000));
                    paises.add(new Pais("Guatemala", 108900.0, 18000000));
                    //europa
                    paises.add(new Pais("Alemanha", 357000.0, 83000000));
                    paises.add(new Pais("Franca", 643800.0, 68000000));
                    paises.add(new Pais("Italia", 301300.0, 59000000));
                    paises.add(new Pais("Espanha", 505900.0, 47000000));
                    paises.add(new Pais("Portugal", 92090.0, 10300000));
                    //asia
                    paises.add(new Pais("China", 9597000.0, 1400000000));
                    paises.add(new Pais("Índia", 3287000.0, 1400000000));
                    paises.add(new Pais("Japao", 377900.0, 125000000));
                    paises.add(new Pais("CoreiadoSul", 100200.0, 52000000));
                    paises.add(new Pais("Indonesia", 1905000.0, 278000000));
                    //africa
                    paises.add(new Pais("Nigeria", 923800.0, 223000000));
                    paises.add(new Pais("Egito", 1010000.0, 110000000));
                    paises.add(new Pais("AfricadoSul", 1221000.0, 60000000));
                    paises.add(new Pais("Quenia", 580000.0, 55000000));
                    paises.add(new Pais("Etiopia", 1104000.0, 126000000));
                    //oceania
                    paises.add(new Pais("Australia", 7692000.0, 26000000));
                    paises.add(new Pais("NovaZelandia", 268700.0, 5100000));
                    paises.add(new Pais("Fiji", 18270.0, 900000));
                    paises.add(new Pais("PapuaNovaGuine", 462800.0, 10000000));
                    paises.add(new Pais("Samoa", 2830.0, 200000));

                    for (Continente continente : continentes) {
                        switch (continente.getNome().toLowerCase()) {
                            case "americadosul":
                                continente.addPaises(new Pais("Brasil", 8510000.0, 216000000));
                                continente.addPaises(new Pais("Argentina", 2780000.0, 46000000));
                                continente.addPaises(new Pais("Colombia", 1140000.0, 52000000));
                                continente.addPaises(new Pais("Peru", 1280000.0, 34000000));
                                continente.addPaises(new Pais("Chile", 756000.0, 19600000));
                                break;
                            case "americadonorte":
                                continente.addPaises(new Pais("EstadosUnidos", 9834000.0, 335000000));
                                continente.addPaises(new Pais("Canada", 9985000.0, 38000000));
                                continente.addPaises(new Pais("Mexico", 1964000.0, 128000000));
                                continente.addPaises(new Pais("Cuba", 109800.0, 11000000));
                                continente.addPaises(new Pais("Guatemala", 108900.0, 18000000));
                                break;
                            case "europa":
                                continente.addPaises(new Pais("Alemanha", 357000.0, 83000000));
                                continente.addPaises(new Pais("Franca", 643800.0, 68000000));
                                continente.addPaises(new Pais("Italia", 301300.0, 59000000));
                                continente.addPaises(new Pais("Espanha", 505900.0, 47000000));
                                continente.addPaises(new Pais("Portugal", 92090.0, 10300000));
                                break;
                            case "asia":
                                continente.addPaises(new Pais("China", 9597000.0, 1400000000));
                                continente.addPaises(new Pais("Índia", 3287000.0, 1400000000));
                                continente.addPaises(new Pais("Japao", 377900.0, 125000000));
                                continente.addPaises(new Pais("CoreiadoSul", 100200.0, 52000000));
                                continente.addPaises(new Pais("Indonesia", 1905000.0, 278000000));
                                break;
                            case "africa":
                                continente.addPaises(new Pais("Nigeria", 923800.0, 223000000));
                                continente.addPaises(new Pais("Egito", 1010000.0, 110000000));
                                continente.addPaises(new Pais("AfricadoSul", 1221000.0, 60000000));
                                continente.addPaises(new Pais("Quenia", 580000.0, 55000000));
                                continente.addPaises(new Pais("Etiopia", 1104000.0, 126000000));
                                break;
                            case "oceania":
                                continente.addPaises(new Pais("Australia", 7692000.0, 26000000));
                                continente.addPaises(new Pais("NovaZelandia", 268700.0, 5100000));
                                continente.addPaises(new Pais("Fiji", 18270.0, 900000));
                                continente.addPaises(new Pais("PapuaNovaGuine", 462800.0, 10000000));
                                continente.addPaises(new Pais("Samoa", 2830.0, 200000));
                                break;
                        }
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
    }
}