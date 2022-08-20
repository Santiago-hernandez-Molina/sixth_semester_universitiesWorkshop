package usta.sistemas.taller_universidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.sistemas.taller_universidades.model.DocenteEntity;

public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {
    @Query("SELECT count(doct) from DocenteEntity doct")
    public Integer countTotalDocentes();
}
