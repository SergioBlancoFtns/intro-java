import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int x = 5;
        int y = ++x; // x se incrementa a 6, y se asigna el valor 6
        System.out.println("x: " + x + ", y: " + y); // Imprime "x: 6, y: 6"

        int a = 5;
        int b = a++; // b se asigna el valor 5, a se incrementa a 6
        System.out.println("a: " + a + ", b: " + b); // Imprime "a: 6, b: 5"


        String consolacion = "Lo siento, sigue practicando tu aritmética. La respuesta es ";
        
        System.out.println("Digite su nombre");
        Scanner sc = new Scanner(System.in);
        
        String nombre = sc.nextLine();
        System.out.println("Bienvenido/a " + nombre);

        int num1 = 4;
        int num2 = 44;

        System.out.println("Probemos tus habilidades matemáticas ¿cuánto es " + num1 + " + " + num2 + " ?");

        int rta = sc.nextInt();

        int suma = num1 + num2;

        String rtaMachine = suma == rta ?
                            "Perfecto has acertado en tu respuesta"
                            : consolacion + suma;

        System.out.println(rtaMachine);

        int num3 = 20;

        System.out.println("¿Cuál sería el resultado si se le suma " + num3 + " a " + suma + " ?");

        int rta2 = sc.nextInt();

        suma += num3;

        rtaMachine = suma == rta2 ?
                    "Has acertado"
                    : consolacion + suma;

        System.out.println(rtaMachine);

        num3 = 8;

        System.out.println("¿Cuál sería el resultado si se le resta " + suma + " a " + num3 + " ?");

        suma -= num3;

        int rta3 = sc.nextInt();

        rtaMachine = suma == rta3 ?
                    "Has acertado"
                    : consolacion + suma;

        System.out.println(rtaMachine);

        num3 = 10;

        System.out.println("¿Cuál sería el resultado si se divide " + suma + " entre " + num3 + " ?");

        suma /= num3;

        int rta4 = sc.nextInt();

        rtaMachine = suma == rta4 ?
                    "Has acertado"
                    : consolacion + suma;

        System.out.println(rtaMachine);

        num3 = 9;

        System.out.println("¿Cuál sería el resultado si se multiplica " + suma + " por " + num3 + " ?");

        suma *= num3;

        int rta5 = sc.nextInt();

        rtaMachine = suma == rta5 ?
                    "Has acertado"
                    :consolacion + suma;

        System.out.println(rtaMachine);
        
        sc.close();    
    }
}