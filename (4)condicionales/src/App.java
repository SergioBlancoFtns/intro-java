public class App {
    public static void main(String[] args) throws Exception {
        int numero = 10;

        if (numero > 0) {
            System.out.println("El número es positivo.");
        }

        numero = -5;

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo o cero.");
        }

        numero = 0;

        if (numero > 0) {
          System.out.println("El número es positivo.");
        } else if (numero < 0) {
          System.out.println("El número es negativo.");
        } else {
          System.out.println("El número es cero.");
        }
    }
}
