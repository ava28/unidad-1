package multiplicacionmatriz;
import java.util.Scanner;

public class MultiplicacionMatriz {
//Variables para las matrices, instancia a random y un scanner para que el usuario digite 
    //las columnas y las filas
    public static Matriz m1, m2, m3;
    public static Scanner in = new Scanner(System.in);
    public static random random = new random();
    
    
    public static void main(String[] args) {
        datos();
    }

    /*Aqui hacemos un menu donde le pedira al usuario las dimensiones de la matriz 1 y 2  */
    public static void datos() {
        System.out.println("Ingrese las filas de la primer mátriz: ");
        int f1 = in.nextInt();
        System.out.println("Ingrese las columnas de la primer mátriz: ");
        int c1 = in.nextInt();
        System.out.println("Ingrese las filas de la segunda mátriz: ");
        int f2 = in.nextInt();
        System.out.println("Ingrese las columnas de la segunda mátriz: ");
        int c2 = in.nextInt();
        
        //Tenemos una expecion para hacer que la matriz sea valida 
        if (c1 != f2) {
            System.out.println("Inserte una matriz valida");
            datos();
        }
        //Guardamos los valores de las filas y columnas y obtenemos las filas y columnas 
        m1 = new Matriz(f1, c1);
        m2 = new Matriz(f2, c2);
        m3 = new Matriz(m1.getFila(), m2.getColumna());
       
       /*Aqui se hace que la matriz 1 y 2 impriman sus valores de manera aleatoria entro los valores 1-10 
       Mediante el metodo fill dentro de la clase random*/ 
           m1 =random.fill(1, 10, m1);
           m2 =random.fill(1, 10, m2);
           
        m3 = Multiply(m1, m2);
        System.out.println("Matriz 1");
        random.print(m1);
        System.out.println("Matriz 2");
        random.print(m2);
        System.out.println("Multiplicacion de las Matrices");
        random.print(m3);


    }
 /*Metodo para la multiplicacion de matrices, Donde hacemos que la matriz 1 
 Multiplique sus filas y columnas con la Matriz 2 todo dentro de la matriz unidemnsional */
    public static Matriz Multiply(Matriz mat1, Matriz mat2) {
        for (int i = 0; i < mat1.getFila(); i++) {
            for (int j = 0; j < mat2.getColumna(); j++) {
                for (int k = 0; k < mat1.getColumna(); k++) {
                    m3.getArreglo()[(m3.getFila() * j) + i]
                            += (mat1.getArreglo()[(mat1.getFila() * k) + i])
                            * (mat2.getArreglo()[(mat2.getFila() * j) + k]);
                }
            }
        }
        return m3;
    }

    
    
    
}
