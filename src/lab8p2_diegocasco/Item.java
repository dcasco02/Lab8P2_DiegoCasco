/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegocasco;

/**
 *
 * @author dcasc
 */
public class Item {
    private String nombre;
    private boolean Alimento;
    private int probobtener;
    private int precioventa;

    public Item() {
    }

    public Item(String nombre, boolean Alimento, int probobtener, int precioventa) {
        this.nombre = nombre;
        this.Alimento = Alimento;
        this.probobtener = probobtener;
        this.precioventa = precioventa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlimento() {
        return Alimento;
    }

    public void setAlimento(boolean Alimento) {
        this.Alimento = Alimento;
    }

    public int getProbobtener() {
        return probobtener;
    }

    public void setProbobtener(int probobtener) {
        this.probobtener = probobtener;
    }

    public int getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(int precioventa) {
        this.precioventa = precioventa;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
