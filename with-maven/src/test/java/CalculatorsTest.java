import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.Calculators;
public class CalculatorsTest {
    Calculators c= new Calculators();
    @Test
    public void testSubtract(){
        assertEquals(10,c.subtract(20,10));
    }
}
