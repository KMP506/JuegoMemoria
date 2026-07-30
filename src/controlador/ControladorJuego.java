/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import modelo.Carta;
import modelo.Juego;
import modelo.Jugador;
import modelo.Nivel;
import modelo.Tablero;
import modelo.Tiempo;
import vista.FrmJuego;
/**
 *
 * @author efrai
 */
public class ControladorJuego {
    private Juego juego;
    private FrmJuego vista;
    private int filaCarta1;
    private int columnaCarta1;
    private int filaCarta2;
    private int columnaCarta2;
    private boolean primeraCartaSeleccionada;
    private boolean esperandoComparacion;
    private boolean juegoActivo;
    
       public ControladorJuego(Nivel nivel){
        this.juego=new Juego(nivel);
        this.vista=vista;
        iniciarPartida();
    }
    
    public Tablero getTablero(){
        return this.juego.getTablero();
    }
    public Jugador getJugador(){
        return this.juego.getJugador();
    }
    public Tiempo getTiempo(){
        return this.juego.getTiempo();
    }
    public Nivel getNivelActual(){
        return this.juego.getNivelActual();
    }
    public boolean isEsperandoComparacion(){
        return this.esperandoComparacion;
    }
    public boolean isJuegoActivo(){
        return this.juegoActivo;
    }
    
    public void iniciarPartida(){
        juego.iniciarPartida();
        primeraCartaSeleccionada=false;
        esperandoComparacion=false;
    }
    private void finalizarJuego() {
        juego.finalizarPartida();
    }
    public void reiniciarPartida(){
        iniciarPartida();
    }
    
    public void cambiarNivel(Nivel nivel){
        juego.cambiarNivel(nivel);
        primeraCartaSeleccionada=false;
        esperandoComparacion=false;
    }
      private void verificarPareja(){
        Carta carta1=juego.getTablero().obtenerCarta(filaCarta1, columnaCarta1);
        Carta carta2=juego.getTablero().obtenerCarta(filaCarta2, columnaCarta2);
        juego.getJugador().aumentarIntentos();
        if (juego.getTablero().compararCartas(carta1, carta2)){
            carta1.marcarEncontrada();
            carta2.marcarEncontrada();
            juego.getJugador().registrarParejaEncontrada();
            primeraCartaSeleccionada=false;
            esperandoComparacion=false;
            if (juego.getTablero().juegoTerminado()){
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
        Carta carta=juego.getTablero().obtenerCarta(fila, columna);
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
  
