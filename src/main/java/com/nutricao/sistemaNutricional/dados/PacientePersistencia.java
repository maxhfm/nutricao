package com.nutricao.sistemaNutricional.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutricao.sistemaNutricional.model.Paciente;

@Repository
public interface PacientePersistencia extends JpaRepository <Paciente, Long>{
  
  @Query("select nome from Paciente p where p.nome like ?1")
  List<Paciente> pesquisaPorNome(String nome);

}
