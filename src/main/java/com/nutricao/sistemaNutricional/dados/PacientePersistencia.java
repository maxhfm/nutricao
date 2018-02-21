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
  
  @Query(value="select * from paciente p where month(data_nascimento)='01' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteJan();
  
  @Query(value="select * from paciente p where month(data_nascimento)='02' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteFev();
  
  @Query(value="select * from paciente p where month(data_nascimento)='03' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteMar();
  
  @Query(value="select * from paciente p where month(data_nascimento)='04' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteAbr();
  
  @Query(value="select * from paciente p where month(data_nascimento)='05' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteMaio();
  
  @Query(value="select * from paciente p where month(data_nascimento)='06' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteJun();
  
  @Query(value="select * from paciente p where month(data_nascimento)='07' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteJul();
  
  @Query(value="select * from paciente p where month(data_nascimento)='08' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteAgo();
  
  @Query(value="select * from paciente p where month(data_nascimento)='09' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteSet();
  
  @Query(value="select * from paciente p where month(data_nascimento)='10' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteOut();
  
  @Query(value="select * from paciente p where month(data_nascimento)='11' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteNov();
  
  @Query(value="select * from paciente p where month(data_nascimento)='12' order by data_nascimento desc", nativeQuery = true)
  List<Paciente> aniversarianteDez();
  
  
  

}
