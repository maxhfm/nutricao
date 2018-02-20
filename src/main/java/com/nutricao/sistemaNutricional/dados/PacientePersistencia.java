package com.nutricao.sistemaNutricional.dados;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nutricao.sistemaNutricional.model.Consulta;
import com.nutricao.sistemaNutricional.model.Paciente;

@Repository
public interface PacientePersistencia extends CrudRepository <Paciente, Long>{
  
  @Query(value="select p.nome,c.data_consulta,c.proxima_consulta from paciente p inner join consulta c on p.id=c.id", nativeQuery = true)
 //@Query("select c.proximaConsulta from Consulta c join c.paciente paciente where paciente.id = : id")
 List<Consulta> retornaDataConsultas();
  
//  @Query("select u.userName from User u inner join u.area ar where ar.idArea = :idArea")
//  @Query("select sum(price.value) from Product p join p.prices price where price.bookType = :book")

  @Query("select nome from Paciente p where p.nome like ?1")
  List<Paciente> pesquisaPorNome(String nome);

  
  Paciente findById(Long id);
  

}
