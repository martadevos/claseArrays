package FuncionesArrays;

import java.util.Arrays;

public class Funciones {
    public static int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};


    public static void main(String[] args) {

        //Arrays.fill(nombreArray, valor) rellena un array
        int[] array = new int[5];
        Arrays.fill(array, 2);
        System.out.println(Arrays.toString(array));

        //Arrays.tostring(nombreArray) muestra los valores del array entre corchetes
        int[] arraytoString = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arraytoString));

        //Arrays.equals(nombreArray1, nombreArray2) develve true si son iguales y false si no*/
        int[] array1equals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2equals = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.equals(array1equals, array2equals));

       //Arrays.binarySearch(nombreArray, valorABuscar) busca un valor dentro de un array
        int[] arrayBinarySearch = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.binarySearch(arrayBinarySearch, 5));/*Si encuentra el valor
                                                                devuelve su posición*/

        System.out.println(Arrays.binarySearch(arrayBinarySearch, 50));/*si no, muestra el lugar
                                                                que ocuparía -1 en negativo*/

        System.out.println(Arrays.binarySearch(arrayBinarySearch, 1, 5, 2));/*Poniendo
                                                                un rango podemos vuscar el valor
                                                                solo en un tramo del array*/

        //Arrays.copyOf(nombreArrayACopiar, longitudDeLaCopia) copia un array en otro la longitud que elijamos
        int[] arrayCopyOf = Arrays.copyOf(arrayBinarySearch, 3);
        System.out.println(Arrays.toString(array));

        //Para insertar un valor nuevo a un array desordenado, insertarlo al final si cabe; para uno ordenado:
        int[] arrayInsertar = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println(arrayInsertar.length);
        int i = (-Arrays.binarySearch(arrayInsertar, 5) - 1);
        if (arrayInsertar.length - 1 - i >= 0) {
            System.arraycopy(arrayInsertar, i,
                    arrayInsertar, i + 1,
                    arrayInsertar.length - 1 - i);
        }
        arrayInsertar[-Arrays.binarySearch(arrayInsertar, 5) - 1] = 5;
        System.out.println(Arrays.toString(arrayInsertar));

        //ordenar un array desordenado
        int[] arrayOrdenar= {1, 3, 2, 9, -10, 6};
        Arrays.sort(arrayOrdenar);
        System.out.println(Arrays.toString(arrayOrdenar));

        //Borrar un elemento de un array ordenado
        int x = Arrays.binarySearch(arrayOrdenar, -10);
        System.out.println(x);
        if (arrayOrdenar.length - 1 - x >= 0) {
            System.arraycopy(arrayOrdenar, x + 1,
                    arrayOrdenar, x,
                    arrayOrdenar.length - 1 - x);
        }
        int[] arrayBorrar = Arrays.copyOf(arrayOrdenar, arrayOrdenar.length-1);
        System.out.println(Arrays.toString(arrayBorrar));

    }
}
