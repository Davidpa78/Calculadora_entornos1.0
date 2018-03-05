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
    public void testSuma() {

        Assert.assertEquals(5.0, calculadora.suma(3,2), 0.0001);
    }
    @Test
    public void testResta() {
    }
}