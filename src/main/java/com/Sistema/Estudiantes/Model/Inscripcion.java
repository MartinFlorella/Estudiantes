
package com.Sistema.Estudiantes.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Inscripcion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_inscripcion;
    private LocalDate fechaInscripcion;
    
    //Relacion ManyToOne con estudiante
    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;
    
    //Relacion ManyToOne con curso
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Inscripcion(Long id_inscripcion, LocalDate fechaInscripcion, Estudiante estudiante, Curso curso) {
        this.id_inscripcion = id_inscripcion;
        this.fechaInscripcion = fechaInscripcion;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Inscripcion() {
    }

    

   

  


}
