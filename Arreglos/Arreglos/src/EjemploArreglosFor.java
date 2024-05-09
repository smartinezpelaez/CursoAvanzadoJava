import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;
        productos[0] = "jabon";
        productos[1] = "Crema";
        productos[2] = "shampoo";
        productos[3] = "toallas";
        productos[4] = "listerine";
        productos[5] = "seda dental";
        productos[6] = "trapos";

        Arrays.sort(productos); // Organiza el arreglo por orden alfabetico

        System.out.println("====Usando For====");
        for (int i =0 ; i <= total-1; i++)
        {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("====Usando Forech====");

        for (String prod : productos) 
        {
            System.out.println("prod = " + prod);   
        }

        System.out.println("====Usando While====");
        int i =0;
        while ( i < total)
        {
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("====Usando do While====");
        int j =0;
        do
        {
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }
        while ( j < total);






        int[] numeros = new int[10];

    }
}
