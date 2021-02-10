import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class MainClass {
    /**
     * Se leerá un array bidimensional de enteros con la instrucción:
     * int[][] myArray = Internal.loadIntArray2D(input);
     * Y también se leerá un valor entero.
     * Se mostrará en pantalla el número de elementos
     * del array que son múltiplos del valor entero leído
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Se lee un array bidimensional de elementos de tipo int
        int[][] myArray = Internal.loadIntArray2D(input);

        // Se lee un valor de tipo int
        System.out.print("Escriba un valor entero: ");
        int value = input.nextInt();
        
        System.out.println("El resultado es: " + multiplos(myArray, value));
    }

    // Método que debe completar
    public static int multiplos(int[][] myArray, int value) {
        int count = 0;
        // Se calcula cuántos elementos del parámetro myArray son múltiplos
        // del parámetro value
        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
                if (myArray[i][j] % value == 0){
                    count += 1;
                }                
            }
        }
        return count;
    }
}
