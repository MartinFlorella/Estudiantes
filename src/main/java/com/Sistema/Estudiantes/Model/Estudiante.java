
package com.Sistema.Estudiantes.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudiante {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_estudiante;
    private String nombre;
    private String matricula;
    private String email;
   
    @JsonIgnore
    @OneToMany(mappedBy = "estudiante")
    private List<Inscripcion> inscripciones;

    public Estudiante(Long id_estudiante, String nombre, String matricula, String email, List<Inscripcion> inscripciones) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.matricula = matricula;
        this.email = email;
        this.inscripciones = inscripciones;
    }

    public Estudiante() {
    }
    
}
