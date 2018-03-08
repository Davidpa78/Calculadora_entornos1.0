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
        public static double logaritmo (double op1, double op2) {

        return Math.log(op2) / Math.log(op1); /*Establecemos un algoritmo para que realice el logaritmo de cualquier base */
    }
        public static double leer (String s){
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
        public static double factorial (double op1) {

            if (op1==0)
                return 1;
            else
                return op1 * factorial(op1-1);
        }


    public static void main(String[] args) {
                /*Inicializamos las variables para que no de errores en la pedida al usuario*/
            double op1 = 0;
            double op2 = 0;
            double resultado = 0;
            boolean OnlyNumbers = false;
            int opcion;

            /*Creamos un Scanner para dar valor a las variables a través del usuario*/
            reader = new Scanner(System.in);

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


                if(opcion == 8){
                op1=leer("Introduce el primer operando:");


                }
                else {
                    op1= leer("Introduce el primer operando");


                    op2 = leer("Introduce el segundo operando: ");
                }

            /*Creamos un switch para dar valor a resultado en función de la operación que escriba*/
            switch (opcion){
                case 1:resultado=suma(op1,op2); /*Llamada a las funciones de la operación*/
                break;
                case 2:resultado=resta(op1,op2);
                break;
                    case 3:resultado=multiplicacion(op1,op2);
                    break;
                    case 4:
                        if (op2 !=0){
                             resultado=division(op1,op2); }
                        else {
                             System.out.println("El segundo operando no puede ser 0");
                             System.exit(0);}
                    break;
                    case 5: if (op2 >=0) {
                                if (op1 >=0){
                                    resultado=raiz(op1,op2);
                                            }
                                else {
                                     System.out.println("En una raiz, el radicando no puede ser negativo ");
                                     System.exit(0);}
                                      }
                             else {
                             System.out.println("El índice no puede ser cero o negativo");
                             System.exit(0);}
                    break;
                    case 6:resultado=potencia(op1,op2);
                    break;
                    case 7:resultado=logaritmo(op1,op2);
                    break;
                    case 8:resultado=factorial(op1);
                        break;
                    /*Si el usuario no introduce una operación que se encuentre en el switch se muestra por pantalla un mensaje y termina el programa*/
                    default:
                    System.out.println("Solo puedes introducir numeros del 1-8");
                    return;


            }
            /*Imprimimos resultado*/
            System.out.println("El resultado es "+resultado);
    }

}
