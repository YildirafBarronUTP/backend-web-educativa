package org.example.repository;

import org.example.model.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntuacionRepository extends JpaRepository<Puntuacion, Long> {
    // Spring Boot se encarga de programar el Insert, Update, Select y Delete automáticamente
}