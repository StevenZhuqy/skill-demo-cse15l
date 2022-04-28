import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void testGetSum() {
        int[] arr = {1, 2, 3};
        assertEquals(6, SkillDemo.getSum(arr));
    }
}
