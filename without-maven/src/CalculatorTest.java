import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    Calculator c= new Calculator();
    @Test
    public void testAdd(){
        assertEquals(10,c.add(5,5));
    }
}
