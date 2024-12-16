package com.generation.sisfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.sisfarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findsAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}