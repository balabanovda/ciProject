import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void shouldCreateDefaultArrayTest() {
        assertEquals(Main.isBigger(10,5), true);
    }

}
