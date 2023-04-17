
package br.edu.ifsul.mavenproject4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumerosTest {
    private Numeros x;
    public NumerosTest() {
        x = new Numeros();
                }
   

    @org.junit.jupiter.api.Test
    public void testSuma() {
        assertEquals(3, x.suma(1,2));
        
    }

   @org.junit.jupiter.api.Test
    public void testEsPar() {
        assertEquals(true, x.esPar(8));
    }
    
    @org.junit.jupiter.api.Test
    public void testEsCuadrado() {
        assertEquals(100, x.areaCuadrado(10));
    }
    
    @org.junit.jupiter.api.Test
    public void testEsDivisible() {
        assertTrue(x.esDivisible(4,2));
        
    }
}
