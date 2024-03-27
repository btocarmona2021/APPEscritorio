package rac.tareas.service;

import org.springframework.stereotype.Service;
import rac.tareas.model.Tarea;
import rac.tareas.repository.TareaRepository;

import java.util.List;

@Service
public class TareaService implements ITareaservice {
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @Override
    public List<Tarea> listarTareas() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea buscarTaresPorId(Integer idTarea) {
        return tareaRepository.findById(idTarea).orElse(null);
    }

    @Override
    public void guardarTarea(Tarea tarea) {
        tareaRepository.save(tarea);
    }

    @Override
    public void eliminarTarea(Tarea tarea) {
    tareaRepository.delete(tarea);
    }
}
