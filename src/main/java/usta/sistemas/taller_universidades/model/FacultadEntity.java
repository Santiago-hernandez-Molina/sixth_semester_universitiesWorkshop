package usta.sistemas.taller_universidades.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "facultades")
@Setter
@Getter
public class FacultadEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facultad")
    private Long idFacultad;

    @NotNull
    @Column(name = "nombre_facultad", length = 200)
    private String nombreFacultad;

    @JoinColumn(name = "id_seccional", referencedColumnName = "id_seccional")
    @ManyToOne(fetch = FetchType.EAGER)
    private SeccionalEntity seccionalEntity;

}
