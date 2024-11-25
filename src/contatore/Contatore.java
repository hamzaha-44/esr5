/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contatore;

/**
 *
 * @author moham
 */
public class Contatore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class Contatore {
    private int valore;

    public Contatore() {
        this.valore = 0;
    }

    public void incrementa() {
        valore++;
    }

    public void decrementa() {
        valore--;
    }

    public int getValore() {
        return valore;
    }
}