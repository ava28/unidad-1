
package multiplicacionmatriz;


public class random {
    
    //Este es el metodo encargado de hacer que la matriz de numero random en sus filas y columnas 
   
     public Matriz fill(int n, int m, Matriz temp) {
        for (int i = 0; i < temp.getFila(); i++) {
            for (int j = 0; j < temp.getColumna(); j++) {
                temp.getArreglo()[temp.getFila()* j + i] = (long) Math.abs(Math.floor(Math.random() * (n - m + 1) + m));
            }
        }
        return temp;
    }
     //Este metodo se encarga de imprimis las matrices
       public void print(Matriz a) {
        for (int i = 0; i < a.getFila(); i++) {
            for (int j = 0; j < a.getColumna(); j++) {
                System.out.print(a.getArreglo()[a.getFila()* j + i] + "\t");
            }
            System.out.println("");
        }
    }
}
