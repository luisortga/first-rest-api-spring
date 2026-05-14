package com.pipecoding.ec.firtsapirest.service;

import com.pipecoding.ec.firtsapirest.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

}
