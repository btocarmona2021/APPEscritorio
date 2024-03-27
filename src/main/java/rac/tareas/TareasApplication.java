package rac.tareas;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rac.tareas.presentacion.SistemaTareas;

@SpringBootApplication
public class TareasApplication {

    public static void main(String[] args) {
        Application.launch(SistemaTareas.class,args);
    }

}
