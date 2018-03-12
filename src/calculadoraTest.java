
/*Importamos las librerias de Testing. Nosotros hemos utilizado Junit 4.10 para la realización de las mismas*/
import org.junit.Assert;
import org.junit.Test;


public class calculadoraTest {

  /* Vamos a realizar las pruebas de todas las operaciones que contiene la calculadora una por una */


    /*SUMA: Limites,Valor 0 y Valores en el rango*/

    @Test
    public void testSuma_ValoresPositivos() {

        Assert.assertEquals(5.0, calculadora.suma(3,2), 0.0001);
    }

    @Test
    public void testSuma_ValorNegativo() {

        Assert.assertEquals(-3.0, calculadora.suma(-5,2), 0.0001);
    }

    @Test
    public void testSuma_Valor0() {

        Assert.assertEquals(2.0, calculadora.suma(0,2), 0.0001);
    }

    @Test
    public void testSuma_DesbordamientoArriba() {

        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.suma(Double.MAX_VALUE,Double.MAX_VALUE), 0.0001);
    }

    @Test
    public void testSuma_DesbordamientoAbajo() {

        Assert.assertEquals(Double.NEGATIVE_INFINITY, calculadora.suma(-Double.MAX_VALUE,-Double.MAX_VALUE), 0.0001);
    }

    @Test
    public void testSuma_ValoresDecimales() {

        Assert.assertEquals(8.55, calculadora.suma(3.33,5.22), 0.0001);
    }



    /*RESTA: Limites,Valor 0, Valores en el rango y Valores que se anulen */

    @Test
    public void testResta_ValoresPositivos() {

        Assert.assertEquals(1.0, calculadora.resta(3,2), 0.0001);
    }

    @Test
    public void testResta_ValorNegativoOp1() {

        Assert.assertEquals(-7.0, calculadora.resta(-3,4), 0.0001);
    }

    @Test
    public void testResta_ValorNegativoOp2() {

        Assert.assertEquals(7.0, calculadora.resta(3,-4), 0.0001);
    }

    @Test
    public void testResta_Valor0() {

        Assert.assertEquals(3.0, calculadora.resta(3,0), 0.0001);
    }

    @Test
    public void testResta_Valor_0_en_op2() {

        Assert.assertEquals(-3.0, calculadora.resta(0,3), 0.0001);
    }

    @Test
    public void testResta_Infinito() {

        Assert.assertEquals(0, calculadora.resta(-Double.MAX_VALUE,-Double.MAX_VALUE), 0.0001);
    }

    @Test
    public void testResta_DesbordamientoAbajo() {

        Assert.assertEquals(Double.NEGATIVE_INFINITY, calculadora.resta(-Double.MAX_VALUE,Double.MAX_VALUE), 0.0001);
    }

    @Test
    public void testResta_DesbordamientoArriba() {

        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.resta(Double.MAX_VALUE,-Double.MAX_VALUE), 0.0001);
    }

    @Test
    public void testResta_ValoresDecimales() {

        Assert.assertEquals(1.60, calculadora.resta(4.85, 3.25), 0.0001);
    }



    /*MULTIPLICACIÓN: Limites,Valor 0 y Valores en el rango */

    @Test
    public void testMultiplicación_ValoresPositivos() {

        Assert.assertEquals(6.0, calculadora.multiplicacion(3,2), 0.0001);
    }

    @Test
    public void testMultiplicación_ValorNegativo() {

        Assert.assertEquals(-10.0, calculadora.multiplicacion(-5,2), 0.0001);
    }

    @Test
    public void testMultiplicación_Valor0() {

        Assert.assertEquals(0.0, calculadora.multiplicacion(0,2), 0.0001);
    }

    @Test
    public void testMultiplicación_DesbordamientoArriba() {

        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.multiplicacion(Double.MAX_VALUE,Double.MAX_VALUE), 0.0001);
    }

    @Test /*Conmutativa*/
    public void testMultiplicación_DesbordamientoAbajo() {

        Assert.assertEquals(Double.NEGATIVE_INFINITY, calculadora.multiplicacion(-Double.MAX_VALUE,Double.MAX_VALUE), 0.0001);
    }

    @Test
    public void testMultiplicación_ValoresDecimales() {

        Assert.assertEquals(15.7625, calculadora.multiplicacion(4.85, 3.25), 0.0001);
    }



    /*DIVISIÓN: Valor 0(Numerador,Denominador), Valores en el rango y Valores que se anulen = 1*/

    @Test
    public void testDivisión_ValoresPositivos() {

        Assert.assertEquals(5.0, calculadora.division(10,2), 0.0001);
    }

    @Test
    public void testDivisión_ValorNegativo() {

        Assert.assertEquals(-3.0, calculadora.division(-6,2), 0.0001);
    }

    @Test
    public void testDivisión_Valor0() {

        Assert.assertEquals(0.0, calculadora.division(0,2), 0.0001);
    }

    @Test/*Esto es un error matematico en la calculadora hemos establecido un if para que si el usuario introduce un 0 en el op2(divisor) salga un mensaje de texto y no se ejecute*/
    public void testDivisión_Valor0op2() {

        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.division(2,0), 0.0001);
    }


    @Test
    public void testDivisión_Igual1() {

        Assert.assertEquals(1, calculadora.division(Double.MAX_VALUE,Double.MAX_VALUE), 0.0001);
    }

    @Test
    public void testDivisión_Igual1negativo() {

        Assert.assertEquals(-1, calculadora.division(-Double.MAX_VALUE,Double.MAX_VALUE), 0.0001);
    }
    @Test
    public void testDivisión_ValoresDecimales() {

        Assert.assertEquals(1.509259259259259, calculadora.division(6.52, 4.32), 0.0001);
    }



    /*POTENCIAS: Limites, Valor 0y1, Valores en el rango tanto positivos como negativos ya que varia en la realización de la potencia*/

    @Test
    public void testPotencia_ValoresPositivos() {

        Assert.assertEquals(25, calculadora.potencia(5,2), 0.0001);
    }

    @Test
    public void testPotencia_ValorNegativo() {

        Assert.assertEquals(0.25, calculadora.potencia(2,-2), 0.0001);
    }

    @Test
    public void testPotencia_ValoresNegativo_op2() {

        Assert.assertEquals(4, calculadora.potencia(-2,2), 0.0001);
    }

    @Test
    public void testPotencia_DesbordamientoArriba() {

        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.potencia(Double.MAX_VALUE,2), 0.0001);
    }

    @Test /*Establecemos un número impar para que salga un infinito negativo puesto que si no saldria positivo*/
    public void testPotencia_DesbordamientoAbajo() {

        Assert.assertEquals(-Double.POSITIVE_INFINITY, calculadora.potencia(-Double.MAX_VALUE,3), 0.0001);
    }

    @Test
    public void testPotencia_Valor1() {

        Assert.assertEquals(5.0, calculadora.potencia(5,1), 0.0001);
    }

    @Test
    public void testPotencia_Valor0() {

        Assert.assertEquals(1.0, calculadora.potencia(7,0), 0.0001);
    }

/*FACTORIAL: Limites (en este caso existe un StackOverFlow en el Límite superior que muestra un mensaje de error),Valor 0 y Valores en el rango*/
    @Test
        public void testFactorial_ValoresPositivos() {

        Assert.assertEquals(6.0, calculadora.factorial(3), 0.0001);
    }
    @Test
    public void testFactorial_Valor0() {

        Assert.assertEquals(1.0, calculadora.factorial(0), 0.0001);
    }

/**    @Test: No se puede calcular el factorial de un numero negativo, por lo tanto hemos establecido un mensaje de error en la calculadora.

    public void testFactorial_ValorNegativo() {

        Assert.assertEquals("M.ERROR", calculadora.factorial(-5), 0.0001);
    }
**/

/**    @Test: Mensaje de StackOverFlow
        public void testFactorial_DesbordamientoArriba() {


        Assert.assertEquals('STACKOVERFLOW', calculadora.factorial(Integer.MAX_VALUE), 0.0001);
    }

/** @Test   Esperamos un mensaje de error, debido a que no se existen factoriales de numeros negativos

public void testFactorial_DesbordamientoAbajo() {

Assert.assertEquals("M.ERROR", calculadora.factorial(-Double.MAX_VALUE), 0.0001);
}

 **/
/**   @Test Esperamos un mensaje de error, ya que no se puede calcular el factorial de un número con decimales

    public void testFactorial_ValoresDecimales() {

        Assert.assertEquals("M.ERROR", calculadora.factorial(3.33), 0.0001);
    }
**/


/*LOGARITMO: Limite Superior,Valor 0 en ambos operandos y Valores en el rango (numeros negativos en ambos operandos)*/

    @Test
    public void testLogaritmo_ValoresPositivos() {

    Assert.assertEquals(2.0, calculadora.logaritmo(10,100), 0.0001);

    }

    @Test
    public void testLogaritmo_Valor0enop1() {

        Assert.assertEquals(0, calculadora.logaritmo(0,20), 0.0001);

    }

    @Test
    public void testLogaritmo_Valor0enop2() {

        Assert.assertEquals(Double.NEGATIVE_INFINITY, calculadora.logaritmo(20,0), 0.0001);

    }

    @Test
    public void testLogaritmo_ValoresDecimales() {

        Assert.assertEquals(1.0272301212626898, calculadora.logaritmo(12.6,13.5), 0.0001);

    }

    @Test
    public void testLogaritmo_DesbordamientoArriba() {

        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.logaritmo(Double.MAX_VALUE,Double.POSITIVE_INFINITY), 0.0001);

    }

    @Test
    public void testLogaritmo_Igual1() {

        Assert.assertEquals(1, calculadora.logaritmo(10,10), 0.0001);

    }

    @Test
    public void testLogaritmo_ValorNegativoOp1() {

        Assert.assertEquals(Double.NaN, calculadora.logaritmo(-2,13.5), 0.0001);

    }

    @Test
    public void testLogaritmo_ValorNegativo0p2() {

        Assert.assertEquals(Double.NaN, calculadora.logaritmo(12,-5), 0.0001);

    }
    /*RAIZ:Valor 0 y Valores en el rango(Tratamos en este apartado Numeros impares pares pasitivos y negativos en distintas posiciones ya que tiene muchas expcepciones)*/

    @Test
    public void testRaiz_ValoresPositivos() {

        Assert.assertEquals(1.732050808, calculadora.raiz(3,2), 0.0001);
    }

    @Test
    public void testRaiz_OP1NegativoOP2Impar() {

        Assert.assertEquals(-5, calculadora.raiz(-5,1), 0.0001);
    }
/**
    @Test: No existen las raices con índice par de números negativos
    public void testRaizOP1NegativoOP2Par() {

        Assert.assertEquals("M.ERROR", calculadora.raiz(-5,2), 0.0001);
    }
**/

    @Test
    public void testRaiz_OP2NegativoOP1Par() {

        Assert.assertEquals(0.5, calculadora.raiz(8,-3), 0.0001);
    }


     @Test
     public void testRaizOP2NegativoOP1Impar() {

     Assert.assertEquals(0.5, calculadora.raiz(4,-2), 0.0001);
     }

 @Test
    public void testRaiz_OP1Valor0() {

        Assert.assertEquals(0.0, calculadora.raiz(0,2), 0.0001);
    }

/**
    @Test: La raiz índice 0 no existe.
    public void testRaiz_OP2Valor0() {

        Assert.assertEquals("M.ERROR", calculadora.raiz(2,0), 0.0001);
    }
**/

}