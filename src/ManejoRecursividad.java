import java.util.Arrays;

public class ManejoRecursividad {

    /**
     * Ejecuta una búsqueda recursiva en un arreglo para encontrar el valor X en un arreglo.
     * @param arreglo de números a evaluar.
     * @param x es el valor a encontrar.
     * @param indice es la posición actual en el arreglo.
     * @return El índice en donde se encuentra el arreglo, -1 si no lo encontró.
     */
    public int encontrarValorArreglo(int[] arreglo, int x, int indice) {
        if (indice >= arreglo.length) {
            return -1;
        }
        if (arreglo[indice] == x) {
            return indice;
        }

        return encontrarValorArreglo(arreglo, x, indice + 1);
    }

    /**
     * Metodo el cual usa la recursividad para obtener
     * cual es el valor más grande de un arreglo
     * @param arreglo Arreglo de numeros a revisar
     * @return Valor más grande encontrado en el arreglo
     */
    public int obtenerValorMayorArreglo(int[] arreglo) {
        if (arreglo.length == 1) {
            return arreglo[0];
        } else {
            int[] arregloRecortado = Arrays.stream(arreglo).skip(1).toArray();
            int valorAComparar = obtenerValorMayorArreglo(arregloRecortado);
            return arreglo[0] > valorAComparar ? arreglo[0] : valorAComparar;
        }
    }

    /**
     * Metodo el cual usa la recursividad para contar
     * la cantidad de orejas de un grupo de conejos
     * @param numeroConejos Numero que contamos
     * @return Suma de la cantidad de orejas de cada conejo
     */
    public int contarOrejas(int numeroConejos) {
        if (numeroConejos == 0) {
            return numeroConejos;
        } else {
            return contarOrejas(numeroConejos - 1) + 2;
        }
    }

    /**
     * Metodo el cual usa la recursividad para obtener la
     * suma de todos los números encontrados en una cadena.
     * @param cadena Cadena en la que se buscará cada digito
     * @return Suma de los digitos que se encontrarón en la cadena
     */
    public int obtenerSumaDigitosCadena(String cadena) {
        if (cadena.isEmpty()) return 0;
        else {
            String cadenaRecortada = cadena.substring(1);
            char primerCaracterCadena = cadena.charAt(0);
            return ((primerCaracterCadena - 48 >= 0 && primerCaracterCadena - 48 <= 9)
                    ? (primerCaracterCadena - 48) : 0) + obtenerSumaDigitosCadena(cadenaRecortada);
        }
    }






}