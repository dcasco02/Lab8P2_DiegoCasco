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
public class Jugador {
    private ArrayList<Item>items = new ArrayList();
    private ArrayList<Mascotas> mascot = new ArrayList();
    private int dinero;
    private int dinerobank;

    public Jugador(int dinero, int dinerobank) {
        this.dinero = 0;
        this.dinerobank = 0;
    }

    public Jugador() {
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Mascotas> getMascot() {
        return mascot;
    }

    public void setMascot(ArrayList<Mascotas> mascot) {
        this.mascot = mascot;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDinerobank() {
        return dinerobank;
    }

    public void setDinerobank(int dinerobank) {
        this.dinerobank = dinerobank;
    }

    @Override
    public String toString() {
        return "Jugador{" + "items=" + items + ", mascot=" + mascot + ", dinero=" + dinero + ", dinerobank=" + dinerobank + '}';
    }
    
}
