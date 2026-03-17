package com.fag.lucasmartins.arquitetura_software.Controller.mapper;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.DTO.ProdutoDTO;

public final class ProdutoDTOMapper {
    private ProdutoDTOMapper() {
    }

    public static ProdutoBO toBo(ProdutoDTO dto) {
        return new ProdutoBO(dto.getId(), dto.getNome(), dto.getEstoque(),dto.getPreco());
    }

    public static ProdutoDTO toDto(ProdutoBO bo) {
        return new ProdutoDTO(bo.getId(), bo.getNome(), bo.getEstoque(),bo.getPreco());
    }
}
