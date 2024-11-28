package com.degrande.gestaoentidades.principal;

import com.degrande.gestaoentidades.modelos.Pessoa;
import com.degrande.gestaoentidades.modelos.Produto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas");
        System.out.println("Digite a idade de " + pessoa.getNome());
        Scanner leitura = new Scanner(System.in);
        pessoa.setIdade(leitura.nextInt());
        pessoa.verificaMaiorIdade();

        if (pessoa.getIdade() >= 18) {
            String opcaoCompra = """
                    Qual seria a peça de vesturário que deseja comprar?
                    1 - Camiseta
                    2 - Short
                    3 - Meias
                    """;
            System.out.print(opcaoCompra);
            int escolhaDeCompra = leitura.nextInt();

            Produto produto = new Produto();
            switch (escolhaDeCompra) {
                case 1:
                    produto.setNome("Camiseta");
                    produto.setPreco(39.99);
                    System.out.println(String.format("O produto %S de %.2f irá sair por R$ %.2f",produto.getNome(),produto.getPreco(),produto.aplicarDesconto(0.2)));
                    break;
                case 2:
                    produto.setNome("Short");
                    produto.setPreco(59.99);
                    System.out.println(String.format("O produto %S de %.2f irá sair por R$ %.2f",produto.getNome(),produto.getPreco(),produto.aplicarDesconto(0.3)));
                    break;
                case 3:
                    produto.setNome("Meias");
                    produto.setPreco(19.99);
                    System.out.println(String.format("O produto %S de %.2f irá sair por R$ %.2f",produto.getNome(),produto.getPreco(),produto.aplicarDesconto(0.15)));
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
        leitura.close();
    }
}