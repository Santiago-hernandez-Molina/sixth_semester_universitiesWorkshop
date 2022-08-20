package usta.sistemas.taller_universidades.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.sistemas.taller_universidades.model.FacultadEntity;
import usta.sistemas.taller_universidades.model.UniversidadEntity;
import usta.sistemas.taller_universidades.services.UniversidadService;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/universidad/")
@RestController
@RequiredArgsConstructor
public class UniversidadRest {
    private final UniversidadService universidadService;

    @GetMapping("")
    public ResponseEntity<List<UniversidadEntity>> listarUniversidades() {
        return ResponseEntity.ok(universidadService.getAllUniversidades());
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<UniversidadEntity>> getUniversidad(@PathVariable Long id){
        return ResponseEntity.ok(universidadService.getUniversidadById(id));
    }
    @GetMapping("count")
    public ResponseEntity<String> getCountUniversidades(){
        return ResponseEntity.ok("El número total de universidades es: "+ universidadService.getCountUniversidades());
    }
}
