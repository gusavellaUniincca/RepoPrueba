
import java.util.Scanner;
public class hola {
    public static void main(String[] args) {
        float Base = 0, Altura = 0;
        int e = 3, f = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar base:");
        Base = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingresar altura:");
        Altura = Float.parseFloat(scanner.nextLine());
        System.out.println("Area rectangulo: " + (Base * Altura));
        System.out.println("Perimetro de rectangulo: " + ((Base + Altura) * 2));
        System.out.println("resultados:e= " + e + "f:" + f);
        f = ++e;
        System.out.println("resultados:e= " + e + "f:" + f);
        String cadena1 = "hola";
        String cadena2 = "hola";
        System.out.println("compara cadenas: " + cadena1.equals(cadena2));

        //
    } 
}
