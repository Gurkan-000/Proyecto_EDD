
package Modelo;

/**
 *
 * @author RODRIGO
 */
public class Tienda {
    
    private int indice;
    private String[] juego = {"Deep Rock","Counter Strike","Rust","Sky","R.E.P.O","Palword","Peak"};
    private double[] precio = {33.0,5.0,25.0,44.0,15.0,63.0,11};

    public String getJuego(){
        return juego[indice];
    }
    
    public double getPrecio(){
        return precio[indice];
    }
    
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
}
