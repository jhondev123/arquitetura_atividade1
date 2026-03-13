package com.fag.lucasmartins.arquitetura_software.Interfaces;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.Entities.ProdutoEntity;

public interface IProdutoService {
    public void validaProdutoPremium(ProdutoBO produto);
    public double calculaDescontoPorEstoque(ProdutoBO produto);
    public ProdutoBO salvarProduto(ProdutoBO produto);

}
