/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
 
import java.util.Random;
 
/**
 *
 * @author efrai
 *///////
public class Tablero {
    
    private Carta[][] cartas;
    private Nivel nivel;
    private int filas;
    private int columnas;
    
    public Tablero(Nivel nivel){
        this.nivel=nivel;
        filas=nivel.getFilas();
        columnas=nivel.getColumnas();
        cartas=new Carta[filas][columnas];
        inicializar();
    }
    
    public void inicializar(){
        int cantidadCarta=filas*columnas;
        int cantidadParejas=cantidadCarta/2;
        
        String[] imagenes=new String[cantidadCarta];
        int contador=0;
        
        for(int i=1;i<=cantidadParejas;i++){
            imagenes[contador]="imagen"+ i;
            contador++;
            imagenes[contador]="imagen"+i;
            contador++;
        }
        
        Random random=new Random();
        for(int i=0;i<imagenes.length;i++){
            int posicion=random.nextInt(imagenes.length);
            String temporal=imagenes[i];
            imagenes[i]=imagenes[posicion];
            imagenes[posicion]=temporal;
        }
        
        contador=0;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<columnas;columna++){
                cartas[fila][columna]=new Carta(imagenes[contador]);
                contador++;
            }
        }
    }
    
    public Carta obtenerCarta(int fila, int columna){
        return cartas[fila][columna];
    }
    
    public boolean compararCartas(Carta carta1, Carta carta2){
        return carta1.esParejaDe(carta2);
    }
    
    public boolean juegoTerminado(){
        boolean terminado=true;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<columnas;columna++){
                if(!cartas[fila][columna].isEncontrada()){
                    terminado=false;
                }
            }
        }
        return terminado;
    }
    
    public void reiniciar(){
        inicializar();
    }
 
    public int getFilas() {
        return filas;
    }
 
    public int getColumnas() {
        return columnas;
    }
}