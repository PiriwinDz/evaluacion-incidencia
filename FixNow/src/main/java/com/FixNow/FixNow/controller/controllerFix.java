package com.FixNow.FixNow.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FixNow.FixNow.service.serviceFix;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.FixNow.FixNow.modeloincidencia;
import java.util.List;

@RestController
@RequestMapping
public class controllerFix {
    private final serviceFix service;

    public controllerFix(serviceFix service) {
        this.service = service;
    }
    

@GetMapping("/listar")
public List <modeloincidencia>listar(){
    return service.obtenerlista();
    }


@DeleteMapping("/eliminar")
public String eliminar(@RequestBody java.util.map<modeloincidencia>,String body){;
    int id = body.remove(id);
    service.eliminar(id);
    return "eliminado correctamente";
    }
@PutMapping("/modificar")
public String modificar(@RequestBody java.util.map<modeloincidencia>,String body){;
    int antid =body.get(antid);
    int newid =body.get(newid);
    service.modificar(antid,newid);
    }
@PostMapping("/agregar")
public String agregar(@RequestBody modeloincidencia inc) {
    service.agregarincidencia(inc);
    return "Incidencia agregada correctamente";
}
