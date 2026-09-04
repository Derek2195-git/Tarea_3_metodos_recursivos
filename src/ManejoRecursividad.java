import java.util.Arrays;

public class ManejoRecursividad {
    // La mayoria de aqui menos la de conejos deben ser borrados
    public String serieN0(int n) {
        if (n == 0) {
            return n + "";
        } else {
            return String.valueOf(n) + ", " + serieN0(n-1);
        }

    }

    public String serie0N(int n) {
        if (n == 0) {
            return n + "";
        } else {
            return serie0N(n-1) + ", " + n;
        }
    }

    public String serieFibonacci(int n) {
        if (n == 0) {
            return String.valueOf(n);
        } else if (n == 2) {
            return serieFibonacci(1);
        } else {
            /**
             * 5 valores de la serie fibonacci
             * 0, 1, 1, 2, 3
             * 0 y 0
             * 0 y 1
             * serieFibonacci(1, 1+0)
             * 1 y 1
             * serieFibonacci(1, 1+1)
             * 1 y 2
             * serieFibonacci(2, 2+1)
             * 2 y 3
             */

            return serieFibonacci(n-1) + " " + n;
        }
    }

    public int sumasSucesivas(int numero1, int numero2) {
        if (numero2 == 0) {
            return 0;
        } else {
            return numero1 + sumasSucesivas(numero1, numero2 - 1);
        }

    }

    // Acabada al parecer
    public int contarOrejas(int numeroConejos) {
        // Un conejo tiene 2 orejas
        // si no hay mas conejos, retornamos 0
        // Si hay más de un conejo, usamos recursividad
        if (numeroConejos == 0) {
            return numeroConejos;
        } else {
            return contarOrejas(numeroConejos - 1) + 2;
        }
    }

    public int obtenerValorMayorArreglo(int[] arreglo) {

        if (arreglo.length == 1) {
            return arreglo[0];
        } else {
            int[] arregloRecortado = Arrays.stream(arreglo).skip(1).toArray();
            int valorAComparar = obtenerValorMayorArreglo(arregloRecortado);
            return arreglo[0] > valorAComparar ? arreglo[0] : valorAComparar;
        }
    }






}