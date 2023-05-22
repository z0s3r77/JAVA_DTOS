package net.openwebinars.taller.app.modelos;

import org.springframework.stereotype.Component;

@Component
public class MatriculaMapper {

    public Auto toAuto(Matricula in){

        return Auto.builder()
                .placa(in.getPlaca())
                .marca(in.getMarca())
                .modelo(in.getModelo())
                .propietario(in.getId())
                .build();

    }

    public Persona toPersona(Matricula in){

        return Persona.builder()
                .id(in.getId())
                .nombre(in.getNombrePropietario())
                .build();

    }


}
