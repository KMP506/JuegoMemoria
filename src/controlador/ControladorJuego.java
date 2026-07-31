/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
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
   
    
    
       public ControladorJuego(Nivel nivel, FrmJuego vista){
        this.juego=new Juego(nivel);
        this.vista=vista;
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
        return this.juego.isComparacion();
    }
    public boolean isJuegoActivo(){
        return juego.isJuegoActivo();
    }
    
    public void iniciarPartida(){
        this.juego.iniciarPartida();
    }
    
    public void reiniciarPartida(){
        this.juego.iniciarPartida();
        this.vista.reiniciarValores();
    }
    

    public void seleccionarCarta(int fila,int columna){
        if (juego.isJuegoActivo()==false){
            return;
        }
        if (esperandoComparacion==true){
            return;
        }
        Carta carta=juego.getTablero().obtenerCarta(fila, columna);
        if (carta.isEncontrada()==true||carta.isVisible()==true){
            return;
        }
        if (primeraCartaSeleccionada==false){
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
  
