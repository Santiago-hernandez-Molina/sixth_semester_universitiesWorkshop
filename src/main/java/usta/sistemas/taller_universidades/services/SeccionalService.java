package usta.sistemas.taller_universidades.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import usta.sistemas.taller_universidades.model.SeccionalEntity;
import usta.sistemas.taller_universidades.repository.SeccionalRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SeccionalService {

    private final SeccionalRepository seccionalRepository;

    public List<SeccionalEntity> getAllSeccionales() {
        return seccionalRepository.findAll();
    }

    public Optional<SeccionalEntity> getSeccionalById(Long id){
        return seccionalRepository.findById(id);
    }

    public int getCountSeccionales(){
        return seccionalRepository.countTotalSeccionales();
    }
}
