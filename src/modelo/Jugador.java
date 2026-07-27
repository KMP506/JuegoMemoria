/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author efrai
 */
public class Jugador {
    private int puntaje;
    private int intentos;
    private int parejasEncontradas;
    
    public Jugador(){
        puntaje=0;
        intentos=0;
        parejasEncontradas=0;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getIntentos() {
        return intentos;
    }
    
    public int getParejasEncontradas() {
        return parejasEncontradas;
    }
       public void aumentarIntentos(){
        intentos++;
        puntaje -=20;
    }
    
    public void registrarParejaEncontrada(){
        parejasEncontradas++;
        puntaje+=100;
        
    }
    public void reiniciar(){
        puntaje=0;
        intentos=0;
        parejasEncontradas=0;
    }
}
