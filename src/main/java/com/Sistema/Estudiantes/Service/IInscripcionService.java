/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Sistema.Estudiantes.Service;

import com.Sistema.Estudiantes.Model.Curso;
import com.Sistema.Estudiantes.Model.Estudiante;
import com.Sistema.Estudiantes.Model.Inscripcion;
import java.util.List;

/**
 *
 * @author user
 */
public interface IInscripcionService {
    //alta de Inscripcion
    public void saveInscripcion(Inscripcion inscripcion);
    
    //baja de Inscripcion
    public void deleteInscripcion(Long id_inscripcion);
    
   //Traer la lista de las Inscripciones
    public List<Inscripcion> getInscripciones();
    
    //lectura de un solo objeto
    public Inscripcion  findInscripcion(Long id_inscripcion);
   
    //Modificar Inscripcion
    public void editInscripcion(Inscripcion inscripcion);
    
    //Inscribir un alumno a un curso
    public String inscribirACurso(Inscripcion inscri, Long id_curso, Long id_estudiante);
    
    //Consultar Estudiantes Inscritos en un Curso:
    public List<Estudiante> estudiantesEnCurso(Long id_curso);
    
//Consultar cursos de un estudiante
    public List<Curso> cursosDeEstudiante(Long id_estudiante);
    
    //Consultar el porcentaje de ocupación de un curso
    public Double obtenerPorcentajeOcupacion(Long idCurso);
}
