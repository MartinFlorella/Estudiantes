
package com.Sistema.Estudiantes.Service;

import com.Sistema.Estudiantes.Model.Curso;
import com.Sistema.Estudiantes.Model.Estudiante;
import com.Sistema.Estudiantes.Model.Inscripcion;
import com.Sistema.Estudiantes.Repository.ICursoRepository;
import com.Sistema.Estudiantes.Repository.IEstudianteRepository;
import com.Sistema.Estudiantes.Repository.IInscripcionRepository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscripcionService implements IInscripcionService {

    @Autowired
    private IInscripcionRepository inscripcionRepo;
    @Autowired
     private IEstudianteRepository estudianteRepo;
   @Autowired
    private ICursoRepository cursoRepo;
    
    
    @Override
    public void saveInscripcion(Inscripcion inscripcion) {

    inscripcionRepo.save(inscripcion);
    
    }

    @Override
    public void deleteInscripcion(Long id_inscripcion) {

        inscripcionRepo.deleteById(id_inscripcion);
        
    
    }

    @Override
    public List<Inscripcion> getInscripciones() {

    List<Inscripcion> listaInscripcion =  inscripcionRepo.findAll();
    return listaInscripcion;
    
    }

    @Override
    public Inscripcion findInscripcion(Long id_inscripcion) {

        return inscripcionRepo.findById(id_inscripcion).orElse(null);
    
    }

    @Override
    public void editInscripcion(Inscripcion inscripcion) {

        inscripcionRepo.save(inscripcion);
    
    }

    @Override
    public String inscribirACurso(Inscripcion inscri, Long id_curso, Long id_estudiante) {

        Curso  curso = cursoRepo.findById(id_curso).orElse(null);
        Estudiante estu = estudianteRepo.findById(id_estudiante).orElse(null);
       
        // Verificar si el estudiante ya está inscrito en el curso
        
        
        
      
        
      inscri.setCurso(curso);
      inscri.setEstudiante(estu);
      if(inscri.getCurso().getCapacidad() > (inscri.getCurso().getEstudiantesInscriptos() + 1)){
         
          inscri.getCurso().setEstudiantesInscriptos( inscri.getCurso().getEstudiantesInscriptos() + 1) ;
          inscripcionRepo.save(inscri);
           return "El Alumno fue inscripto al curso con exito";
    
          }
      else{
          return " Capacidad maxima del curso alcanzada";
      }         
            
    
    }

    @Override
    public List<Estudiante> estudiantesEnCurso(Long id_curso) {

    List<Inscripcion> listaInscriptos = getInscripciones();
    List<Estudiante> listaEstudiantes = new ArrayList();
    for(Inscripcion inscri : listaInscriptos){
        if(inscri.getCurso().getId_curso().equals(id_curso)){
            listaEstudiantes.add(inscri.getEstudiante());
        }
    }
    return listaEstudiantes;
    }

    @Override
    public List<Curso> cursosDeEstudiante(Long id_estudiante) {
        List<Inscripcion> listaInscriptos = getInscripciones();
        List<Curso> listaCursos = new ArrayList();
        for(Inscripcion inscri : listaInscriptos){
            if(inscri.getEstudiante().getId_estudiante().equals(id_estudiante)){
                listaCursos.add(inscri.getCurso());
            }
        }
        return listaCursos;
    
    }

    @Override
    public Double obtenerPorcentajeOcupacion(Long idCurso) {

    Double porcentaje= 0.0;
    Curso curso = cursoRepo.findById(idCurso).orElse(null);
        int capacidad = curso.getCapacidad();
        int inscriptos=  curso.getEstudiantesInscriptos();
        porcentaje = ((inscriptos * 1.0) /  (capacidad * 1.0)) * 100;
    
    return porcentaje;
    }
}
