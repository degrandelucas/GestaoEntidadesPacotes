package com.degrande.gestaoentidades.modelos;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void verificaMaiorIdade(){
        if (idade >= 18){
            System.out.println(nome + " é maior de idade!");
        }
        else
            System.out.println(nome + " ainda é menor de idade!");
    }

}
