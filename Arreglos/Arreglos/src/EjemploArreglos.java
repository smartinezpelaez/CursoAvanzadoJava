import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "jabon";
        productos[1] = "Crema";
        productos[2] = "shampoo";
        productos[3] = "toallas";
        productos[4] = "listerine";
        productos[5] = "seda dental";
        productos[6] = "trapos";

        Arrays.sort(productos); // Organiza el arreglo por orden alfabetico

        String prod1 = productos[0] ;
        String prod2 = productos[1] ;
        String prod3 = productos[2] ;
        String prod4 = productos[3] ;
        String prod5 = productos[4] ;
        String prod6 = productos[5] ;
        String prod7 = productos[6] ;

        System.out.println("producto[0] = " + prod1 );
        System.out.println("producto[1] = " + prod2 );
        System.out.println("producto[2] = " + prod3);
        System.out.println("producto[3] = " + prod4);
        System.out.println("producto[4] = " + prod5 );
        System.out.println("producto[5] = " + prod6);
        System.out.println("producto[6] = " + prod7);



        int[] numeros = new int[4];
        numeros [0] =25;
        numeros [1] = 23;
        numeros [2] = 2;
        numeros [3] = 4;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];

        System.out.println("I = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
