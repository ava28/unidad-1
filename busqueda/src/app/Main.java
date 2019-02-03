
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Sales> venta = new ArrayList<Sales>();
    static double dato;

    public static void main(String[] args) {

        int monto = 100;
        Sales sales;

        for (int i = 0; i < monto; i++) {
            int m = random(0, 13);
            sales = new Sales(agregar(m), m, randomd(0, 1001));//Se crea una nueva venta
            venta.add(sales);//Se agrega la venta
        }
        System.out.println(venta.size());
        System.out.println("venta desordenadas");
        for (Sales detalle : venta) {
            System.out.println(detalle);
        }
        
        System.out.println("ventas ordenadas");
        burbuja();
        for (Sales detalle : venta) {
            System.out.println(detalle);
        }

        System.out.print("\nIntroduce el valor que deseas buscar(double): ");

        dato = sc.nextDouble();

        int resp = binarySearch(0, monto);

        if (resp != -1) {
            System.out.println("El valor si se encuentra.");
            System.out.println(venta.get(resp));
        } else {
            System.out.println("El valor no se encuentra.");
        }
    }

    //  Busqueda binaria
    public static int binarySearch(int L, int R) {
        if (R >= L) {
            int M = L + (R - L) / 2;
            if (venta.get(M).getValor() == dato) {
                return M;
            }
            if (venta.get(M).getValor() > dato) {
                return binarySearch(L, --M);
            }
            return binarySearch(++M, R);
        }
        return -1;
    }

    //  Ordena por valor
    public static void burbuja() {
        int aux;
        Sales temp = new Sales();
        
        for (int i = 0; i < venta.size(); i++) {
            temp = new Sales(venta.get(i).getDia(), venta.get(i).getMes(), venta.get(i).getValor());
            for (int j = 0; j < venta.size(); j++) {
                if (temp.getValor()>venta.get(i + 1).getValor()) {
                    aux= (int) temp.getValor();
                    temp=venta.get(i+1);
                    
                    
                    
                    
                }
            }
        }
    }

    public static int random(int x, int y) {
        return (int) (Math.abs(Math.floor(Math.random() * (x - y + 1) + y)));
    }

    public static double randomd(int x, int y) {
        return (double) (Math.abs(Math.floor(Math.random() * (x - y + 1) + y)));
    }

    public static int agregar(int mes) {
       if(mes==1 || mes ==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
           return random(0,32);       
       else if(mes==4 || mes ==6 || mes==9 || mes==11)
           return random(0, 31);
       else 
           return random(0, 29);
       
        }
    
}
