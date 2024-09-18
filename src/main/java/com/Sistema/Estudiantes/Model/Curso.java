
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


@Entity
@Getter @Setter
public class Curso {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_curso;
    private String nombre;
    private String codigo;
    private String descripcion;
    private int capacidad;
    private int estudiantesInscriptos;
    
    @JsonIgnore
    @OneToMany(mappedBy ="curso")
    private List<Inscripcion> inscripciones;
    
   

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String codigo, String descripcion, int capacidad, int estudiantesInscriptos, List<Inscripcion> inscripciones) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.estudiantesInscriptos = estudiantesInscriptos;
        this.inscripciones = inscripciones;
    }
   
    
}
