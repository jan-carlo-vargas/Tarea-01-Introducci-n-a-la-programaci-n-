//Esta importación se utiliza para poder detectar los datos que ingresa el usuario en main()
import java.util.Scanner;
//Clase principal y única del código que se está trabajando, esta no cuenta con atributos propios y tiene solo dos métodos
public class CalculadoraTrigonométrica {
    //Este es el método main que se ejecuta al correr el programa, solicita los datos al usuario y devuelve el calculo realizado
    public static void main(String[] args) {
        //Se define entrada, que actua como un input en Python por asú decirlo, más adelante se cierra por sugerencia del editor de texto
        Scanner entrada = new Scanner(System.in);
        System.out.println("Defina la unidad angular a utilizar, podrá cambiarla más adelante");
       //Se utlizan D y R para las unidades por convención, pues así suelen aparecer en las calculdaras físicas 
        System.out.println("Introduzca D para grados y R para radianes");
        char unidad = entrada.next().charAt(0);
        entrada.nextLine();
        System.out.println("Introduzca la función que desea usar");
        String funcion = entrada.nextLine();
        System.out.println("Introduzca el ángulo en la unidad elegida");
        Double angulo = entrada.nextDouble();
        // Aquí se llama a la función que calcula con las variables que el usuario ingresó como variables
        Double resultado = Calcular(funcion,unidad,angulo);
        System.out.println ("Resultado: " + resultado);
        entrada.close();




    }
    //Método que realiza el calculo principal, recibe un string con la función que se desea usar, un caracter que define si se trabaja en grados o radianes y el ángulo que se desea calcular como tal
    public static double Calcular(String Función, char Unidad, double ángulo) {
        //Este primer switch evalua que unidad angular se va a trabjar, Math en java siempre usa radianes, así que en el caso de que se ingresen grados se usa el método que los convierte a radianes antes de llamar a los métodos de math
        switch (Unidad) {
            case 'D':
                double rad = Math.toRadians(ángulo);
                //Switch que evalua las diferentes funciones que puede usar la calculadora y comprueba si se ingresó alguna, de lo contrario retorna 0 para cumplir con el requisito de una clase double y indica el error 
                switch (Función) {
                    case "sen":
                        return Math.sin(rad);
                    case "cos":
                        return Math.cos(rad);
                    case "tan":
                        return Math.tan(rad);
                    case "senh":
                        return Math.sinh(rad);
                    case "cosh":
                        return Math.cosh(rad);
                    case "tanh":
                        return Math.tanh(rad);
                    case "arcsen":
                        return Math.asin(rad);
                    case "arccos":
                        return Math.acos(rad);
                    case "arctan":
                        return Math.atan(rad);
                    default:
                        System.out.println("La función solicitada no se encuentra");
                        return 0;
                }
            case 'R':
                 switch (Función) {
                    case "sen":
                        return Math.sin(ángulo);
                    case "cos":
                        return Math.cos(ángulo);
                    case "tan":
                        return Math.tan(ángulo);
                    case "senh":
                        return Math.sinh(ángulo);
                    case "cosh":
                        return Math.cosh(ángulo);
                    case "tanh":
                        return Math.tanh(ángulo);
                    case "arcsen":
                        return Math.asin(ángulo);
                    case "arccos":
                        return Math.acos(ángulo);
                    case "arctan":
                        return Math.atan(ángulo);
                    default:
                        System.out.println("La función solicitada no se encuentra");
                        return 0;
                }
            default:
            System.out.println("No se definió unidad angular");    
            return 0;
                
            }
        
    }
}