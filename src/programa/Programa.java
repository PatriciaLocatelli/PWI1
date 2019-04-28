package programa;

import classes.Apolice;
import classes.Cliente;
import classes.Modelo;
import classes.Usuario;
import classes.VeiculoSegurado;
import enums.SituacaoApolice;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDate dataAtual = LocalDate.now();

        LinkedList<Usuario> listaDeUsuarios = new LinkedList<>();
        LinkedList<Cliente> listaDeClientes = new LinkedList<>();
        LinkedList<VeiculoSegurado> listaDeVeiculoSegurados = new LinkedList<>();

        while (true) {
            System.out.println("===BEM VINDO AO PROGRAMA DE CADASTRO DE VEÍCULOS===");
            System.out.println();
            System.out.println("Digite:");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar Veículo Segurado");
            System.out.println("3 - Cadastrar Cliente");
            System.out.println("4 - Listar todos os Clientes");
            System.out.println("5 - Listar todos os Veículos");
            System.out.println("6 - Listar todos os Usuários");
            System.out.println("7 - Sair");

            int valor = sc.nextInt();

            switch (valor) {
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o identificador: ");
                    String identificador = sc.nextLine();

                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();

                    listaDeUsuarios.add(new Usuario(identificador, senha, nome, dataAtual));

                    break;
                case 2:

                    sc.nextLine();
                    System.out.println("==DADOS SOBRE O VEÍCULO==");
                    System.out.print("Digite a kilometragem");
                    double kilometragem = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite a placa");
                    String placa = sc.nextLine();

                    System.out.println("==DADOS SOBRE O MODELO==");
                    System.out.print("Digite a descrição do modelo: ");
                    String descricao = sc.nextLine();

                    System.out.println("==DADOS SOBRE A APÓLICE==");
                    System.out.print("Numero: ");
                    int numero = sc.nextInt();

                    System.out.println("Situação da apólice: \n1 - Em negociação 2 - Cancelada 3 - Quitada ou 4 - Parcelada: ");
                    int situacaoApolice = sc.nextInt();

                    SituacaoApolice situacao = null;
                    if (situacaoApolice == 1) {
                        situacao = SituacaoApolice.EMNEGOCIACAO;
                    }
                    if (situacaoApolice == 2) {
                        situacao = SituacaoApolice.CANCELADA;
                    }
                    if (situacaoApolice == 3) {
                        situacao = SituacaoApolice.QUITADA;
                    }
                    if (situacaoApolice == 4) {
                        situacao = SituacaoApolice.PARCELADA;
                    }
                    sc.nextLine();
                    System.out.println("Seguradora: ");
                    String seguradora = sc.nextLine();

                    listaDeVeiculoSegurados.add(
                            new VeiculoSegurado(kilometragem, placa,
                                    new Modelo(descricao),
                                    new Apolice(numero, dataAtual, dataAtual, situacao, seguradora)
                            ));

                    break;

                case 3:
                    sc.nextLine();

                    System.out.println("==DADOS SOBRE O CLIENTE==");
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();

                    System.out.print("Digite o endereco: ");
                    String endereco = sc.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();

                    System.out.print("Quantos veículos deseja cadastrar? ");
                    int qtd = sc.nextInt();

                    if (qtd != 0) {
                        for (int i = 0; i < qtd; i++) {

                            System.out.println("==DADOS SOBRE O VEÍCULO==");
                            System.out.print("Digite a kilometragem");
                            kilometragem = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Digite a placa");
                            placa = sc.nextLine();

                            System.out.println("==DADOS SOBRE O MODELO==");
                            System.out.print("Digite a descrição do modelo: ");
                            descricao = sc.nextLine();

                            System.out.println("==DADOS SOBRE A APÓLICE==");
                            System.out.print("Numero: ");
                            numero = sc.nextInt();

                            System.out.println("Situação da apólice: \n1 - Em negociação 2 - Cancelada 3 - Quitada ou 4 - Parcelada: ");
                            situacaoApolice = sc.nextInt();

                            situacao = null;
                            if (situacaoApolice == 1) {
                                situacao = SituacaoApolice.EMNEGOCIACAO;
                            }
                            if (situacaoApolice == 2) {
                                situacao = SituacaoApolice.CANCELADA;
                            }
                            if (situacaoApolice == 3) {
                                situacao = SituacaoApolice.QUITADA;
                            }
                            if (situacaoApolice == 4) {
                                situacao = SituacaoApolice.PARCELADA;
                            }
                            sc.nextLine();
                            System.out.println("Seguradora: ");
                            seguradora = sc.nextLine();

                            listaDeVeiculoSegurados.add(new VeiculoSegurado(kilometragem, placa,
                                    new Modelo(descricao),
                                    new Apolice(numero, dataAtual, dataAtual, situacao, seguradora)));

                            listaDeClientes.add(new Cliente(endereco, telefone, listaDeVeiculoSegurados, nome, dataAtual));
                        }
                    } else {
                        System.out.println("Você precisa cadastrar um veículo");
                    }

                    break;

                case 4:
                    System.out.println("========CLIENTES CADASTRADOS===========");
                    if (listaDeClientes.isEmpty()) {
                        System.out.println("Nenhum Cliente cadastrado");
                    } else {
                        for (Cliente client : listaDeClientes) {

                            System.out.println(client.toString());

                        }
                    }
                    System.out.println();

                    break;

                case 5:
                    System.out.println("========VEICULOS CADASTRADOS CADASTRADOS===========");
                    if (listaDeVeiculoSegurados.isEmpty()) {
                        System.out.println("Nenhum Veículo cadastrado");
                    } else {
                        for (VeiculoSegurado veiculos : listaDeVeiculoSegurados) {
                            System.out.println(veiculos.toString());
                        }

                    }

                    System.out.println("Foram Cadastrados = " + VeiculoSegurado.getContador());
                    System.out.println();
                    break;

                case 6:

                    System.out.println("========USUÁRIOS CADASTRADOS===========");
                    if (listaDeUsuarios.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado");
                    } else {
                        for (Usuario user : listaDeUsuarios) {
                            System.out.println(user.toString());

                        }
                    }

                    System.out.println();

                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Valor digitado incorretamente");
            }
        }
    }

}
