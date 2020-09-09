package com.henrique.redeSocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henrique.redeSocial.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);
}
