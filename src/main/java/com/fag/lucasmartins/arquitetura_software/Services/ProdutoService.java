package com.fag.lucasmartins.arquitetura_software.Services;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.Entities.ProdutoEntity;
import com.fag.lucasmartins.arquitetura_software.Interfaces.IProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.Interfaces.IProdutoService;
import com.fag.lucasmartins.arquitetura_software.Repositories.Mapper.ProdutoEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService implements IProdutoService {

    private final IProdutoRepository repository;

    public ProdutoService(IProdutoRepository repository) {
        this.repository = repository;
    }


    @Override
    public ProdutoBO cadastrarProduto(ProdutoBO produto) {
        produto.validaProdutoPremium();
        produto.calculaDescontoPorEstoque();

        return repository.cadastrarProduto(produto);
    }
}
