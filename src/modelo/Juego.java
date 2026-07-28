/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author efrai
 */
public class Juego {
    
    
    private Tablero tablero;
    private Jugador jugador;
    private Tiempo tiempo;
    private Nivel nivelActual;

    public Tablero getTablero() {
        return tablero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }

    public Nivel getNivelActual() {
        return nivelActual;
    }

    public Juego(Nivel nivelActual) {
        this.tablero = new Tablero(nivelActual);
        this.jugador = new Jugador();
        this.tiempo = new Tiempo();
        this.nivelActual = nivelActual;
    }
    
    
    
}
