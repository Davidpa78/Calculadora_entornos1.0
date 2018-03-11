import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculadoraTest {

    @Before
    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

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
    /*RESTA*/

    @Test
    public void testResta_ValoresPositivos() {

        Assert.assertEquals(1.0, calculadora.resta(3,2), 0.0001);
    }
    @Test
    public void testResta_ValorNegativo() {

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

/*Multiplicación*/

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
    /*División*/


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

}