/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import modelo.Carta;
import modelo.Jugador;
import modelo.Nivel;
import modelo.Tablero;
import modelo.Tiempo;
/**
 *
 * @author efrai
 */
public class ControladorJuego {
    private Tablero tablero;
    private Jugador jugador;
    private Tiempo tiempo;
    private Nivel nivelActual;
    private int filaCarta1;
    private int columnaCarta1;
    private int filaCarta2;
    private int columnaCarta2;
    private boolean primeraCartaSeleccionada;
    private boolean esperandoComparacion;
    private boolean juegoActivo;
    
       public ControladorJuego(Nivel nivel){
        this.nivelActual=nivel;
        iniciarPartida();
    }
    
    public Tablero getTablero(){
        return this.tablero;
    }
    public Jugador getJugador(){
        return this.jugador;
    }
    public Tiempo getTiempo(){
        return this.tiempo;
    }
    public Nivel getNivelActual(){
        return this.nivelActual;
    }
    public boolean isEsperandoComparacion(){
        return this.esperandoComparacion;
    }
    public boolean isJuegoActivo(){
        return this.juegoActivo;
    }
    
    public void iniciarPartida(){
        tablero=new Tablero(nivelActual);
        jugador=new Jugador();
        tiempo=new Tiempo();
        tiempo.iniciar();
        primeraCartaSeleccionada=false;
        esperandoComparacion=false;
        juegoActivo=true;
    }
    private void finalizarJuego() {
        juegoActivo = false;
        tiempo.detener();
    }
    public void reiniciarPartida(){
        iniciarPartida();
    }
    
    public void cambiarNivel(Nivel nivel){
        this.nivelActual=nivel;
        iniciarPartida();
    }
      private void verificarPareja(){
        Carta carta1=tablero.obtenerCarta(filaCarta1, columnaCarta1);
        Carta carta2=tablero.obtenerCarta(filaCarta2, columnaCarta2);
        jugador.aumentarIntentos();
        if (tablero.compararCartas(carta1, carta2)){
            carta1.marcarEncontrada();
            carta2.marcarEncontrada();
            jugador.registrarParejaEncontrada();
            primeraCartaSeleccionada=false;
            esperandoComparacion=false;
            if (tablero.juegoTerminado()){
                finalizarJuego();
            }
        }else{
            Timer temporizador=new Timer(2000,new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evento){
                    carta1.ocultar();
                    carta2.ocultar();
                    primeraCartaSeleccionada=false;
                    esperandoComparacion=false;
                }
            });
            temporizador.setRepeats(false);
            temporizador.start();
        }
    }
    public void seleccionarCarta(int fila,int columna){
        if (!juegoActivo){
            return;
        }
        if (esperandoComparacion){
            return;
        }
        Carta carta=tablero.obtenerCarta(fila, columna);
        if (carta.isEncontrada()||carta.isVisible()){
            return;
        }
        if (!primeraCartaSeleccionada){
            carta.mostrar();
            filaCarta1=fila;
            columnaCarta1=columna;
            primeraCartaSeleccionada=true;
        }else{
            if (fila==filaCarta1&&columna==columnaCarta1){
                return;
            }
            carta.mostrar();
            filaCarta2=fila;
            columnaCarta2=columna;
            esperandoComparacion=true;
            verificarPareja();
        }
    }
}  
  
