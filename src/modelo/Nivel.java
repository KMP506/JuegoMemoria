/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo;

/**
 *
 * @author isaac
 */
public enum Nivel {
    
    PRINCIPIANTE(4,4), INTERMEDIO(4,8), AVANZADO(8,8);
    
    private final int filas;
    private final int columnas;

    private Nivel(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
    
    public int getCantidadCartas(){
        return filas*columnas;
    }
    
    public int getCantidadParejas(){
        return getCantidadCartas()/2;
    }
}
