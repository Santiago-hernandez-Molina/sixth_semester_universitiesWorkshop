package usta.sistemas.taller_universidades.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.sistemas.taller_universidades.model.DocenteEntity;
import usta.sistemas.taller_universidades.services.DocenteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/docente/")
@RequiredArgsConstructor
public class DocenteRest {
    private final DocenteService docenteService;

    @GetMapping("")
    public ResponseEntity<List<DocenteEntity>> listarDocentes() {
        return ResponseEntity.ok(docenteService.getAllDocentes());
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<DocenteEntity>> getDocente(@PathVariable Long id){
        return ResponseEntity.ok(docenteService.getDocenteById(id));
    }
    @GetMapping("count")
    public ResponseEntity<String> getCountDocentes(){
        return ResponseEntity.ok("El número total de docentes es: "+docenteService.getCountDocentes());
    }
}
