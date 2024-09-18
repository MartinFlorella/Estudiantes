
package com.Sistema.Estudiantes.Service;

import com.Sistema.Estudiantes.Model.Estudiante;
import java.util.List;

public interface IEstudianteService {
        //alta de Estudiante
    public void saveEstudiante(Estudiante estudiante);
    
    //baja de Estudiante
    public void deleteEstudiante(Long id_estudiante);
    
   //Traer la lista de los Estudiante
    public List<Estudiante> getEstudiantes();
    
    //lectura de un solo objeto
    public Estudiante  findEstudiante(Long id_estudiante);
   
    //Modificar Estudiante
    public void editEstudiante(Estudiante estudiante);
    
}
