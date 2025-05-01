package org.example;

import org.example.modelo.Cliente;
import org.example.modelo.PacoteInternacional;
import org.example.modelo.PacoteNacional;
import org.example.modelo.PacoteViagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        List<PacoteViagem> pacotesNacional = new ArrayList<>();
        List<PacoteViagem> pacotesInternacional = new ArrayList<>();

        String destino;
        int duracao;
        int opcao=0;
        double preco;
        String atividade;
        List<String> atividades = new ArrayList<>();
        boolean necessitaPassaporte;
        boolean necessitaVisto;
        boolean assistenciaInternacional;
        String moedaLocal;
        String clienteDigitado;
        String pacoteDigitado;
        Cliente clienteSelecinoado=null;
        PacoteViagem pacoteSelecionado=null;

        do {
            System.out.println("=====MENU PRINCIPAL=====");
            System.out.println("1. Cadastrar Cliente.");
            System.out.println("2. Exibir Clientes.");
            System.out.println("3. Cadastrar Pacote Nacional.");
            System.out.println("4. Cadastrar Pacote Internacional.");
            System.out.println("5. Exibir Pacotes Nacionais.");
            System.out.println("6. Exibir Pacotes Internacionais.");
            System.out.println("7. Comprar Pacote Nacional.");
            System.out.println("8. Comprar Pacote Internacional.");
            System.out.println("9. Exibir pacotes comprados por cliente.");
            System.out.println("0. Sair do programa.");
            opcao = scanner.nextInt();
            scanner.nextLine();



            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o telefone do cliente:");
                    String telefone = scanner.nextLine();

                    System.out.println("Digite o cpf do cliente:");
                    String cpf = scanner.nextLine();

                    System.out.println("Digite o email do cliente:");
                    String email = scanner.nextLine();

                    clientes.add(new Cliente(nome,telefone,cpf,email));
                    break;
                case 2:
                    System.out.println("2. Exibir Clientes.");
                    for (Cliente cliente:clientes){
                        cliente.getDadosCliente();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3. Cadastrar Pacote Nacional.");
                    System.out.println("Digite o destino do pacote: ");
                    destino = scanner.nextLine();

                    System.out.println("Digite a duração do pacote: ");
                    duracao = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o preco do pacote: ");
                    preco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Cadastro de atividades do pacote.(Digite fim para concluir o cadastro): ");
                    do {
                        System.out.println("Atividade: ");
                        atividade = scanner.nextLine();
                        if (!atividade.equalsIgnoreCase("fim")){
                            atividades.add(atividade);
                        }
                    } while (!atividade.equalsIgnoreCase("fim"));

                    System.out.println("Inclui transporte rodoviário?(true/false) ");
                    boolean transporteRodoviario = scanner.nextBoolean();
                    scanner.nextLine();

                    pacotesNacional.add(new PacoteNacional(destino,duracao,preco,atividades,transporteRodoviario));
                    break;
                case 4:
                    System.out.println("4. Cadastrar Pacote Internacional.");
                    System.out.println("Digite o destino do pacote: ");
                    destino = scanner.nextLine();

                    System.out.println("Digite a duração do pacote: ");
                    duracao = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o preco do pacote: ");
                    preco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Cadastro de atividades do pacote.(Digite fim para concluir o cadastro): ");
                    do {
                        System.out.println("Atividade: ");
                        atividade = scanner.nextLine();
                        if (!atividade.equalsIgnoreCase("fim")){
                            atividades.add(atividade);
                        }
                    } while (!atividade.equalsIgnoreCase("fim"));

                    System.out.println("Necessita Passaporte?(true/false) ");
                    necessitaPassaporte = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("Necessita Visto?(true/false) ");
                    necessitaVisto = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("Inclui assistencia internacional?(true/false) ");
                    assistenciaInternacional = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("Qual a moeda local? ");
                    moedaLocal = scanner.nextLine();

                    pacotesInternacional.add(new PacoteInternacional(destino,duracao,preco,atividades,necessitaPassaporte,
                            necessitaVisto,assistenciaInternacional,moedaLocal));

                    break;
                case 5:
                    System.out.println("5. Exibir Pacotes Nacionais.");
                    for (PacoteViagem pacote: pacotesNacional){
                        pacote.getDetalhesPacote();
                    }
                    break;
                case 6:
                    System.out.println("6. Exibir Pacotes Internacionais.");
                    for (PacoteViagem pacote: pacotesInternacional){
                        pacote.getDetalhesPacote();
                    }
                    break;
                case 7:
                    System.out.println("7. Comprar Pacote Nacional.");
                    System.out.println("Digite o nome do cliente que deseja comprar: ");
                    clienteDigitado = scanner.nextLine();

                    System.out.println("Digite o nome do pacote que deseja comprar: ");
                    pacoteDigitado = scanner.nextLine();

                    for (Cliente cliente:clientes){
                        if(cliente.getNome().equalsIgnoreCase(clienteDigitado)){
                            clienteSelecinoado=cliente;
                            break;
                        }
                    }
                    for (PacoteViagem pacote: pacotesNacional){
                        if(pacote.getDestino().equalsIgnoreCase(pacoteDigitado)){
                            pacoteSelecionado=pacote;
                            break;
                        }
                    }
                    if(pacoteSelecionado!=null && clienteSelecinoado!=null){
                        clienteSelecinoado.adicionarPacotes(pacoteSelecionado);
                    }else {
                        System.out.println("Dados Invalidos");
                    }

                    break;
                case 8:
                    System.out.println("8. Comprar Pacote Internacional.");
                    System.out.println("Digite o nome do cliente que deseja comprar: ");
                    clienteDigitado = scanner.nextLine();

                    System.out.println("Digite o nome do pacote que deseja comprar: ");
                    pacoteDigitado = scanner.nextLine();

                    for (Cliente cliente:clientes){
                        if(cliente.getNome().equalsIgnoreCase(clienteDigitado)){
                            clienteSelecinoado=cliente;
                            break;
                        }
                    }
                    for (PacoteViagem pacote: pacotesInternacional){
                        if(pacote.getDestino().equalsIgnoreCase(pacoteDigitado)){
                            pacoteSelecionado=pacote;
                            break;
                        }
                    }
                    if(pacoteSelecionado!=null && clienteSelecinoado!=null){
                        clienteSelecinoado.adicionarPacotes(pacoteSelecionado);
                    }else {
                        System.out.println("Dados Invalidos");
                    }

                    break;
                case 9:
                    System.out.println("9. Exibir pacotes comprados por cliente.");
                    System.out.println("Digite o nome do cliente: ");
                    clienteDigitado = scanner.nextLine();

                    for (Cliente cliente:clientes){
                        if(cliente.getNome().equalsIgnoreCase(clienteDigitado)){
                            clienteSelecinoado=cliente;
                            break;
                        }
                    }
                    clienteSelecinoado.listarPacotes();

                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!");
            }
        } while (opcao!=0);
    }
}