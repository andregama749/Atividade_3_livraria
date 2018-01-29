package br.edu.iff.pooa20172.atividade3;

import java.io.Serializable;

public class Livro implements Serializable {

    private int id;
    private String nome;
    private String autor;
    private String descricao;


    public Livro() {

    }

    public Livro(String nome, String autor, String descricao) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;

    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

}