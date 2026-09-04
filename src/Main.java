import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ManejoRecursividad recursividad = new ManejoRecursividad();

        Random rnd = new Random();
        int[] arreglo = new int[rnd.nextInt(12)];
        String cadena = "{";
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(1, 50);
            if (i == arreglo.length-1) cadena += arreglo[i];
            else cadena += arreglo[i] + ", ";
        }

        int[] numeros = {55, 25, 2, 8, 67, 40};
        int x = 8;

//        System.out.println("Teniendo el siguiente arreglo de números: " + Arrays.toString(numeros));
//        int indiceEncontrado = recursividad.encontrarValorArreglo(numeros, x, 0);
//
//        System.out.println("El valor " + x + " se encuentra en el índice: " + indiceEncontrado);

        //System.out.println("El mayor valor de este arreglo " + cadena + "} es el siguiente: " + recursividad.obtenerValorMayorArreglo(arreglo));

        for (int i = 0; i < 10; i++) {
            int conejos = rnd.nextInt(1, 25);
            //System.out.println("Contando el número de orejas de " + conejos + " conejos: " + recursividad.contarOrejas(conejos) + " orejas.");
        }

        String cad = "prueba";
        char c1 = 'b';
        char c2 = 'a';
        System.out.println("Usando la cadena (" + cad + "), ¿" + c1 + " aparece inmediatamente antes de " + c2 + "?");
        System.out.println(recursividad.encontrarPrimerChar(cad, c1, c2));

        //cadena = "Vivo en el número 1365, calle Benito Juarez";

        //System.out.println("La suma de digitos encontrado en la cadena '" + cadena + "' es de: " + recursividad.obtenerSumaDigitosCadena(cadena));
    }
}