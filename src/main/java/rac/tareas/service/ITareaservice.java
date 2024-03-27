package rac.tareas.service;

import rac.tareas.model.Tarea;

import java.util.List;

public interface ITareaservice {
    public List<Tarea> listarTareas();
    public Tarea buscarTaresPorId(Integer idTarea);
    public void guardarTarea (Tarea tarea);
    public void eliminarTarea(Tarea tarea);
}
