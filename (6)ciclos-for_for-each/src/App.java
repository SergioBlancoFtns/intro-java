public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("El valor de i es: " + i);
        }

        String[] frutas = {"manzana", "banana", "pera"};

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
