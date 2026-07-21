package application;

import domain.cliente.ClientesList;
import domain.cliente.TipoCliente;
import domain.produto.ProdutoList;
import util.Comandos;
import util.Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Console.inicioPrograma();
        System.out.print("Escolha: ");
        String escolha = teclado.nextLine();

        while (!escolha.equals("7")){
            switch (escolha){
                case "1":
                    System.out.println("1 - Cliente Atacado");
                    System.out.println("2 - Cliente Varejo");
                    System.out.print("Escolha: ");
                    String tipoCliente = teclado.nextLine();

                    if(tipoCliente.equals("1")){
                        System.out.print("Nome do Cliente: ");
                        String nome = teclado.nextLine();

                        System.out.print("Cpf/Cnpj do Cliente: ");
                        String cpfOuCnpj = teclado.nextLine();

                        Comandos.criarClienteAtacado(nome, cpfOuCnpj, TipoCliente.ATACADO);
                        System.out.println("Cliente criado com sucesso!");
                        System.out.println();
                    } else if(tipoCliente.equals("2")){
                        System.out.print("Nome do Cliente: ");
                        String nome = teclado.nextLine();

                        System.out.print("Cpf/Cnpj do Produto: ");
                        String cpfOuCnpj = teclado.nextLine();

                        Comandos.criarClienteVarejo(nome, cpfOuCnpj, TipoCliente.VAREJO);
                        System.out.println("Cliente criado com sucesso!");
                        System.out.println();
                    } else{
                        System.out.println("Opção Inválida!");
                        System.out.println();
                    }
                    break;

                case "2":
                    System.out.print("Nome do Produto: ");
                    String nome = teclado.nextLine();

                    System.out.print("Preço: ");
                    String precoStr = teclado.nextLine();
                    double preco = Double.parseDouble(precoStr);

                    System.out.print("Quantidade em Estoque: ");
                    String quantidadeEmEstoqueStr = teclado.nextLine();
                    int quantidadeEmEstoque = Integer.parseInt(quantidadeEmEstoqueStr);

                    Comandos.criarProduto(nome, preco, quantidadeEmEstoque);
                    System.out.println("Produto criado com sucesso!");
                    System.out.println();
                    break;

                case "3":
                    Comandos.listarClientes();
                    System.out.print("Cliente (index): ");
                    String indexClienteStr = teclado.nextLine();
                    int indexCliente = Integer.parseInt(indexClienteStr);

                    Comandos.listarProdutos();
                    System.out.print("Produto (index): ");
                    String indexItemStr = teclado.nextLine();
                    int indexItem = Integer.parseInt(indexItemStr);

                    System.out.print("Quantidade: ");
                    String quantidadeStr = teclado.nextLine();
                    int quantidade = Integer.parseInt(quantidadeStr);

                    Comandos.criarPedido(ClientesList.clientes.get(indexCliente), Comandos.criarItemPedido(ProdutoList.produtos.get(indexItem), quantidade));
                    System.out.println("Pedido criado com sucesso!");
                    System.out.println();
                    break;

                case "4":
                    Comandos.listarPedidos();
                    break;

                case "5":
                    Comandos.listarProdutos();
                    break;

                case "6":
                    Comandos.listarClientes();
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

            Console.inicioPrograma();
            System.out.print("Escolha: ");
            escolha = teclado.nextLine();
        }
    }
}