
package com.Sistema.Estudiantes.Repository;

import com.Sistema.Estudiantes.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository <Curso, Long>{
    
}
