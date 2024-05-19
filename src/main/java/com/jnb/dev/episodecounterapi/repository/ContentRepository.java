package com.jnb.dev.episodecounterapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnb.dev.episodecounterapi.model.Content;

@Repository // Dizemos que esse é um componente do Spring do tipo Repository, o responsável por interagir com o banco de dados
// Também implementa os principais métodos como listar
public interface ContentRepository extends JpaRepository<Content, Long> {
    
}
