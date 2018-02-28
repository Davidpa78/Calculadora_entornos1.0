import java.util.Scanner;


public class calculadora {
	
	private static Scanner reader;

	/*Separamos en funciones para simplificar el código y hacerlo más legible*/

	public static double raiz(double op1,double op2) {
		
		return Math.pow(op1,1/op2);/*Para hacer la raiz al no haber ninguna función establezco que el exponente es 1/op2*/
	}

	public static double potencia(double op1, double op2) {
		
		return Math.pow(op1,op2);
	}

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

    public static void main(String[] args) {

        double op1;
        double op2;
        double resultado;

        /*Creamos un Scanner para dar valor a las variables a través del usuario*/
        reader = new Scanner(System.in);
       


        System.out.println("Introduce el primer operando(Potencias: Base , Raices: Radicando):");
        op1 = reader.nextDouble();

        System.out.println("Introduce el segundo operando(Potencias: Exponente , Raices: Índice):");
        op2 = reader.nextDouble();
        System.out.println("Introduce el nombre de una operación: ");

        /*Creamos un switch para dar valor a resultado en función de la operación que escriba*/
        switch (reader.next()){
        	case"raiz":resultado=raiz(op1,op2); /*Llamada a las funciones de la operación*/
        	break;
        	case"potencia":resultado=potencia(op1,op2);
        	break;
            case"suma":resultado=suma(op1,op2);
                break;
            case"resta":resultado=resta(op1,op2);
                break;
            case"multiplicacion":resultado=multiplicacion(op1,op2);
                break;
            case"division":resultado=division(op1,op2);
                break;
                /*Si el usuario no introduce una operación que se encuentre en el switch se muestra por pantalla un mensaje y termina el programa*/
            default:
                System.out.println("Operacion no reconocida");
                return;
      

        }
        /*Imprimimos resultado*/
        System.out.println("El resultado es "+ resultado);




    }

}
