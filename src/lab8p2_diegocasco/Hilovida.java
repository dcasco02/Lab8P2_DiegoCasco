/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegocasco;

import javax.swing.JProgressBar;

/**
 *
 * @author dcasc
 */
public class Hilovida extends Thread {
    private JProgressBar barra;
    private boolean avanzar;

    public Hilovida(JProgressBar barra, boolean avanzar) {
        this.barra = barra;
        this.avanzar = true;
    }

    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    @Override
    public void run(){
        while(avanzar){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                    avanzar=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
