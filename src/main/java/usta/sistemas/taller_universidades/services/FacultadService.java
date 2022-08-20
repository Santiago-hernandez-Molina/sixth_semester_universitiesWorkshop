package usta.sistemas.taller_universidades.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import usta.sistemas.taller_universidades.model.FacultadEntity;
import usta.sistemas.taller_universidades.repository.FacultadRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FacultadService {
    private final FacultadRepository facultadRepository;

    public List<FacultadEntity> getAllFacultades() {
        return facultadRepository.findAll();
    }

    public Optional<FacultadEntity> getFacultadById(Long id) {
        return facultadRepository.findById(id);
    }

    public int getCountFacultades(){
        return facultadRepository.countTotalFacultades();
    }
}
