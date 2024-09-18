
package com.Sistema.Estudiantes.Repository;

import com.Sistema.Estudiantes.Model.Curso;
import com.Sistema.Estudiantes.Model.Estudiante;
import com.Sistema.Estudiantes.Model.Inscripcion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscripcionRepository extends JpaRepository<Inscripcion, Long>{

    public Optional<Inscripcion> findByCursoAndEstudiante(Curso curso, Estudiante estu);
    
}
