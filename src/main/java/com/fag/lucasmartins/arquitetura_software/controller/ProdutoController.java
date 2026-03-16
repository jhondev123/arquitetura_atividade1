package com.fag.lucasmartins.arquitetura_software.controller;

import com.fag.lucasmartins.arquitetura_software.BO.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.DTO.Common.ResponseError;
import com.fag.lucasmartins.arquitetura_software.DTO.ProdutoDTO;
import com.fag.lucasmartins.arquitetura_software.Interfaces.IProdutoService;
import com.fag.lucasmartins.arquitetura_software.controller.mapper.ProdutoDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private IProdutoService produtoService;

    public ProdutoController(IProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @PostMapping
    public ResponseEntity<?> cadastrarProduto(@Valid @RequestBody ProdutoDTO dto) {
        try {
            ProdutoBO bo = ProdutoDTOMapper.toBo(dto);
            ProdutoBO produtoCadastrado = produtoService.cadastrarProduto(bo);
            ProdutoDTO dtoCadastrado = ProdutoDTOMapper.toDto(produtoCadastrado);

            return ResponseEntity.status(HttpStatus.CREATED).body(dtoCadastrado);

        } catch (Exception e) {
            ResponseError error = new ResponseError(
                    HttpStatus.BAD_REQUEST.value(),
                    e.getMessage()
            );

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }
}