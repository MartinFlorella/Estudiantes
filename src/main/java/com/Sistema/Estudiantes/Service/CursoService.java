
package com.Sistema.Estudiantes.Service;

import com.Sistema.Estudiantes.Model.Curso;
import com.Sistema.Estudiantes.Repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{

    @Autowired 
    private ICursoRepository cursoRepo;
    
    @Override
    public void saveCurso(Curso curso) {
    
        cursoRepo.save(curso);
        
    
    }

    @Override
    public void deleteCurso(Long id_curso) {

        cursoRepo.deleteById(id_curso);
    
    }

    @Override
    public List<Curso> getCursos() {

        List<Curso> listaCurso = cursoRepo.findAll();
        return listaCurso;
    
    }

    @Override
    public Curso findCurso(Long id_curso) {

        return cursoRepo.findById(id_curso).orElse(null);
    
    }

    @Override
    public void editCurso(Curso curso) {
        
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> buscarCursosPorPalabraClave(String palabraClave) {
        List<Curso> listaCursos = cursoRepo.findAll();
         List<Curso> listaFiltrada = new ArrayList();
        for(Curso curso : listaCursos){
            if(curso.getNombre().contains(palabraClave)){
                listaFiltrada.add(curso);
                
            }
        }
        return listaFiltrada;
    
    }
    
}
