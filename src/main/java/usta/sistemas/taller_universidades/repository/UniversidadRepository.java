package usta.sistemas.taller_universidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.sistemas.taller_universidades.model.UniversidadEntity;

public interface UniversidadRepository extends JpaRepository<UniversidadEntity,Long> {
    @Query("SELECT COUNT(uni) FROM UniversidadEntity uni")
    public Integer countTotalUniversidades();
}
