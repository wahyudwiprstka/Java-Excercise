import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTesting {
    Arithmetic a = new Arithmetic();
    int result;
    @Test
    void additionTest(){
        result = a.addition(5, 15);
        assertEquals(20, result);
    }
    @Test
    void substractionTest(){
        result = a.substraction(23, 5);
        assertEquals(18, result);
    }
    @Test
    void multiplicationTest(){
        result = a.multiplication(7, 6);
        assertEquals(42, result);
    }
    @Test
    void divisionTest(){
        float result = a.division(8, 4);
        assertEquals(2, result);
    }
    @Test
    void modulusTest(){
        result = a.modulus(8, 4);
        assertEquals(0, result);
        result = a.modulus(8, 3);
        assertEquals(2, result);
    }
}
