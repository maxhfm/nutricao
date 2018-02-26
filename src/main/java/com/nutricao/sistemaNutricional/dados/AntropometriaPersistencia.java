package com.nutricao.sistemaNutricional.dados;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nutricao.sistemaNutricional.model.Antropometria;

@Repository
public interface AntropometriaPersistencia extends CrudRepository<Antropometria, Long> {

}
