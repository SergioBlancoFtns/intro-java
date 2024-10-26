import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;

        while (contador < 5) {
          System.out.println("El valor de contador es: " + contador);
          contador++;
        }

        int numero;

        do {
          System.out.println("Introduce un número positivo: ");
          numero = new Scanner(System.in).nextInt();
        } while (numero <= 0);
        
        System.out.println("Gracias por introducir un número positivo.");
    }
}
