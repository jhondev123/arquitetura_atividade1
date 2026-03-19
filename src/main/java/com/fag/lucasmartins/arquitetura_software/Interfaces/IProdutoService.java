package com.fag.lucasmartins.arquitetura_software.Interfaces;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.Entities.ProdutoEntity;

public interface IProdutoService {
    public ProdutoBO cadastrarProduto(ProdutoBO dto);

}
