import com.mycompany.checknumber.CheckNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yaiza
 */
public class CheckNumberTest {
    
    public CheckNumberTest() {
    }

    @Test
    public void testPositiu() {
        double num = 2.5;
        double result = CheckNumber.retornar(num);
        assertEquals(1,result);
    }
    
    @Test
    public void testNegatiu() {
        double num = -1.5;
        double result = CheckNumber.retornar(num);
        assertEquals(-1,result);
    }
    
    @Test
    public void testZero() {
        double num = 0;
        double result = CheckNumber.retornar(num);
        assertEquals(0,result);
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
}
