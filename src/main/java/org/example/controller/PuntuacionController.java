package org.example.controller;

import org.example.model.Puntuacion;
import org.example.repository.PuntuacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/puntuaciones")
@CrossOrigin(origins = "*") // ¡Súper importante! Permite que el frontend (Hostinger) se comunique con este backend
public class PuntuacionController {

    @Autowired
    private PuntuacionRepository repository;

    // Ruta para que el juego envíe la puntuación al terminar
    @PostMapping
    public Puntuacion guardarPuntuacion(@RequestBody Puntuacion puntuacion) {
        puntuacion.setFecha(LocalDateTime.now());
        return repository.save(puntuacion);
    }

    // Ruta para que la profesora pueda ver todos los resultados
    @GetMapping
    public List<Puntuacion> obtenerTodas() {
        return repository.findAll();
    }
}