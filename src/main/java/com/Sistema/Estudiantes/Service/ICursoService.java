
package com.Sistema.Estudiantes.Service;

import com.Sistema.Estudiantes.Model.Curso;
import java.util.List;

public interface ICursoService {
    
    //alta de Curso
    public void saveCurso(Curso curso);
    
    //baja de Curso
    public void deleteCurso(Long id_curso);
    
   //Traer la lista de los Cursos
    public List<Curso> getCursos();
    
    //lectura de un solo objeto
    public Curso  findCurso(Long id_curso);
   
    //Modificar Curso
    public void editCurso(Curso curso);
    
    //Buscar Cursos por Palabra Clave:
    public List<Curso> buscarCursosPorPalabraClave(String palabraClave);
    
}
