package usta.sistemas.taller_universidades.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import usta.sistemas.taller_universidades.model.UniversidadEntity;
import usta.sistemas.taller_universidades.repository.UniversidadRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UniversidadService {

    private final UniversidadRepository universidadRepository;

    public List<UniversidadEntity> getAllUniversidades() {
        return universidadRepository.findAll();
    }

    public Optional<UniversidadEntity> getUniversidadById(Long id){
        return universidadRepository.findById(id);
    }

    public int getCountUniversidades(){
        return universidadRepository.countTotalUniversidades();
    }

}
