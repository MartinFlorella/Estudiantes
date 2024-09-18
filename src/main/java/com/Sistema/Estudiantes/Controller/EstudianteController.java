
package com.Sistema.Estudiantes.Controller;

import com.Sistema.Estudiantes.Model.Estudiante;
import com.Sistema.Estudiantes.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    
    @Autowired
    private IEstudianteService estudianteServi;
    
    @PostMapping("/estudiante/crear")
    public String saveEstudiante(@RequestBody Estudiante estudiante){
        
         estudianteServi.saveEstudiante(estudiante);
        
        return "El Estudiante fue creado con exito";
    } 
    
}
