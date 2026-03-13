package com.fag.lucasmartins.arquitetura_software.Interfaces;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.Entities.ProdutoEntity;

public interface IProdutoRepository {
    public ProdutoEntity salvarProduto(ProdutoBO produto);
}
