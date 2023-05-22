package net.openwebinars.taller.app.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Matricula implements Serializable {

    private String id;
    private String nombrePropietario;
    private String placa;
    private String marca;
    private String modelo;

}
