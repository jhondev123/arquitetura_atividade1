package com.fag.lucasmartins.arquitetura_software.Entities;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
public class ProdutoEntity {
    public String nome;
    public Integer estoque;
    public double preco;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public ProdutoEntity() {
    }

    public ProdutoEntity(long id, String nome, Integer estoque, double preco) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
