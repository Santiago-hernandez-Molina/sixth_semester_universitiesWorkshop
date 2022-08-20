package usta.sistemas.taller_universidades.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.sistemas.taller_universidades.model.FacultadEntity;
import usta.sistemas.taller_universidades.services.FacultadService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/facultad/")
@RequiredArgsConstructor
public class FacultadRest {

    private final FacultadService facultadService;

    @GetMapping("")
    public ResponseEntity<List<FacultadEntity>> listarFacultades() {
        return ResponseEntity.ok(facultadService.getAllFacultades());
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<FacultadEntity>> getFacultad(@PathVariable Long id){
        return ResponseEntity.ok(facultadService.getFacultadById(id));
    }
    @GetMapping("count")
    public ResponseEntity<String> getCountFacultades(){
        return ResponseEntity.ok("El número total de facultades es: "+ facultadService.getCountFacultades());
    }
}
