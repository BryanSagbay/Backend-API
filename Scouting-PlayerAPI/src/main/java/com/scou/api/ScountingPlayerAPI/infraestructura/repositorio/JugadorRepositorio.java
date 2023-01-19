package com.scou.api.ScountingPlayerAPI.infraestructura.repositorio;

import com.scou.api.ScountingPlayerAPI.modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepositorio extends JpaRepository<Jugador, Integer> {


}