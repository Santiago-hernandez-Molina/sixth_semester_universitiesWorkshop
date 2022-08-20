package usta.sistemas.taller_universidades.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "docentes")
@Setter
@Getter
public class DocenteEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private Long idDocente;

    @NotNull
    @Column(name = "documento_docente", length = 200)
    private String documentoDocente;

    @NotNull
    @Column(name = "nombres_docente", length = 200)
    private String nombresDocente;

    @NotNull
    @Column(name = "apellidos_docente", length = 200)
    private String apellidosDocente;

    @NotNull
    @Column(name = "tipo_docente")
    private int tipoDocente;

    @JoinColumn(name = "id_facultad")
    @ManyToOne(fetch = FetchType.EAGER)
    private FacultadEntity facultadEntity;

}
