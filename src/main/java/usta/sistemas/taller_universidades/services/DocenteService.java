package usta.sistemas.taller_universidades.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import usta.sistemas.taller_universidades.model.DocenteEntity;
import usta.sistemas.taller_universidades.repository.DocenteRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DocenteService {
    private final DocenteRepository docenteRepository;

    public List<DocenteEntity> getAllDocentes() {
        return docenteRepository.findAll();
    }

    public Optional<DocenteEntity> getDocenteById(Long id){
        return docenteRepository.findById(id);
    }
    public int getCountDocentes(){
        return docenteRepository.countTotalDocentes();
    }
}
