package application;

import domain.produto.Produto;
import domain.produto.ProdutoList;
import util.Comandos;
import util.Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        Scanner teclado = new Scanner(System.in);

        Console.inicioPrograma();
        System.out.print("Escolha: ");
        String escolha = teclado.nextLine();

        while (!escolha.equals("722")){
            switch (escolha){
                case "1":

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
                    break;

                case "3":
                    break;

                case "4":
                    Comandos.listarPedidos();
                    break;

                case "5":
                    Comandos.listarProdutos();
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