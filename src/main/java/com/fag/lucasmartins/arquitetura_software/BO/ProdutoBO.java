package com.fag.lucasmartins.arquitetura_software.BO;

public class ProdutoBO {
    public String nome;
    public Integer estoque;
    public double preco;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoBO() {
    }

    public ProdutoBO(Long id, String nome, Integer estoque, double preco) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public void validaProdutoPremium() {
        if (this.getNome() != null && this.getNome().toLowerCase().contains("premium")) {
            if (this.getPreco() < 100.0) {
                throw new RuntimeException("Erro: Produtos Premium não podem custar menos de R$ 100,00.");
            }
        }
    }
    public void calculaDescontoPorEstoque() {
        if (this.getEstoque() != null && this.getEstoque() >= 50) {
            this.setPreco(this.getPreco() - (this.getPreco() * 0.10));
        }
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
