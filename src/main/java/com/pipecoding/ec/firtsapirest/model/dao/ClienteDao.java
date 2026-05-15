package com.pipecoding.ec.firtsapirest.model.dao;

import com.pipecoding.ec.firtsapirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {


}
