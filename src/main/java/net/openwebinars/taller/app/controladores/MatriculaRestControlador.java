package net.openwebinars.taller.app.controladores;

import net.openwebinars.taller.app.modelos.Auto;
import net.openwebinars.taller.app.modelos.Matricula;
import net.openwebinars.taller.app.servicios.AutoServicio;
import net.openwebinars.taller.app.servicios.MatriculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "ws/matricula/")
@CrossOrigin("*")
public class MatriculaRestControlador {

    @Autowired
    private MatriculaServicio servicio;

    @PostMapping(value = "/guardar")
    public int guardar(@RequestBody Matricula in) {
        return servicio.guardar(in);
    }



}
