package com.nutricao.sistemaNutricional.dados;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutricao.sistemaNutricional.model.Paciente;

@Repository
public interface PacientePersistencia extends JpaRepository <Paciente, Long>{
  
  //@Query(value="select p.nome,c.data_consulta,c.proxima_consulta from paciente p inner join consulta c on p.id=c.id", nativeQuery = true)
  //@Query("select p.nome,c.dataConsulta,c.proximaConsulta from Paciente p inner join Consulta c on p.id=c.id")
  //List<Paciente> retornaDataConsultas();
  
  @Query("select nome from Paciente p where p.nome like ?1")
  List<Paciente> pesquisaPorNome(String nome);

}
