
public static void main(String[] args) {
    ManejoRecursividad recursividad = new ManejoRecursividad();


    int conejos = 10;

    System.out.println("Tengo 10 conejos, y estos tienen " + recursividad.contarOrejas(conejos) + " orejas.");
    int[] arreglo = {1,5,34,5,6,9};
    String cadena = "{";
    for (int i = 0; i < arreglo.length; i++) {
        cadena += arreglo[i] + ", ";
    }

    System.out.println("El mayor valor de este arreglo " + cadena + "} es el siguiente: " + recursividad.obtenerValorMayorArreglo(arreglo));

}