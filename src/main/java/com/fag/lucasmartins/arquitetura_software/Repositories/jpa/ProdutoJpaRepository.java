package com.fag.lucasmartins.arquitetura_software.Repositories.jpa;

import com.fag.lucasmartins.arquitetura_software.Entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoJpaRepository extends JpaRepository<ProdutoEntity, Long> {
}