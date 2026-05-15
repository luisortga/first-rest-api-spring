package com.pipecoding.ec.firtsapirest.service;

import com.pipecoding.ec.firtsapirest.model.dto.ClienteDto;
import com.pipecoding.ec.firtsapirest.model.entity.Cliente;
import org.springframework.transaction.annotation.Transactional;

public interface ICliente {


    @Transactional
    Cliente save(ClienteDto clienteDto);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

}
