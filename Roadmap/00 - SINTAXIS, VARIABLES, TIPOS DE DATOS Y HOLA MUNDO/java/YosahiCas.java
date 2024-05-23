/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

public class Ejercicio00 {
public static void main (String [] args ) {
    // Pagina Oficual de Java: https://www.java.com/es/
    /* Comentario 1 
      Comentatios en varias lineas 
      Permite comentar en diferente lineas hasta cerrar
      con un astwerisco y barra de forma inversa. 
    */


  // Declaracion de variable
  int Variable1 = 1;
  Variable1 = 4;
  System.out.println(Variable1);

  // Declaracion de constante
    /* Para ello es recomendable iniciar al principio la constante
      tener que definirla con la palabra "final" */
  final int AREA = 15;
  System.out.println (AREA);

  //Ejemplos de datos primitivos. 
  int entero = 12;
  float  decimal = (float)1.5265F;
  double deicmal2 = 15.56654654;
  String palabras= "Mi nombre es Yos";
  char letraB = 'B';
  boolean verdadero = true;
  boolean falso = false;
  
  System.out.println("Hola, Java!!"); 

  
}
  
}

