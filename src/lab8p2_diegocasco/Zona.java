/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegocasco;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Zona {
    private String nombre;
    private int probderrumbe;
    private int probataque;
    ArrayList <Item> items = new ArrayList();

    public Zona() {
    }

    public Zona(String nombre, int probderrumbe, int probataque) {
        this.nombre = nombre;
        this.probderrumbe = probderrumbe;
        this.probataque = probataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProbderrumbe() {
        return probderrumbe;
    }

    public void setProbderrumbe(int probderrumbe) {
        this.probderrumbe = probderrumbe;
    }

    public int getProbataque() {
        return probataque;
    }

    public void setProbataque(int probataque) {
        this.probataque = probataque;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
