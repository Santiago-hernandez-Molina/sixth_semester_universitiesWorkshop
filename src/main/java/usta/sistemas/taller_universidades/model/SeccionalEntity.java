package usta.sistemas.taller_universidades.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name = "seccionales")
public class SeccionalEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seccional")
    private Long idSeccional;

    @NotNull
    @Column(name = "direccion_seccional", length = 200)
    private String direccionSeccional;

    @NotNull
    @Column(name = "nombre_seccional", length = 200)
    private String nombreSeccional;

    @JoinColumn(name = "id_universidad", referencedColumnName = "id_universidad")
    @ManyToOne(fetch = FetchType.EAGER)
    private UniversidadEntity universidadEntity;

}
