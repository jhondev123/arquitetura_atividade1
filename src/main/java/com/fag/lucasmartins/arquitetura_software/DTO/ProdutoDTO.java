package com.fag.lucasmartins.arquitetura_software.DTO;

import javax.validation.constraints.*;

public class ProdutoDTO {
    @NotBlank(message = "O nome não pode estar em branco")
    public String nome;
    @NotNull(message = "O estoque é obrigatório")
    @Min(value = 0, message = "O estoque não pode ser negativo")
    public Integer estoque;
    @Positive(message = "O preço deve ser maior que zero")
    public double preco;
    public long id;

    public ProdutoDTO(long id, String nome, Integer estoque, double preco) {
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
