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
        this.juego.reiniciarPartida();
        this.vista.reiniciarValores();
    }
    
    public void cambiarNivel(Nivel nivel){
        
        this.juego.cambiarNivel(nivel);
        this.vista.reiniciarValores();
    }
    
    private void validarPareja(){
        boolean pareja;
        
        pareja=juego.verificarPareja();
        if(pareja==false){
            juego.ocultarCartas();
        }
    }

    public void seleccionarCarta(int fila,int columna){
        boolean seleccionValida;
        
        seleccionValida=juego.seleccionarCarta(fila, columna);
        if(seleccionValida==false){
            return;
        }
        if(juego.isComparacion()==true){
            Timer espera;
            espera= new Timer(2000, e->validarPareja());
            
            espera.setRepeats(false);
            espera.start();
            
            
        }
    }
}  
  
