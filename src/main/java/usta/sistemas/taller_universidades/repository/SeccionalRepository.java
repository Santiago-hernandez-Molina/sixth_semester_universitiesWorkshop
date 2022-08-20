package usta.sistemas.taller_universidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.sistemas.taller_universidades.model.SeccionalEntity;

public interface SeccionalRepository extends JpaRepository<SeccionalEntity,Long> {
    @Query("SELECT COUNT(snl) FROM SeccionalEntity snl")
    public Integer countTotalSeccionales();
}
