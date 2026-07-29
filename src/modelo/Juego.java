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
    private boolean juegoActivo;

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

    public boolean isJuegoActivo() {
        return juegoActivo;
    }
    
    

    public Juego(Nivel nivelActual) {
        this.jugador = new Jugador();
        this.tiempo = new Tiempo();
        this.nivelActual = nivelActual;
        iniciarPartida();
    }
    
    public void iniciarPartida(){
        this.tablero= new Tablero(this.nivelActual);
        this.jugador.reiniciar();
        this.tiempo.reiniciar();
        this.tiempo.iniciar();
        this.juegoActivo=true;
    }
    
    public void reiniciarPartida(){
        iniciarPartida();
    }
    public void cambiarNivel(Nivel nuevoNivel){
        this.nivelActual=nuevoNivel;
        
        iniciarPartida();
    }
    
    public void finalizarPartida(){
        this.juegoActivo=false;
        this.tiempo.detener();
    }
    
    public int getTotalParejas() {
    return this.nivelActual.getCantidadParejas();
}

    public int getParejasEncontradas() {
    return this.jugador.getParejasEncontradas();
}

    public int getParejasFaltantes() {
int faltantes;
faltantes = this.getTotalParejas()
- this.getParejasEncontradas();
return faltantes;
}

    public int getPuntaje() {
 return this.jugador.getPuntaje();
}

    public int getIntentos() {
return this.jugador.getIntentos();
}

    public String getTiempoPartida() {
return this.tiempo.getTiempoFormateado();
}
    
   
}
