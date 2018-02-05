package com.nutricao.sistemaNutricional.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutricao.sistemaNutricional.model.Consulta;

public interface ConsultaPersistencia extends JpaRepository<Consulta, Long>{
  
  @Query("")
  List<>
  
  @Query("select nome from Paciente p where p.nome like ?1")
  List<Paciente> pesquisaPorNome(String nome);
  
  

  
  
}
