public class App {
    public static void main(String[] args) throws Exception {
        
        byte byteVariable = 100;

        byte byteVariable2 = 100;

        //se debe hacer un casteo porque no se pueden sumar valores de tipo byte o short
        byte overratedByte = (byte) (byteVariable + byteVariable2);

        System.out.println(overratedByte);

        short shortVariable, shortVariable2, overratedShort;

        shortVariable = 110;
        shortVariable2 = 32767;

        overratedShort = (short) (shortVariable + shortVariable2);

        System.out.println(overratedShort);

        String stringVariable = "Soy un string";

        System.out.println("El string: " + stringVariable);
    }
}
