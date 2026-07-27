/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author efrai
 */
public class Tiempo {
    
    private int segundos;
    private boolean activo;
    
    public Tiempo(){
        segundos=0;
        activo=false;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean isActivo() {
        return activo;
    }
    
    public void iniciar(){
        activo =true;
    }
    
    public void detener(){
        activo=false;
    }
    
    public void aumentarSegundos(){
        if(activo){
            segundos++;
        }
    }
    
    public void reiniciar(){
        segundos=0;
        activo=false;
    }
    
    public String getTiempoFormateado(){
        int minutos=segundos/60;
        int segundosRestantes=segundos%60;
        
        String textoMinutos;
        String textoSegundos;
        
        if(minutos<10){
            textoMinutos="0"+minutos;
        }else{
            textoMinutos=""+minutos;
        }
        if(segundosRestantes<10){
            textoSegundos="0"+segundosRestantes;
        }else{
            textoSegundos=""+segundosRestantes;
        }
        return textoMinutos+":"+textoSegundos;
    }
    
    
}
