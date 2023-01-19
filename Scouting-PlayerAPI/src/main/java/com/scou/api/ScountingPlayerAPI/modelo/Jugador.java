package com.scou.api.ScountingPlayerAPI.modelo;


import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "jugador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String NombreJugador;
    private String ApellidoJugador;
    private String EdadJugador;
    private String NacionalidadJugador;
    private String AlturaJugador;
    private String PosicionJugador;
    private String ClubAnteriorJugador;
    private String ClubActualJugador;
    private String ValorMercadoJugador;
    private String SalarioJugador;
    private String PartidosJugadosJugador;
    private String GolesJugador;
    private String AsistenciasJugador;
}
