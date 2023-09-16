import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    public class RectaTest {
        @Test
        public void test1() {
            String result = Recta.recta(2, 4, 4, 8);
            assertEquals("y = 2.0x + 0.0", result);
        }
        @Test
        public void test2() {
            String result1 = Recta.recta(3, 3, 3, 3);
            assertEquals("Pendiente indefinida ", result1);
        }
        @Test
        public void test3() {
            String result2 = Recta.recta(-2, -4, -4, -8);
            assertEquals("y = 2.0x + 0.0", result2);
        }
    }