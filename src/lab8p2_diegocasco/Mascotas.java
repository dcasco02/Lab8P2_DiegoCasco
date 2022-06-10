/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegocasco;

import java.awt.Color;

/**
 *
 * @author dcasc
 */
public class Mascotas {
    private String nombre;
    private int puntosvida;
    private int delay;
    private int costo;
    private Color color;

    public Mascotas() {
    }

    public Mascotas(String nombre, int puntosvida, int delay, int costo, Color color) {
        this.nombre = nombre;
        this.puntosvida = puntosvida;
        this.delay = delay;
        this.costo = costo;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosvida() {
        return puntosvida;
    }

    public void setPuntosvida(int puntosvida) {
        this.puntosvida = puntosvida;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
