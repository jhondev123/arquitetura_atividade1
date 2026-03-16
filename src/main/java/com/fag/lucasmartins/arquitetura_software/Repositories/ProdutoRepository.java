package com.fag.lucasmartins.arquitetura_software.Repositories;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.Entities.ProdutoEntity;
import com.fag.lucasmartins.arquitetura_software.Interfaces.IProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.Repositories.Mapper.ProdutoEntityMapper;
import com.fag.lucasmartins.arquitetura_software.Repositories.jpa.ProdutoJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class ProdutoRepository implements IProdutoRepository {

    private final ProdutoJpaRepository jpaRepository;

    public ProdutoRepository(ProdutoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }
    @Override
    public ProdutoBO cadastrarProduto(ProdutoBO produto) {
        ProdutoEntity entity = ProdutoEntityMapper.toEntity(produto);

        ProdutoEntity produtoCriado = jpaRepository.save(entity);

        return ProdutoEntityMapper.toBo(produtoCriado);
    }
}
