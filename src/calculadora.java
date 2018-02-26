import java.util.Scanner;

public class calculadora {

    public static int suma(int op1, int op2) {

      return op1+op2;

    }
    public static int resta(int op1, int op2) {

        return op1-op2;

    }

    public static int multiplicacion(int op1, int op2) {

        return op1*op2;

    }
    public static int division(int op1, int op2) {

        return op1/op2;

    }

    public static void main(String[] args) {

        int op1;
        int op2;
        int resultado;

        Scanner reader = new Scanner(System.in);


        System.out.println("Introduce el primer número:");
        op1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        op2 = reader.nextInt();

        System.out.println("Introduce el nombre de una operación: ");
        switch (reader.next()){
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
