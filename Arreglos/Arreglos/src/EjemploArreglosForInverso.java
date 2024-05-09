import java.util.Arrays;

public class EjemploArreglosForInverso {

    public static void main(String[] args) {
        //Asignacion vieja formar
       // String[] productos = new String[7];
        /*  productos[0] = "jabon";
        productos[1] = "Crema";
        productos[2] = "shampoo";
        productos[3] = "toallas";
        productos[4] = "listerine";
        productos[5] = "seda dental";
        productos[6] = "trapos";*/


        String[] productos = {"jabon","Crema","shampoo","toallas","listerine","seda dental","trapos" };
        int total = productos.length;


        Arrays.sort(productos); // Organiza el arreglo por orden alfabetico

        System.out.println("====Usando For====");
        for (int i =0 ; i <= total-1; i++)
        {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("====Usando For a la inversa====");

       for (int i = 0; i < total; i++){
           System.out.println("Para i = " +(total-1-i) + " valor : " + productos[total-1-i]);
       }

        System.out.println("====Usando For a la inversa 2 ====");
       for (int i = total - 1; i>=0; i--){
           System.out.println("Para i = " + i + " valor : " + productos[i]);
       }

    }
}
