/**
 *
 *@author David Parra
 *@author Kelvin Carreño
 *
 **/

/*Primero importamos la librería para poder utilizar el comando Scanner más adelante */
import java.util.Scanner;

public class calculadora {

    /*Inicializamos el Scanner con el que vamos a realizar la lectura de los datos.*/
	private static Scanner reader;

	    /*Separamos en funciones para simplificar el código y hacerlo más legible*/
        /*Creamos una función para cada operación separandolo del Main*/
	    public static double suma(double op1, double op2) {
            
        return op1+op2;
        
        }
        public static double resta(double op1, double op2) {
            
        return op1-op2;
        
        }
        public static double multiplicacion(double op1, double op2) {

        return op1*op2;

    }
        public static double division(double op1, double op2) {

        return op1/op2;

        }
        public static double raiz(double op1,double op2) {
		/*Java tiene la clase Math donde contiene metodos para realizar operaciones matematicas del cual utilizaremos algunas operaciones */

		return Math.pow(op1,1/op2);/*Para hacer la raiz al no haber ninguna función establezco que el exponente es 1/op2*/
	}
	    public static double potencia(double op1, double op2) {
		
		return Math.pow(op1,op2);
	}
        public static double logaritmo (double op1, double op2) {

        return Math.log(op2) / Math.log(op1); /*Establecemos un algoritmo para que realice el logaritmo de cualquier base */
    }
        public static double leer (String s){
	        /*Creamos la función leer para evitar que el usuario introduzca cualquier caracter que no sea numérico*/
            boolean OnlyNumbers;
            double number = 0;
            do {
                OnlyNumbers = false;
                try {
                    System.out.println(s);
                    number = reader.nextDouble();
                } catch (Exception ex) {
                    System.out.println("Solo admite carácteres numéricos");
                    reader.nextLine();
                    OnlyNumbers = true;
                }
            } while (OnlyNumbers);
            return number;
        }
        public static int leer_Int (String s){ /*Necesitamos otra función leer debido a que la función factorial solo se admiten numeros enteros*/
        boolean OnlyNumbers;
        int number = 0;
        do {
            OnlyNumbers = false;
            try {
                System.out.println(s);
                number = reader.nextInt();
            } catch (Exception ex) {
                System.out.println("El factorial solo admite número entero no negativo.");
                reader.nextLine();
                OnlyNumbers = true;
            }
        } while (OnlyNumbers);
        return number;
    }
        public static int factorial (int op3) {

            if (op3==0)
                return 1;
            else
                return op3 * factorial(op3-1);
        }


    public static void main(String[] args) {
        /*Inicializamos las variables para que no de errores en la pedida al usuario*/
        /*Inicializamos variable OP3 como Int para dedicarla a la función factorial puesto que no existe los factoriales de números decimales*/
        double op1 = 0;
        double op2 = 0;
        int op3 = 0;
        double resultado = 0;
        boolean OnlyNumbers = false;
        int opcion;

        /*Creamos un Scanner para dar valor a las variables a través del usuario*/
        reader = new Scanner(System.in);
        /*Creamos un pequeño interfaz para que el usuario pueda seleccionar una operación con claridad*/
        System.out.println("\n"
                + "  +--------------------------------------------------+\n"
                + "  |   1: Suma                                        |\n"
                + "  |   2: Resta                                       |\n"
                + "  |   3: Multiplicación                              |\n"
                + "  |   4: División                                    |\n"
                + "  |   5: Raíz         (1º:Radicando,2º:Índice)       |\n"
                + "  |   6: Potencia     (1º:Base,2º:Exponente)         |\n"
                + "  |   7: Logaritmo    (1º:Base,2º:Argumento)         |\n"
                + "  |   8: Factorial                                   |\n"
                + "  +--------------------------------------------------+");
        System.out.print("     Introduce el numero de la operación deseada: ");
        opcion = reader.nextInt();
        /*Separamos el caso 8, para dedicarlo a el factorial y lea su numero entero y sus funciones dedicadas*/
        if (opcion == 8) {
            op3 = leer_Int("Introduce el primer operando:");


        } else {
            op1 = leer("Introduce el primer operando");


            op2 = leer("Introduce el segundo operando: ");
        }

        /*Creamos un switch para dar valor a resultado en función de la operación que escriba*/
        switch (opcion) {
            case 1:
                resultado = suma(op1, op2); /*Llamada a las funciones de la operación*/
                break;
            case 2:
                resultado = resta(op1, op2);
                break;
            case 3:
                resultado = multiplicacion(op1, op2);
                break;
            case 4:/*Se soluciona el problema de dividir entre 0*/
                if (op2 != 0) {
                    resultado = division(op1, op2);
                } else {
                    System.out.println("El segundo operando no puede ser 0");
                    System.exit(0);
                }
                break;
            case 5: /*Se soluciona el problema de introducir índices pares con radicandos negativos*/
                if (op2 % 2 == 0) {
                        if (op1 >= 0) {
                        resultado = raiz(op1, op2);
                    }   else {
                        System.out.println("No existen las raices con índice par de numeros negativos");
                        System.exit(0);
                    }
                    } else {
                        resultado = raiz(op1, op2);
                    }
                    break;
                    case 6:
                        resultado = potencia(op1, op2);
                        break;
                    case 7: /*Se soluciona el problema de introducir en el argumento un 0 o un número negativo*/
                        if (op2 > 0) {
                            resultado = logaritmo(op1, op2);
                        } else {
                            System.out.println("El segundo operando no puede ser 0 o menor.");
                            System.exit(0);
                        }
                        break;
                    case 8:/*Se soluciona el problema de introducir numeros negativos*/
                        if (op3 >= 0) {
                            resultado = factorial(op3);
                        } else {
                            System.out.println("No existe el factorial de números negativos.");
                            System.exit(0);}
                        break;
                    /*Si el usuario no introduce una operación que se encuentre en el switch se muestra por pantalla un mensaje y termina el programa*/
                    default:
                        System.out.println("Solo puedes introducir numeros del 1-8");
                        return;


                }
                /*Imprimimos resultado*/
                System.out.println("El resultado es " + resultado);
        }

}
