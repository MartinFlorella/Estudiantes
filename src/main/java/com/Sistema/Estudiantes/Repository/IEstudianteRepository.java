
package com.Sistema.Estudiantes.Repository;

import com.Sistema.Estudiantes.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository <Estudiante , Long> {
    
}
