
package com.Sistema.Estudiantes.Service;

import com.Sistema.Estudiantes.Model.Estudiante;
import com.Sistema.Estudiantes.Repository.IEstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService implements IEstudianteService{

    @Autowired
    private IEstudianteRepository estudianteRepo;
    
    @Override
    public void saveEstudiante(Estudiante estudiante) {

        estudianteRepo.save(estudiante);
    
    }

    @Override
    public void deleteEstudiante(Long id_estudiante) {

        estudianteRepo.deleteById(id_estudiante);
    
    }

    @Override
    public List<Estudiante> getEstudiantes() {

        List<Estudiante> listaEstudiantes = estudianteRepo.findAll();
        return listaEstudiantes;
        
    
    }

    @Override
    public Estudiante findEstudiante(Long id_estudiante) {

        Estudiante estudiante = estudianteRepo.findById(id_estudiante).orElse(null);
        
        return estudiante;
    
    }

    @Override
    public void editEstudiante(Estudiante estudiante) {

        estudianteRepo.save(estudiante);
    
    }
    
}
