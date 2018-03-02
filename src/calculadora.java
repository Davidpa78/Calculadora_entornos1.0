import java.util.Scanner;


public class calculadora {
	
	private static Scanner reader;

	/*Separamos en funciones para simplificar el código y hacerlo más legible*/

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
		
		return Math.pow(op1,1/op2);/*Para hacer la raiz al no haber ninguna función establezco que el exponente es 1/op2*/
	}
	public static double potencia(double op1, double op2) {
		
		return Math.pow(op1,op2);
	}

     
        public static void main(String[] args) {

        double op1;
        double op2;
        double resultado;

        /*Creamos un Scanner para dar valor a las variables a través del usuario*/
        reader = new Scanner(System.in);
       


        System.out.println("Introduce el primer operando:");
        op1 = reader.nextDouble();

        System.out.println("Introduce el segundo operando:");
        op2 = reader.nextDouble();
        System.out.println("Introduce el numero de la operación deseada: \n"
                + "1: Suma\n"
                + "2: Resta\n"
                + "3: Multiplicación\n"
                + "4: Divión\n"
                + "5: Raíz\n"
                + "6: Potencias\n");

        /*Creamos un switch para dar valor a resultado en función de la operación que escriba*/
        switch (reader.next()){
        	case"1":resultado=suma(op1,op2); /*Llamada a las funciones de la operación*/
        	break;
        	case"2":resultado=resta(op1,op2);
        	break;
                case"3":resultado=multiplicacion(op1,op2);
                break;
                case"4":resultado=division(op1,op2);
                break;
                case"5":resultado=raiz(op1,op2);
                break;
                case"6":resultado=potencia(op1,op2);
                break;
                /*Si el usuario no introduce una operación que se encuentre en el switch se muestra por pantalla un mensaje y termina el programa*/
            default:
                System.out.println("Solo puedes introducir numeros del 1-6");
                return;
      

        }
        /*Imprimimos resultado*/
        System.out.println("El resultado es "+ resultado);

// Errores a modificar 
//Poner un limite de caracteres y restriccion de caracteres alfabéticos
//No se puede dividir entre 0  , op2 =/ 0
//Raiz op1 no puede ser negativo, y op2 solo puede tomar valores >1



    }

}
