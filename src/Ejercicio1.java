/* Generar e imprimir la tabla de multiplicar de un nmero ingresado por teclado hasta un numero n tambien ingresado
 * por el usuario
 *
 * ALGORTIMO!
 * 1. Pedir un número de la tabla de multiplicar.
 * 2. Pedir un número hasta que numero.
 * 3. Mostrar
 * */

//Importando la clase Scanner del paquete java.util . La clase Scanner nos permite leer la entrada del usuario por consola.
import java.util.Scanner;

/*¿Qué es una clase? son como plantillas-moldes que a partir de ellas se crean objetos.
-public = modificador de acceso que indica que es accesible descde cualquier parte del programa.
-class = se utiliza para definir una clase.
-nombre de la clase = debe comenzar con letra mayuscula y son sustantivos en singular o plural.
-Cuerpo de la clase = se encuentran los atributos, metodos*/
public class Ejercicio1 {
    public static void main(String[] args ){
        /*-¿Que significa static? (statico)
*Static y el metodo main: El metodo estatico pertence a la clase en lugar de a una instancia de la clase.
* No necesito crear un objeto de la clase para invocar el metodo main.
          -¿Que significa el void?
* El metodo main no devuelve ninguna valor. No produce resultado que pueda ser utilizado en otras parte del programa.
          -¿Que significa (Strings[] args)
* () -> contienen los parametros del metodo. args=parametro
* Strings[] -> Indica que args(parametro) es un arreglo de cadenas Strings. Cada elemento en este arreglo es una cadena.
* ¿Para que se utiliza? -> Cuando ejecutas un programa de Java desde la linea de comandos , puedes proporcionar argumen-
* tos adicionales despues del nombre del programa. Ej: Ejcuto MiPrograma arg1 arg2 esos valores se almacen en el arreglo
* args. */
        //Creación de una instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Paso 1: Pedir el número de la tabla
        System.out.println("Ingresa un numero para la tabla de multiplicar");
        int numeroDeTabla = scanner.nextInt();

        //Paso 2: Pedir el numero n
        System.out.println("Ingresar el valor de n (hasta que número quieres de la tabla): ");
        int n = scanner.nextInt();

        //Paso 3: Mostrar la tabla de multiplicar
        for (int i=1; i<=n; i++){
            int resultado = numeroDeTabla * i;
            System.out.println(numeroDeTabla + "x" + i + " = " + resultado);
        }

        scanner.close();
    }



}
