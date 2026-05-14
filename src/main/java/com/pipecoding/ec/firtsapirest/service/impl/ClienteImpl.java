package com.pipecoding.ec.firtsapirest.service.impl;

import com.pipecoding.ec.firtsapirest.dao.ClienteDao;
import com.pipecoding.ec.firtsapirest.model.entity.Cliente;
import com.pipecoding.ec.firtsapirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

}
