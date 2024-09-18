
package com.Sistema.Estudiantes.Controller;

import com.Sistema.Estudiantes.Model.Curso;
import com.Sistema.Estudiantes.Model.Estudiante;
import com.Sistema.Estudiantes.Model.Inscripcion;
import com.Sistema.Estudiantes.Service.IInscripcionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscripcionController {
    
    @Autowired
    private IInscripcionService inscripcionServi;
    
    @PostMapping("/inscripcion/crear")
    public String saveInscripcion(@RequestBody Inscripcion inscri, @RequestParam Long id_curso,
                                                   @RequestParam Long id_estudiante){
   return inscripcionServi.inscribirACurso(inscri, id_curso, id_estudiante);
}
    
    @GetMapping("/inscripcion/traerEstudiantes")
    public List<Estudiante> estudiantesDeUnCurso(@RequestParam Long id_curso){
        return inscripcionServi.estudiantesEnCurso(id_curso);
    }
    
    @GetMapping("/inscripcion/traerCursos")
    public List<Curso> cursosDeUnEstudiante(@RequestParam Long id_estudiante){
        return inscripcionServi.cursosDeEstudiante(id_estudiante);
    }
    
    @GetMapping("/inscripcion/Porcentaje")
    public Double porcentajeDeCapacidadDisponible(@RequestParam Long id_curso){
        
        return inscripcionServi.obtenerPorcentajeOcupacion(id_curso);
    }
}
