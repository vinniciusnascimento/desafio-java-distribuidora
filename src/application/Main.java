package application;

import domain.produto.Produto;
import util.Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        Scanner teclado = new Scanner(System.in);

        /*
        []Aparecer a mensagem
        []Selecionar a tecla
        []Fazer a função selecionada
        []Começar novamente
         */

        String escolha = teclado.nextLine();

        while (!escolha.equals("5")){
            switch (escolha){
                case "1":
                    break;
                case "2":

            }
        }
    }
}