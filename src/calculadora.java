import java.util.Scanner;


public class calculadora {
	
	private static Scanner reader;
	
	public static double raiz(double op1,double op2) {
		
		return Math.pow(op1,1/op2);
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

        reader = new Scanner(System.in);
       


        System.out.println("Introduce el primer operando(Potencias: Base , Raices: Radicando):");
        op1 = reader.nextDouble();

        System.out.println("Introduce el segundo operando(Potencias: Exponente , Raices: Índice):");
        op2 = reader.nextDouble();
        System.out.println("Introduce el nombre de una operación: ");
        
        switch (reader.next()){
        	case"raiz":resultado=raiz(op1,op2);
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
            default:
                System.out.println("Operacion no reconocida");
                return;
      

        }

        System.out.println("El resultado es "+ resultado);




    }

}
