package usta.sistemas.taller_universidades.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.sistemas.taller_universidades.model.SeccionalEntity;
import usta.sistemas.taller_universidades.services.SeccionalService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/seccional/")
@RequiredArgsConstructor
public class SeccionalRest {
    private final SeccionalService seccionalService;

    @GetMapping("")
    public ResponseEntity<List<SeccionalEntity>> listarSeccionales() {
        return ResponseEntity.ok(seccionalService.getAllSeccionales());
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<SeccionalEntity>> getSeccional(@PathVariable Long id){
        return ResponseEntity.ok(seccionalService.getSeccionalById(id));
    }
    @GetMapping("count")
    public ResponseEntity<String> getCountSeccionales(){
        return ResponseEntity.ok("El número total de seccionales es: "+ seccionalService.getCountSeccionales());
    }
}
