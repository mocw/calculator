package pl.lodz.uni.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator k;
    private static final double PRECISION = 0.001;

    @Before
    public void setUp() throws Exception {
        k = new Calculator();
    }

    @Test
    public void dodaj() {
        assertEquals(4,k.dodaj(2,2),PRECISION);
        assertEquals(-18,k.dodaj(-4,-14),PRECISION);
        assertEquals(0,k.dodaj(-1,1),PRECISION);
    }

    @Test
    public void odejmij() {
        assertEquals(8,k.odejmij(12,4),PRECISION);
        assertEquals(4,k.odejmij(-7,-11),PRECISION);
        assertEquals(-6,k.odejmij(-3,3),PRECISION);
    }

    @Test
    public void pomnoz() {
        assertEquals(50,k.pomnoz(10,5),PRECISION);
        assertEquals(-1,k.pomnoz(-1,1),PRECISION);
        assertEquals(50,k.pomnoz(10,5),PRECISION);
    }

    @Test
    public void podziel() {
        assertEquals(6,k.podziel(12,2),PRECISION);
        assertEquals(-1,k.podziel(-2,2),PRECISION);
        assertEquals(1,k.podziel(-2,-2),PRECISION);
        assertEquals(3.5,k.podziel(7,2),PRECISION);
    }

    @Test
    public void podniescDoPotegi() {
        assertEquals(4,k.podniescDoPotegi(2,2),PRECISION);
        assertEquals(0.5,k.podniescDoPotegi(2,-1),PRECISION);
        assertEquals(1.4142,k.podniescDoPotegi(2, (float) 0.5),PRECISION);
    }

    @Test
    public void pierwiastek() {
        assertEquals(2,k.pierwiastekKwadratowy(4),PRECISION);
        assertEquals(2.236,k.pierwiastekKwadratowy(5),PRECISION);
        assertEquals(0,k.pierwiastekKwadratowy(0),PRECISION);
    }

    @Test(expected = ArithmeticException.class)
    public void pierwiastekZLiczbUjem() {
        assertEquals(2,k.pierwiastekKwadratowy(-4),PRECISION);
        assertEquals(2.236,k.pierwiastekKwadratowy(-5),PRECISION);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        k.podziel(1,0);
    }

}