package pl.lodz.uni.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator k;

    @Before
    public void setUp() throws Exception {
        k = new Calculator();
    }

    @Test
    public void dodaj() {
        assertEquals(4,k.dodaj(2,2),0.001);
        assertEquals(-18,k.dodaj(-4,-14),0.001);
        assertEquals(0,k.dodaj(-1,1),0.001);
    }

    @Test
    public void odejmij() {
        assertEquals(8,k.odejmij(12,4),0.001);
        assertEquals(4,k.odejmij(-7,-11),0.001);
        assertEquals(-6,k.odejmij(-3,3),0.001);
    }

    @Test
    public void pomnoz() {
        assertEquals(50,k.pomnoz(10,5),0.001);
        assertEquals(-1,k.pomnoz(-1,1),0.001);
        assertEquals(50,k.pomnoz(10,5),0.001);
    }

    @Test
    public void podziel() {
        assertEquals(6,k.podziel(12,2),0.001);
        assertEquals(-1,k.podziel(-2,2),0.001);
        assertEquals(1,k.podziel(-2,-2),0.001);
        assertEquals(3.5,k.podziel(7,2),0.001);
       

       // assertEquals(0,k.podziel(2,0),0.001);
    }
}