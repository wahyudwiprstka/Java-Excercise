import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    Addition obj = new Addition();

    @Test
    void testAdd() {
        int result = obj.add(5, 2);
        assertEquals(7, result);
    }
}