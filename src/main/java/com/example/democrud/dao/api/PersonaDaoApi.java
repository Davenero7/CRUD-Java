package com.example.democrud.dao.api;

import com.example.democrud.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoApi extends CrudRepository<Persona, Long> {


}
