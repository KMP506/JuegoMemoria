/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import javax.swing.Timer;
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
    private Timer cronometro;
   
    
    
       public ControladorJuego(Nivel nivel, FrmJuego vista){
        this.juego=new Juego(nivel);
        this.vista=vista;
        cronometro=new Timer (1000, e->aumentarTiempo());
        cronometro.start();
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
        this.juego.reiniciarPartida();
        this.vista.reiniciarValores();
        this.vista.actualizarTablero();
        this.cronometro.start();
    }
    
    public void cambiarNivel(Nivel nivel){
        this.vista.actualizarTablero();
        this.juego.cambiarNivel(nivel);
        this.vista.reiniciarValores();
        this.cronometro.start();
    }
    
    private void validarPareja(){
        boolean pareja;
       
        pareja=juego.verificarPareja();
        if(pareja==false){
            juego.ocultarCartas();
            
        }
        vista.actualizarTablero();
        vista.actualizarValores();
    }

    public void seleccionarCarta(int fila,int columna){
        boolean seleccionValida;
        
        
        seleccionValida=juego.seleccionarCarta(fila, columna);
        if(seleccionValida==false){
            return;
        }
        vista.actualizarTablero();
        
        if(juego.isComparacion()==true){
            Timer espera;
            espera= new Timer(2000, e->validarPareja());
            
            espera.setRepeats(false);
            espera.start();
        }    
    }
    
    private void aumentarTiempo(){
        if (juego.isJuegoActivo()==true){
            juego.getTiempo().aumentarSegundos();
            vista.actualizarTiempo(juego.getTiempo().getTiempoFormateado());
        }else{
            cronometro.stop();
        }
        
    }
    
}  
  
