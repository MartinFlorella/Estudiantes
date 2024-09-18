
package com.Sistema.Estudiantes.Controller;

import com.Sistema.Estudiantes.Model.Curso;
import com.Sistema.Estudiantes.Service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    private ICursoService cursoServi;
    
    @PostMapping("/curso/crear")
    public String saveCurso(@RequestBody Curso curso){
        
        cursoServi.saveCurso(curso);
        return "El curso fue registrado con exito";
    }
}
