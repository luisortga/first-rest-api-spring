package com.pipecoding.ec.firtsapirest.model.payload;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Builder
public class MensajeResponse implements Serializable {

    private String mensaje;
    private Object object;
}
