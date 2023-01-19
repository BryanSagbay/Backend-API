package com.scou.api.ScountingPlayerAPI.controller;
import com.scou.api.ScountingPlayerAPI.infraestructura.repositorio.JugadorRepositorio;
import com.scou.api.ScountingPlayerAPI.modelo.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")public class JugadorController {
    @Autowired
    JugadorRepositorio jugadorRepositorio;

    @GetMapping("/jugadores")
    @ResponseStatus(HttpStatus.OK)
    public List<Jugador> getJugadores()
    {
        return jugadorRepositorio.findAll();
    }
    @PostMapping("/guardarjugador")
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador saveJugador(@RequestBody Jugador jugador){
        return jugadorRepositorio.save(jugador);
    }
    @PutMapping("/actualizarjugador")
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador updateJugador(@RequestBody Jugador jugador)
    {
        return jugadorRepositorio.save(jugador);
    }

    @DeleteMapping("/eliminarjugador/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJugador(@PathVariable int id)
    {
        jugadorRepositorio.deleteById(id);
    }

}






