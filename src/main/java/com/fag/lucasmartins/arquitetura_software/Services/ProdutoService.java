package com.fag.lucasmartins.arquitetura_software.Services;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.Interfaces.IProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService implements IProdutoService {
    @Override
    public void validaProdutoPremium(ProdutoBO produto) {
        if (produto.getNome() != null && produto.getNome().toLowerCase().contains("premium")) {
            if (produto.getPreco() < 100.0) {
                throw new RuntimeException("Erro: Produtos Premium não podem custar menos de R$ 100,00.");
            }
        }
    }

    @Override
    public double calculaDescontoPorEstoque(ProdutoBO produto) {
        double precoFinal = produto.getPreco();
        if (produto.getEstoque() != null && produto.getEstoque() >= 50) {
            precoFinal = produto.getPreco() - (produto.getPreco() * 0.10);
        }
    }

    @Override
    public ProdutoBO salvarProduto(ProdutoBO produto) {
        return null;
    }
}
