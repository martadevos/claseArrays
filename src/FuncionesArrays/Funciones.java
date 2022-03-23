package FuncionesArrays;

import java.util.Arrays;

public class Funciones {
    public static int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int[] array3 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array1));/*Arrays.tostring(nombreArray) muestra los valores
                                                     del array entre corchetes*/
        System.out.println(Arrays.equals(array1, array2));/*Arrays.equals(nombreArray1, nombreArray2) muestra
                                                           si dos arrays son iguales (develve true si lo son
                                                           y false si no)*/
        System.out.println(Arrays.binarySearch(array1, 5));/*Arrays.equals(nombreArray, valorABuscar) busca
                                                                un valor dentro de un array, si lo encuentra
                                                                devuelve su posición*/
         System.out.println(Arrays.binarySearch(array1, 50));/*si no lo encuentra, muestra un valor negativo
                                                                  (el valor que ocuparía si se insertara
                                                                  en positivo y -1)*/
        System.out.println(Arrays.binarySearch(array1, 1, 5, 2));/*Se puede hacer una
                                                                  búsqueda en un rango de posiciones del array
                                                                  con Arrays.binarySearch(nombreArray,
                                                                  inicioDelRango, finDelRango, valorABuscar)*/
        //Para insertar un valor nuevo a un array desordenado, insertarlo al final si cabe; para uno ordenado:
        int[] array4 = Arrays.copyOf(array3, array3.length+1);
        System.out.println(array4.length);
        if (array4.length - 1 - (-Arrays.binarySearch(array4, 5) - 1) >= 0) {
            System.arraycopy(array4, -Arrays.binarySearch(array4, 5) - 1, array4, -Arrays.binarySearch(array4, 5), array4.length - 1 - (-Arrays.binarySearch(array4, 5) - 1));
        }
        array4[-Arrays.binarySearch(array4, 5) - 1] = 5;
        System.out.println(Arrays.toString(array4));

for (int i = array4.length-1; i>-Arrays.binarySearch(array4, 5) - 1)

    }
}
