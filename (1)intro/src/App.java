import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Console c = System.console();

        System.out.println(c.toString());

        System.out.println("Ingrese una cadena de caracteres");
        String input = c.readLine();

        System.out.println("Una forma de input " + input);

        Scanner s = new Scanner(System.in);

        System.out.println("""
            Ingrese otra cadena de caracteres 
            """);
        String input2 = s.nextLine();

        s.close();

        System.out.println("otra forma de input " + input2);

        String a = "que";

        String b = "más";

        String mS = """
                Ey %s %s
                """;

        System.out.printf(mS, a, b);
    }
}
