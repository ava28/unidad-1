
package App;
import java.util.Scanner;


public class Convertidor {
    public static void main(String[] args) {
        long n;
     Scanner sc=new Scanner(System.in);
        System.out.print("Escribe el numero que quieres convertir: ");
        n=sc.nextInt();   
        System.out.println(binario(n," "));
        System.out.println(hexadecimal(n,""));
}
  
    public static String binario(long n,String bin){
        if (n==0){
            return bin;
        }else{
            bin=(n % 2)+bin;
            return binario(n/2, bin);
        }
    }
    public static String hexadecimal(long n, String hexa) {
        if (n == 0) {
            return hexa;
        } else {
            Long temp = (n % 16);
            if (temp == 10) {
                hexa = 'A' + hexa;
            } else if (temp == 11) {
                hexa = 'B' + hexa;
            } else if (temp == 12) {
                hexa = 'C' + hexa;
            } else if (temp == 13) {
                hexa = 'D' + hexa;
            } else if (temp == 14) {
                hexa = 'E' + hexa;
            } else if (temp == 15) {
                hexa = 'F' + hexa;
            } else {
                hexa = (n % 16) + hexa;
            }
            return hexadecimal(n / 16, hexa);
        }
    }    
}
