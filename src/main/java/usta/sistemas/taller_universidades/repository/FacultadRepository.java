package usta.sistemas.taller_universidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.sistemas.taller_universidades.model.FacultadEntity;

public interface FacultadRepository extends JpaRepository<FacultadEntity,Long> {
    @Query("SELECT COUNT(fct) FROM FacultadEntity fct")
    public Integer countTotalFacultades();
}
