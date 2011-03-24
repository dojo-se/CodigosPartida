// Esqueleto de código de teste Java, utilizando JUnit4, para uso no Dojo-SE
// Escrito por Wagner Luís de Araújo Menezes Macêdo <wagnerluis1982@gmail.com>.

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CodigoBaseTest {
    
    private CodigoBase codigoBase = new CodigoBase();

    @Test
    public void testSimples() {
        assertEquals(true, codigoBase.problemaParaResolver());
    }
}
