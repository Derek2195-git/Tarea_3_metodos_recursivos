import java.util.Arrays;

public class ManejoRecursividad {


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
            System.out.println(primerCaracterCadena - 48);
            return ((primerCaracterCadena - 48 >= 0 && primerCaracterCadena - 48 <= 9)
                    ? (primerCaracterCadena - 48) : 0) + obtenerSumaDigitosCadena(cadenaRecortada);
        }
    }






}