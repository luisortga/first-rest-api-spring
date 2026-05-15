package com.pipecoding.ec.firtsapirest.controller;

import com.pipecoding.ec.firtsapirest.model.dto.ClienteDto;
import com.pipecoding.ec.firtsapirest.model.entity.Cliente;
import com.pipecoding.ec.firtsapirest.model.payload.MensajeResponse;
import com.pipecoding.ec.firtsapirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ICliente clienteService;

    @PostMapping("cliente")
    public ResponseEntity<?> create(@RequestBody ClienteDto clienteDto) {
        Cliente clienteSave = null;
        try {
            clienteSave = clienteService.save(clienteDto);
            clienteDto = ClienteDto.builder()
                    .idCliente(clienteSave.getIdCliente())
                    .nombre(clienteSave.getNombre())
                    .apellido(clienteSave.getApellido())
                    .correo(clienteSave.getCorreo())
                    .fechaRegistro(clienteSave.getFechaRegistro())
                    .build();

            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje("Guardar correctamente")
                    .object(clienteDto)
                    .build()
            , HttpStatus.CREATED);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje(e.getMessage())
                    .object(null)
                    .build()
                    , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("cliente")
    public ResponseEntity<?> update(@RequestBody ClienteDto clienteDto) {
        Cliente clienteUpdate = null;
        try {
            clienteUpdate = clienteService.save(clienteDto);
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje("Guardar correctamente")
                    .object(ClienteDto.builder()
                            .idCliente(clienteUpdate.getIdCliente())
                            .nombre(clienteUpdate.getNombre())
                            .apellido(clienteUpdate.getApellido())
                            .correo(clienteUpdate.getCorreo())
                            .fechaRegistro(clienteUpdate.getFechaRegistro())
                            .build())
                    .build()
                    , HttpStatus.CREATED);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje(e.getMessage())
                    .object(null)
                    .build()
                    , HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("cliente/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        try {
            Cliente clienteDelete = clienteService.findById(id);
            clienteService.delete(clienteDelete);
            return new ResponseEntity<>(clienteDelete, HttpStatus.NO_CONTENT);
        } catch (DataAccessException e) {
            return new ResponseEntity<>(MensajeResponse.builder()
                                    .mensaje(e.getMessage())
                                    .object(null)
                                    .build()
                    , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("cliente/{id}")
    public ResponseEntity<?> showById(@PathVariable Integer id) {
        Cliente cliente = clienteService.findById(id);

        if (cliente == null) {
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje("El registro que intenta buscar no existe ")
                    .object(null)
                    .build()
                    , HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(MensajeResponse.builder()
                .mensaje("")
                .object(ClienteDto.builder()
                        .idCliente(cliente.getIdCliente())
                        .nombre(cliente.getNombre())
                        .apellido(cliente.getApellido())
                        .correo(cliente.getCorreo())
                        .fechaRegistro(cliente.getFechaRegistro())
                        .build())
                .build()
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
