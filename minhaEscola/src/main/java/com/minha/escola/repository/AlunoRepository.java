package com.minha.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minha.escola.model.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel,Long>{
	public List<AlunoModel> findByNome(String nome);

}
