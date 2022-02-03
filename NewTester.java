import static org.junit.Assert.*;
import org.junit.*;

public class NewTester{
    @Test 
    public void test_add_two_ints(){
        assertEquals(3, New.add_two_ints(2, 1));
    }
}
