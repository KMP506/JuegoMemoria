/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author efrai
 */
public class Carta {
    
    
    private String imagen;
    private boolean visible;
    private boolean encontrada;
    
    public Carta(String imagen){
        this.imagen=imagen;
        this.visible=false;
        this.encontrada=false;
    }

    public String getImagen() {
        return imagen;
    }

    public boolean isVisible() {
        return visible;
    }

    public boolean isEncontrada() {
        return encontrada;
    }
    
    public void mostrar(){
        visible=true;
    }
    
    public void ocultar(){
        if(!encontrada){
            visible=false;
        }
    }
    public void marcarEncontrada(){
        encontrada=true;
        visible=true;
    }
    public boolean esParejaDe(Carta otraCarta){
        
        if(otraCarta==null){
            return false;
        }
        return imagen.equals(otraCarta.getImagen());
    }
}
