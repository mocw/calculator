import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.lodz.uni.math.Calculator;

import static org.junit.Assert.*;

public class Tests {

    private Calculator k;

    @BeforeClass
    public void setUp(){
        k = new Calculator();
    }

    @Test
    public void addTwoNumbersTest() {
        assertEquals(4,k.dodaj(2,2),0.001);
    }


}
