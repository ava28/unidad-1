
package multiplicacionmatriz;

public class Matriz {
   //variables para la fila, columna y arreglo  
    private int fila, columna;
    private long [] arreglo;

    public Matriz(int fil, int col) {
        this.fila = fil;
        this.columna = col;
        arreglo = new long[fil * col];
    }

//se retorna todo para usarlo en el Matriz y en random 
    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    
    public long[] getArreglo(){
        return arreglo;
    }

    
     public void setArreglo(long[] arreglo) {
        this.arreglo = arreglo;
    } 
    
   
}


