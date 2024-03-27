package rac.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rac.tareas.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea,Integer> {
}
