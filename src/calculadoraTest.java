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
    public void testResta_ValoresPositivos_Resta() {

        Assert.assertEquals(1.0, calculadora.resta(3,2), 0.0001);
    }
    @Test
    public void testResta_Infinito() {

        Assert.assertEquals(0, calculadora.resta(-Double.MAX_VALUE,-Double.MAX_VALUE), 0.0001);
    }



}