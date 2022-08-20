package usta.sistemas.taller_universidades.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "universidades")
public class UniversidadEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_universidad")
    private Long idUniversidad;

    @NotNull
    @Column(name = "nombre_universidad", length = 200)
    private String nombreUniversidad;

    @NotNull
    @Column(name = "nit_universidad", length = 200)
    private String nitUniversidad;

    @NotNull
    @Column(name = "nombre_pais", length = 50)
    private String nombrePais;

}
